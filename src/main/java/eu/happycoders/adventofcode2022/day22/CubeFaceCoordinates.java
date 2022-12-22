package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Coordinates on a cube face.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record CubeFaceCoordinates(int faceId, int sideLength, Position position) {

  CubeFaceCoordinates transportTo(WormholeCoordinates target, Direction sourceDirection) {
    int numberClockwiseTurns = (target.side().ordinal() - sourceDirection.ordinal() + 6) % 4;

    Position newPosition = turnPositionOnCubeFace(numberClockwiseTurns);

    newPosition = mirrorPositionOnCubeFace(newPosition, target);

    return new CubeFaceCoordinates(target.cubeFaceId(), sideLength, newPosition);
  }

  private Position turnPositionOnCubeFace(int numberClockwiseTurns) {
    return switch (numberClockwiseTurns) {
      case 0 -> new Position(position.column(), position.row());
      case 1 -> new Position(flip(position.row()), position.column());
      case 2 -> new Position(flip(position.column()), flip(position.row()));
      case 3 -> new Position(position.row(), flip(position.column()));
      default -> throw new IllegalStateException();
    };
  }

  private Position mirrorPositionOnCubeFace(Position newPosition, WormholeCoordinates target) {
    return switch (target.side()) {
      case LEFT, RIGHT -> new Position(flip(newPosition.column()), newPosition.row());
      case UP, DOWN -> new Position(newPosition.column(), flip(newPosition.row()));
    };
  }

  private int flip(int newPosition) {
    return sideLength - 1 - newPosition;
  }
}
