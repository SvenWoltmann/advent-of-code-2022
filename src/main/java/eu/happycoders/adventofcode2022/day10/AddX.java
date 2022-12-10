package eu.happycoders.adventofcode2022.day10;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An operation adding the given parameter to the CPU's register.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record AddX(int value) implements Operation {

  @Override
  public int getCycles() {
    return 2;
  }
}
