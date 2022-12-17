package eu.happycoders.adventofcode2022.day17;

import java.util.HashMap;
import java.util.Map;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The chamber being filled with rocks.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Chamber {

  // We have to take into account at least the top 5 rows to detect a recurring pattern. This leads
  // to the correct result for *my* puzzle input, but I can't say it's high enough for everyone.
  // You might try 100 ... it doesn't make the algorithm any slower.
  private static final int RECURRING_PATTERN_HEIGHT = 5;

  private final ChamberRows chamberRows = new ChamberRows();

  private final long maxRocks;
  private final Jets jets;

  private final Map<Pattern, TowerHeightAndNumberOfRocks> patterns = new HashMap<>();

  private Rock currentRock;
  private long numberOfRocks;
  private int highestRockRow = -1;
  private boolean repeatedPatternAlreadyFound;
  private long heightToAdd;

  Chamber(Jets jets, long maxRocks) {
    this.jets = jets;
    this.maxRocks = maxRocks;
  }

  void addRockAndLetItFall(RockShape rockShape) {
    addRock(rockShape);

    numberOfRocks++;

    while (currentRock != null) { // currentRock will be set to null when it reached the ground
      letJetOfGasPushRock();
      letRockFall();
    }
  }

  private void addRock(RockShape rockShape) {
    currentRock = new Rock(rockShape, highestRockRow + 4);
    chamberRows.checkIfEnoughRows(currentRock.topRow());
  }

  private void letJetOfGasPushRock() {
    Direction direction = jets.next();

    if (currentRock.couldBeMovedTo(direction)) {
      tryMoveBy(direction.deltaX(), 0);
    }
  }

  private void letRockFall() {
    if (tryMoveBy(0, -1)) {
      return;
    }

    manifestRock();
    currentRock = null;
  }

  private boolean tryMoveBy(int deltaX, int deltaY) {
    boolean bottomReached = currentRock.bottomRow() + deltaY < 0;
    if (bottomReached) {
      return false;
    }

    currentRock.moveBy(deltaX, deltaY);

    if (chamberRows.wouldFitAtItsCurrentPosition(currentRock)) {
      return true;
    } else {
      currentRock.undoLastMove();
      return false;
    }
  }

  private void manifestRock() {
    updateHighestRockRow();
    chamberRows.manifest(currentRock);
    tryToFindRepeatedPattern();
  }

  private void updateHighestRockRow() {
    if (currentRock.topRow() > highestRockRow) {
      highestRockRow = currentRock.topRow();
    }
  }

  private void tryToFindRepeatedPattern() {
    if (repeatedPatternAlreadyFound) {
      return;
    }

    Pattern pattern = calculatePattern();
    if (pattern == null) {
      return;
    }

    TowerHeightAndNumberOfRocks found = patterns.get(pattern);

    // First pattern found? Store and return.
    if (found == null) {
      patterns.put(pattern, new TowerHeightAndNumberOfRocks(getTowerHeight(), numberOfRocks));
      return;
    }

    // Repeated pattern found...
    repeatedPatternAlreadyFound = true;

    long numberOfRocksFallenInMeantime = numberOfRocks - found.numberOfRocks();
    long remainingRocks = maxRocks - numberOfRocks;

    // Skip forward...
    if (remainingRocks < numberOfRocksFallenInMeantime) {
      return;
    }

    long roundsToSkip = remainingRocks / numberOfRocksFallenInMeantime;

    remainingRocks = remainingRocks % numberOfRocksFallenInMeantime;
    numberOfRocks = maxRocks - remainingRocks;
    heightToAdd = (getTowerHeight() - found.towerHeight()) * roundsToSkip;
  }

  private Pattern calculatePattern() {
    if (highestRockRow < RECURRING_PATTERN_HEIGHT) {
      return null;
    }

    byte[] topRockPattern =
        chamberRows.getCopyOfRows(highestRockRow - RECURRING_PATTERN_HEIGHT, highestRockRow);

    return new Pattern(jets.index(), currentRock.shape(), topRockPattern);
  }

  long getTowerHeight() {
    return highestRockRow + 1 + heightToAdd;
  }

  long getNumberOfRocks() {
    return numberOfRocks;
  }

  @Override
  public String toString() {
    return new ChamberRenderer(chamberRows, currentRock, highestRockRow).render();
  }
}
