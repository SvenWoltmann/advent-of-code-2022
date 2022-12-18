package eu.happycoders.adventofcode2022.day18;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single cube consisting of X, Y, and Z coordinates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
@SuppressWarnings("PMD.ShortVariable") // x, y, and z are OK!
record Cube(int x, int y, int z) {
  Cube left() {
    return new Cube(x - 1, y, z);
  }

  Cube right() {
    return new Cube(x + 1, y, z);
  }

  Cube back() {
    return new Cube(x, y - 1, z);
  }

  Cube front() {
    return new Cube(x, y + 1, z);
  }

  Cube top() {
    return new Cube(x, y, z + 1);
  }

  Cube bottom() {
    return new Cube(x, y, z - 1);
  }
}
