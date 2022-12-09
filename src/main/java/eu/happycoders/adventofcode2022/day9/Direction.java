package eu.happycoders.adventofcode2022.day9;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A direction into which the rope's head is pulled.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Direction {
  UP("U"),
  RIGHT("R"),
  DOWN("D"),
  LEFT("L");

  private final String indicator;

  Direction(String indicator) {
    this.indicator = indicator;
  }

  static Direction ofIndicator(String indicator) {
    for (Direction direction : Direction.values()) {
      if (direction.indicator.equals(indicator)) {
        return direction;
      }
    }
    throw new IllegalArgumentException("Invalid indicator: " + indicator);
  }
}
