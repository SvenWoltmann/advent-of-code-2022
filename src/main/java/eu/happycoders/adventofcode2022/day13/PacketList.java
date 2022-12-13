package eu.happycoders.adventofcode2022.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A packet containing a list of other packets.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class PacketList implements Packet {

  private final List<Packet> packets = new ArrayList<>();

  PacketList(Object... objects) {
    for (Object object : objects) {
      if (object instanceof Packet packet) {
        this.packets.add(packet);
      } else if (object instanceof Integer value) {
        this.packets.add(new PacketInteger(value));
      } else {
        throw new IllegalArgumentException("Invalid object: " + object);
      }
    }
  }

  void add(Packet packet) {
    packets.add(packet);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    PacketList that = (PacketList) object;
    return Objects.equals(packets, that.packets);
  }

  @Override
  public int hashCode() {
    return packets.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append('[');
    for (Packet packet : packets) {
      if (result.length() > 1) {
        result.append(',');
      }
      result.append(packet);
    }
    result.append(']');
    return result.toString();
  }

  List<Packet> getPackets() {
    return packets;
  }
}
