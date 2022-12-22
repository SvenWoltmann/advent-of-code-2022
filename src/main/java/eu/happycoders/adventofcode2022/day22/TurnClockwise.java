package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The instruction to turn clockwise.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class TurnClockwise implements Instruction {

  static final TurnClockwise INSTANCE = new TurnClockwise();

  private TurnClockwise() {}

  @Override
  public String toString() {
    return TurnClockwise.class.getSimpleName();
  }
}
