package eu.happycoders.adventofcode2022.day8;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A position consisting or a column and row index.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Position(int column, int row) {

  public Position moveTo(Direction direction) {
    return switch (direction) {
      case TOP -> new Position(column, row - 1);
      case RIGHT -> new Position(column + 1, row);
      case BOTTOM -> new Position(column, row + 1);
      case LEFT -> new Position(column - 1, row);
    };
  }
}
