package eu.happycoders.adventofcode2022.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A valve with a name, flow rate and a list of valves this valve is leading to.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Valve {

  private final int index;
  private final String name;
  private final int flowRate;
  private final List<Valve> leadingTo = new ArrayList<>();

  private final int bitmaskForOpenValve;

  private boolean open;

  Valve(int index, String name, int flowRate, int bitmaskForOpenValve) {
    this.index = index;
    this.name = name;
    this.flowRate = flowRate;
    this.bitmaskForOpenValve = bitmaskForOpenValve;
  }

  int index() {
    return index;
  }

  String name() {
    return name;
  }

  int flowRate() {
    return flowRate;
  }

  void addLeadingTo(Valve to) {
    Objects.requireNonNull(to);
    leadingTo.add(to);
  }

  List<Valve> leadingTo() {
    return leadingTo;
  }

  int bitmaskForOpenValve() {
    return bitmaskForOpenValve;
  }

  void open() {
    this.open = true;
  }

  void close() {
    this.open = false;
  }

  boolean isClosed() {
    return !open;
  }

  @Override
  public String toString() {
    return name;
  }
}
