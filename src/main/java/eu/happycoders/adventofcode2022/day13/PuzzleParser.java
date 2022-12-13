package eu.happycoders.adventofcode2022.day13;

class PuzzleParser {

  private static final char LIST_START = '[';
  private static final char LIST_END = ']';

  static Puzzle parse(String input) {
    Puzzle puzzle = new Puzzle();

    String[] pairs = input.split("\\n\\n");

    for (String pair : pairs) {
      puzzle.add(parsePair(pair));
    }

    return puzzle;
  }

  private static PacketListPair parsePair(String input) {
    String[] packets = input.split("\\n");
    if (packets.length != 2) {
      throw new IllegalArgumentException();
    }
    Packet data1 = parsePacketData(packets[0]);
    Packet data2 = parsePacketData(packets[1]);
    if (data1 instanceof PacketList list1 && data2 instanceof PacketList list2) {
      return new PacketListPair(list1, list2);
    } else {
      throw new IllegalArgumentException();
    }
  }

  private static Packet parsePacketData(String packet) {
    int length = packet.length();
    if (length >= 2 && packet.charAt(0) == LIST_START && packet.charAt(length - 1) == LIST_END) {
      if (length == 2) {
        return new PacketList();
      } else {
        return parsePacketList(packet);
      }
    } else {
      return parsePacketInteger(packet);
    }
  }

  private static PacketList parsePacketList(String packet) {
    PacketList result = new PacketList();

    StringBuilder sb = new StringBuilder();
    int level = 0;
    for (int i = 1; i < packet.length() - 1; i++) {
      char character = packet.charAt(i);
      if (character == ',' && level == 0) {
        result.add(parsePacketData(sb.toString()));
        sb = new StringBuilder();
      } else {
        sb.append(character);
        if (character == LIST_START) {
          level++;
        }
        if (character == LIST_END) {
          level--;
        }
      }
    }
    result.add(parsePacketData(sb.toString()));
    return result;
  }

  private static PacketInteger parsePacketInteger(String packet) {
    int value = Integer.parseInt(packet);
    return new PacketInteger(value);
  }
}
