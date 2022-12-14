package eu.happycoders.adventofcode2022.day14;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 14.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day14Solver {
  static int solvePart1(String input) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);
    Cave cave = new Cave(puzzleInput, false);
    return cave.letItFlowAndCountRestingUnitsOfSand();
  }

  static int solvePart2(String input) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);
    Cave cave = new Cave(puzzleInput, true);
    return cave.letItFlowAndCountRestingUnitsOfSand();
  }
}
