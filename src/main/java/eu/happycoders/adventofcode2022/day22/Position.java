package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A position on the board or on a cube face.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Position(int column, int row) {

  Position move(Direction direction) {
    return switch (direction) {
      case RIGHT -> new Position(column + 1, row);
      case DOWN -> new Position(column, row + 1);
      case LEFT -> new Position(column - 1, row);
      case UP -> new Position(column, row - 1);
    };
  }
}
