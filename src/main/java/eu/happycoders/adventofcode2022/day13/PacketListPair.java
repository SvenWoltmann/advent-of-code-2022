package eu.happycoders.adventofcode2022.day13;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A pair of two packet lists.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PacketListPair(PacketList packetList1, PacketList packetList2) {

  boolean isInCorrectOrder(boolean debugOutput) {
    PacketListComparator comparator =
        debugOutput
            ? PacketListComparator.INSTANCE_WITH_DEBUG_OUTPUT
            : PacketListComparator.INSTANCE;

    return comparator.compare(packetList1, packetList2) < 0;
  }

  @Override
  public String toString() {
    return packetList1.toString() + "\n" + packetList2.toString();
  }
}
