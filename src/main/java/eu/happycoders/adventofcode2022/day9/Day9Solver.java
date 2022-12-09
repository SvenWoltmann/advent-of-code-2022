package eu.happycoders.adventofcode2022.day9;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 9.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day9Solver {

  static int calculateNumberOfTailPositions(String input, int ropeLength) {
    Motions motions = MotionsParser.parse(input);
    RopeSimulator simulator = new RopeSimulator(ropeLength);
    simulator.move(motions);
    return simulator.getNumberOfTailPositions();
  }
}
