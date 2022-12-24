package eu.happycoders.adventofcode2022.day24;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 24.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day24Solver {

  static int solveTask1(String input) {
    ValleyMap valleyMap = PuzzleInputParser.parse(input);
    ValleyWalker valleyWalker = new ValleyWalker(valleyMap);
    return valleyWalker.findFastestPath(1);
  }

  static int solveTask2(String input) {
    ValleyMap valleyMap = PuzzleInputParser.parse(input);
    ValleyWalker valleyWalker = new ValleyWalker(valleyMap);
    return valleyWalker.findFastestPath(3);
  }
}
