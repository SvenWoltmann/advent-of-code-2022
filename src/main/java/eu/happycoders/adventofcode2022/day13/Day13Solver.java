package eu.happycoders.adventofcode2022.day13;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 13.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day13Solver {
  static int getSumOfIndicesOfPacketsInRightOrder(String input, boolean debugOutput) {
    Puzzle puzzle = PuzzleParser.parse(input);
    return puzzle.getSumOfIndicesOfPacketsInRightOrder(debugOutput);
  }

  @SuppressWarnings("PMD.CompareObjectsWithEquals") // Intentionally comparing packet lists with ==
  static int getDecoderKey(String input, boolean debugOutput) {
    Puzzle puzzle = PuzzleParser.parse(input);

    List<PacketList> allPackets = puzzle.getAllPackets();

    PacketList divider2 = new PacketList(new PacketList(2));
    PacketList divider6 = new PacketList(new PacketList(6));
    allPackets.add(divider2);
    allPackets.add(divider6);

    allPackets.sort(PacketListComparator.INSTANCE);

    int divider2Pos = 0;
    int divider6Pos = 0;
    for (int i = 0; i < allPackets.size(); i++) {
      PacketList packet = allPackets.get(i);
      if (debugOutput) {
        System.out.println(packet);
      }

      if (packet == divider2) {
        divider2Pos = i + 1;
      }
      if (packet == divider6) {
        divider6Pos = i + 1;
      }
    }

    return divider2Pos * divider6Pos;
  }
}
