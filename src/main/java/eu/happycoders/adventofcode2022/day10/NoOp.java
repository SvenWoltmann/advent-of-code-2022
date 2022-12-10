package eu.happycoders.adventofcode2022.day10;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An operation that does nothing but takes 1 CPU cycle.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record NoOp() implements Operation {

  @Override
  public int getCycles() {
    return 1;
  }
}
