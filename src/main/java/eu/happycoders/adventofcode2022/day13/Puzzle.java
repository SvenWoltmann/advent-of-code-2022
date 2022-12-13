package eu.happycoders.adventofcode2022.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The puzzle consisting of a list of packet list pairs.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Puzzle {
  private final List<PacketListPair> pairs = new ArrayList<>();

  void add(PacketListPair pair) {
    pairs.add(pair);
  }

  int getSumOfIndicesOfPacketsInRightOrder(boolean debugOutput) {
    int sum = 0;
    for (int i = 1; i <= pairs.size(); i++) {
      if (debugOutput) {
        System.out.printf("%n== Pair %d ==%n", i);
      }

      PacketListPair pair = pairs.get(i - 1);
      if (pair.isInCorrectOrder(debugOutput)) {
        sum += i;
      }
    }
    return sum;
  }

  List<PacketList> getAllPackets() {
    List<PacketList> result = new ArrayList<>();
    for (PacketListPair pair : pairs) {
      result.add(pair.packetList1());
      result.add(pair.packetList2());
    }
    return result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Puzzle that = (Puzzle) object;
    return Objects.equals(pairs, that.pairs);
  }

  @Override
  public int hashCode() {
    return pairs.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    for (PacketListPair pair : pairs) {
      result.append(pair);
      result.append("\n\n");
    }

    return result.toString().stripTrailing();
  }
}
