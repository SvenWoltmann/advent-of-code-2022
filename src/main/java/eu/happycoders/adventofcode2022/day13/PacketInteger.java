package eu.happycoders.adventofcode2022.day13;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A packet containing an integer value.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PacketInteger(int value) implements Packet {

  @Override
  public String toString() {
    return Integer.toString(value);
  }
}
