package eu.happycoders.adventofcode2022.day17;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The direction a rock is pushed to (left or right).
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Direction {
  LEFT(-1),
  RIGHT(1);

  private final int deltaX;

  Direction(int deltaX) {
    this.deltaX = deltaX;
  }

  int deltaX() {
    return deltaX;
  }
}
