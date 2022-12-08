package eu.happycoders.adventofcode2022.day8;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single tree with its height.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Tree(int height) {
  Tree {
    if (height < 0 || height > 9) {
      throw new IllegalArgumentException();
    }
  }
}
