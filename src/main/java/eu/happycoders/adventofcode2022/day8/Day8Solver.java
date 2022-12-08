package eu.happycoders.adventofcode2022.day8;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 8.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day8Solver {
  static int getVisibleTrees(String input) {
    PatchOfTrees patchOfTrees = PatchOfTreesParser.parse(input);
    return patchOfTrees.getVisibleTrees();
  }

  static int getHighestScenicScore(String input) {
    PatchOfTrees patchOfTrees = PatchOfTreesParser.parse(input);
    return patchOfTrees.getHighestScenicScore();
  }
}
