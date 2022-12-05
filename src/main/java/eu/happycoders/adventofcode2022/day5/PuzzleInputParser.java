package eu.happycoders.adventofcode2022.day5;

import static eu.happycoders.adventofcode2022.day5.MoveParser.parseMoves;

import java.util.List;

class PuzzleInputParser {

  static PuzzleInput parse(String input) {
    String[] parts = input.split("\\n\\s*\\n");
    if (parts.length != 2) {
      throw new IllegalArgumentException();
    }

    String stacksString = parts[0];
    String movesString = parts[1];

    CrateStacks crateStacks = CrateStacksParser.parse(stacksString);
    List<Move> moves = parseMoves(movesString);

    return new PuzzleInput(crateStacks, moves);
  }
}
