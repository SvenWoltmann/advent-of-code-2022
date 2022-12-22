package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The direction into which you face/walk.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Direction {
  RIGHT(0),
  DOWN(1),
  LEFT(2),
  UP(3);

  private final int number;

  Direction(int number) {
    this.number = number;
  }

  int number() {
    return number;
  }

  Direction clockwise() {
    int ordinal = (this.ordinal() + 1) % 4;
    return Direction.values()[ordinal];
  }

  Direction counterClockwise() {
    // +3 instead of -1 so that the result of the remainder operation doesn't get negative
    int ordinal = (this.ordinal() + 3) % 4;
    return Direction.values()[ordinal];
  }

  Direction flip() {
    return switch (this) {
      case RIGHT -> LEFT;
      case DOWN -> UP;
      case LEFT -> RIGHT;
      case UP -> DOWN;
    };
  }
}
