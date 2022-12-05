package eu.happycoders.adventofcode2022.day5;

import static eu.happycoders.adventofcode2022.day5.PuzzleInputParser.parse;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 5.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day5Solver {

  static String solve(String input, CrateMover crateMover) {
    PuzzleInput puzzleInput = parse(input);
    CrateStacks crateStacks = puzzleInput.crateStacks();
    List<Move> moves = puzzleInput.moves();

    for (Move move : moves) {
      crateMover.move(crateStacks, move);
    }

    return topCratesToString(crateStacks);
  }

  private static String topCratesToString(CrateStacks crateStacks) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= crateStacks.size(); i++) {
      result.append(crateStacks.stackAt(i).peek().value());
    }
    return result.toString();
  }
}
