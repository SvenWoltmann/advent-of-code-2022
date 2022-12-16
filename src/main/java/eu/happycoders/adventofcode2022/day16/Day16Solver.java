package eu.happycoders.adventofcode2022.day16;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 16.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day16Solver {
  static int solvePart1(String input) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    ActionsSimulator actionsSimulator = new ActionsSimulator(puzzleInput.toValves(), 1, 30);

    return actionsSimulator.getMostPressurePossible();
  }

  static int solvePart2(String input) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    ActionsSimulator actionsSimulator = new ActionsSimulator(puzzleInput.toValves(), 2, 26);

    return actionsSimulator.getMostPressurePossible();
  }
}
