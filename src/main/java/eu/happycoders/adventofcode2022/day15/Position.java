package eu.happycoders.adventofcode2022.day15;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An X/Y position in the tunnel network.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
@SuppressWarnings("PMD.ShortVariable") // x and y are OK!
record Position(int x, int y) {

  int distanceTo(Position other) {
    return Math.abs(other.x() - x) + Math.abs(other.y() - y);
  }

  @Override
  public String toString() {
    return "x=%d, y=%d".formatted(x, y);
  }
}
