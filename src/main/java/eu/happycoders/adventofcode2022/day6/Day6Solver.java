package eu.happycoders.adventofcode2022.day6;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 6.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day6Solver {

  private static final int START_OF_PACKET_MARKER_LENGTH = 4;
  private static final int START_OF_MESSAGE_MARKER_LENGTH = 14;

  static int detectStartOfPacket(String data) {
    DataStream dataStream = new DataStream(data);
    return dataStream.detectMarker(START_OF_PACKET_MARKER_LENGTH);
  }

  static int detectStartOfMessage(String data) {
    DataStream dataStream = new DataStream(data);
    return dataStream.detectMarker(START_OF_MESSAGE_MARKER_LENGTH);
  }
}
