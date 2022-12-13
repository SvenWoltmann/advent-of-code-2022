package eu.happycoders.adventofcode2022.day13;

import java.util.Comparator;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Comparator for two packet lists.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class PacketListComparator implements Comparator<PacketList> {

  static final PacketListComparator INSTANCE_WITH_DEBUG_OUTPUT = new PacketListComparator(true);
  static final PacketListComparator INSTANCE = new PacketListComparator(false);

  private final boolean debugOutput;

  private PacketListComparator(boolean debugOutput) {
    this.debugOutput = debugOutput;
  }

  @Override
  public int compare(PacketList l1, PacketList l2) {
    return compareLists(l1, l2, 0);
  }

  private int compareLists(PacketList p1, PacketList p2, int level) {
    if (debugOutput) {
      System.out.print("- Compare %s vs %s".formatted(p1, p2).indent(level * 2));
    }

    List<Packet> values1 = p1.getPackets();
    List<Packet> values2 = p2.getPackets();

    for (int index = 0; ; index++) {
      Integer result = compareListSizes(values1, values2, index, level);
      if (result != null) {
        return result;
      }

      Packet value1 = values1.get(index);
      Packet value2 = values2.get(index);

      result = comparePackets(level, value1, value2);
      if (result != 0) {
        return result;
      }
    }
  }

  private Integer compareListSizes(
      List<Packet> values1, List<Packet> values2, int index, int indentationLevel) {
    if (values1.size() == index && values2.size() > index) {
      if (debugOutput) {
        System.out.print(
            "- Left side ran out of items, so inputs are in the right order"
                .indent((indentationLevel + 1) * 2));
      }
      return -1;
    } else if (values1.size() > index && values2.size() == index) {
      if (debugOutput) {
        System.out.print(
            "- Right side ran out of items, so inputs are not in the right order"
                .indent((indentationLevel + 1) * 2));
      }
      return 1;
    } else if (values1.size() == index && values2.size() == index) {
      return 0;
    }

    return null;
  }

  @SuppressWarnings("PMD.CyclomaticComplexity") // This method isn't particularly complex
  private int comparePackets(int level, Packet value1, Packet value2) {
    if (value1 instanceof PacketInteger i1 && value2 instanceof PacketInteger i2) {
      return compareIntegers(i1, i2, level);
    } else if (value1 instanceof PacketList l1 && value2 instanceof PacketList l2) {
      return compareLists(l1, l2, level + 1);
    } else if (value1 instanceof PacketList l1 && value2 instanceof PacketInteger i2) {
      return compareLists(l1, new PacketList(i2.value()), level + 1);
    } else if (value1 instanceof PacketInteger i1 && value2 instanceof PacketList l2) {
      return compareLists(new PacketList(i1.value()), l2, level + 1);
    } else {
      throw new IllegalStateException("Don't know how to compare " + value1 + " and " + value2);
    }
  }

  private int compareIntegers(PacketInteger i1, PacketInteger i2, int indentationLevel) {
    if (debugOutput) {
      System.out.print(
          "- Compare %s vs %s"
              .formatted(i1.value(), i2.value())
              .indent((indentationLevel + 1) * 2));
    }

    if (i1.value() < i2.value()) {
      if (debugOutput) {
        System.out.print(
            "- Left side is smaller, so inputs are in the right order"
                .indent((indentationLevel + 2) * 2));
      }
      return -1;
    } else if (i1.value() > i2.value()) {
      if (debugOutput) {
        System.out.print(
            "- Right side is smaller, so inputs are not in the right order"
                .indent((indentationLevel + 2) * 2));
      }
      return 1;
    } else {
      return 0;
    }
  }
}
