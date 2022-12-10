package eu.happycoders.adventofcode2022.day10;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 10.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day10Solver {

  static int getSumOfSelectedSignalStrengths(String input) {
    List<Operation> operations = OperationsParser.parse(input);
    Simulator simulator = new Simulator();
    simulator.runOperations(operations);
    List<Integer> signalStrengths = simulator.getSignalStrengths();
    return signalStrengths.get(19)
        + signalStrengths.get(59)
        + signalStrengths.get(99)
        + signalStrengths.get(139)
        + signalStrengths.get(179)
        + signalStrengths.get(219);
  }

  static String render(String input) {
    List<Operation> operations = OperationsParser.parse(input);
    Simulator simulator = new Simulator();
    simulator.runOperations(operations);
    return simulator.getScreen().toString();
  }
}
