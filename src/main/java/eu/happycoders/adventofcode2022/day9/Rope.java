package eu.happycoders.adventofcode2022.day9;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The rope, stored as list of its knots' positions.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Rope {

  private final Position[] positions;

  Rope(int length) {
    Position startPos = new Position(0, 0);

    positions = new Position[length];
    for (int i = 0; i < length; i++) {
      positions[i] = startPos;
    }
  }

  Position getTailPos() {
    return positions[positions.length - 1];
  }

  void moveHead(Direction direction) {
    positions[0] = positions[0].moveTo(direction);

    // Move all others
    for (int i = 1; i < positions.length; i++) {
      moveKnot(i);
    }
  }

  private void moveKnot(int knotIndex) {
    // Move know knotIndex so that it is not too far away from know knotIndex-1

    // Positions around the head we have to look at:
    // Only at the stars, we have to move the tail.
    // *****
    // *...*
    // *.H.*
    // *...*
    // *****

    Position knotPos = positions[knotIndex];
    Position previousKnotPos = positions[knotIndex - 1];

    // Distance at most 1 -> do nothing
    if (distanceIsAtMost(knotPos, previousKnotPos, 1)) {
      return;
    }

    // Distance 2 -> move
    if (distanceIsAtMost(knotPos, previousKnotPos, 2)) {
      if (knotPos.x() < previousKnotPos.x()) {
        knotPos = knotPos.moveTo(Direction.RIGHT);
      } else if (knotPos.x() > previousKnotPos.x()) {
        knotPos = knotPos.moveTo(Direction.LEFT);
      }

      if (knotPos.y() < previousKnotPos.y()) {
        knotPos = knotPos.moveTo(Direction.DOWN);
      } else if (knotPos.y() > previousKnotPos.y()) {
        knotPos = knotPos.moveTo(Direction.UP);
      }

      positions[knotIndex] = knotPos;
    } else {
      throw new IllegalStateException("Distance is higher than 2");
    }
  }

  private boolean distanceIsAtMost(Position knotPos, Position previousKnotPos, int maxDistance) {
    return knotPos.x() >= previousKnotPos.x() - maxDistance
        && knotPos.x() <= previousKnotPos.x() + maxDistance
        && knotPos.y() >= previousKnotPos.y() - maxDistance
        && knotPos.y() <= previousKnotPos.y() + maxDistance;
  }
}
