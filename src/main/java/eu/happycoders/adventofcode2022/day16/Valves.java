package eu.happycoders.adventofcode2022.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A collection of valves with some additional information.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class Valves {

  private final List<Valve> allValves;
  private final List<Valve> valvesWithFlowRateSortedByFlowRate;
  private final int numberOfValvesToOpen;
  private final Valve start;

  private List<Valve> allClosedValvesSortedByFlowRate;

  Valves(List<Valve> allValves, Valve start) {
    this.allValves = allValves;

    this.valvesWithFlowRateSortedByFlowRate =
        allValves.stream()
            .filter(valve -> valve.flowRate() > 0)
            .sorted(Comparator.comparing(Valve::flowRate))
            .toList();

    this.numberOfValvesToOpen = valvesWithFlowRateSortedByFlowRate.size();

    this.start = start;
  }

  int numberOfValvesToOpen() {
    return numberOfValvesToOpen;
  }

  Valve start() {
    return start;
  }

  List<Valve> getAllClosedValvesSortedByFlowRate() {
    if (allClosedValvesSortedByFlowRate == null) {
      allClosedValvesSortedByFlowRate = new ArrayList<>();
      for (Valve valve : valvesWithFlowRateSortedByFlowRate) {
        if (valve.isClosed()) {
          allClosedValvesSortedByFlowRate.add(valve);
        }
      }
    }
    return allClosedValvesSortedByFlowRate;
  }

  void invalidateAllClosedValvesSortedByFlowRate() {
    allClosedValvesSortedByFlowRate = null;
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }

    if (object == null || object.getClass() != this.getClass()) {
      return false;
    }

    var that = (Valves) object;
    return Objects.equals(this.allValves, that.allValves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allValves);
  }

  @Override
  public String toString() {
    return "Valves[" + allValves + ']';
  }
}
