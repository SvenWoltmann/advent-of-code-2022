package eu.happycoders.adventofcode2022.day9;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The position of a rope knot.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
@SuppressWarnings("PMD.ShortVariable") // x and y are OK!
record Position(int x, int y) {

  Position moveTo(Direction direction) {
    return switch (direction) {
      case UP -> new Position(x, y - 1);
      case RIGHT -> new Position(x + 1, y);
      case DOWN -> new Position(x, y + 1);
      case LEFT -> new Position(x - 1, y);
    };
  }
}
