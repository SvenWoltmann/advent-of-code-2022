package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The instruction to turn counter-clockwise.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class TurnCounterClockwise implements Instruction {

  static final TurnCounterClockwise INSTANCE = new TurnCounterClockwise();

  private TurnCounterClockwise() {}

  @Override
  public String toString() {
    return TurnCounterClockwise.class.getSimpleName();
  }
}
