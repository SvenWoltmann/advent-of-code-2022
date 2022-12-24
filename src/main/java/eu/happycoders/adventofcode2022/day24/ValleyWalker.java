package eu.happycoders.adventofcode2022.day24;

import java.util.HashSet;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Algorithm for finding the shortest path through the valley.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ValleyWalker {

  private final ValleyMap valleyMap;

  ValleyWalker(ValleyMap valleyMap) {
    this.valleyMap = valleyMap;
  }

  int findFastestPath(int roundsToPlay) {
    Position currentTarget = valleyMap.targetPosition();

    Set<Position> startPositions = Set.of(valleyMap.startPosition());

    int minute = 1;
    while (true) {
      Set<Position> targetPositions = new HashSet<>();
      for (Position sourcePosition : startPositions) {
        Set<Position> targetPositionsFromHere = findTargetPositions(sourcePosition, minute);
        if (targetPositionsFromHere.contains(currentTarget)) {
          roundsToPlay--;
          if (roundsToPlay == 0) {
            return minute;
          }
          targetPositions = Set.of(currentTarget);
          currentTarget = determineNewTarget(currentTarget);
          break;
        }

        targetPositions.addAll(targetPositionsFromHere);
      }

      if (targetPositions.isEmpty()) {
        throw new AssertionError();
      }

      // In the next round, start at all possible targets of this round
      startPositions = targetPositions;
      minute++;
    }
  }

  private Position determineNewTarget(Position currentTarget) {
    if (currentTarget.equals(valleyMap.targetPosition())) {
      return valleyMap.startPosition();
    } else {
      return valleyMap.targetPosition();
    }
  }

  private Set<Position> findTargetPositions(Position currentPosition, int minute) {
    Set<Position> result = new HashSet<>();

    addIfPossibleTarget(currentPosition.up(), minute, result);
    addIfPossibleTarget(currentPosition.down(), minute, result);
    addIfPossibleTarget(currentPosition.left(), minute, result);
    addIfPossibleTarget(currentPosition.right(), minute, result);

    // Another option is to stay
    addIfPossibleTarget(currentPosition, minute, result);

    return result;
  }

  private void addIfPossibleTarget(Position position, int minute, Set<Position> result) {
    if (isPossibleTarget(position, minute)) {
      result.add(position);
    }
  }

  private boolean isPossibleTarget(Position position, int minute) {
    if (position.equals(valleyMap.startPosition()) || position.equals(valleyMap.targetPosition())) {
      return true;
    }

    if (!valleyMap.contains(position)) {
      return false;
    }

    return !valleyMap.isBlizzardAtMinute(position, minute);
  }
}
