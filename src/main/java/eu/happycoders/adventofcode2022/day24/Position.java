package eu.happycoders.adventofcode2022.day24;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A position on the valley map.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
@SuppressWarnings("PMD.ShortVariable") // x and y are OK!
record Position(int column, int row) {

  Position up() {
    return new Position(column, row - 1);
  }

  Position down() {
    return new Position(column, row + 1);
  }

  Position left() {
    return new Position(column - 1, row);
  }

  Position right() {
    return new Position(column + 1, row);
  }
}
