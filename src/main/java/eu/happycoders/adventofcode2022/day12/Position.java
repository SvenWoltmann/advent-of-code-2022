package eu.happycoders.adventofcode2022.day12;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An X/Y position on the height map.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Position(int x, int y) {
  Position top() {
    return new Position(x, y - 1);
  }

  Position right() {
    return new Position(x + 1, y);
  }

  Position bottom() {
    return new Position(x, y + 1);
  }

  Position left() {
    return new Position(x - 1, y);
  }
}
