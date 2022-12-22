package eu.happycoders.adventofcode2022.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input text into a {@link PuzzleInput} object.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {
  static PuzzleInput parse(String input) {
    String[] parts = input.split("\\n\\n");
    String boardMapInput = parts[0];
    String instructionsInput = parts[1];

    BoardMap boardMap = parseBoardMap(boardMapInput);
    List<Instruction> instructions = parseInstructions(instructionsInput);

    return new PuzzleInput(boardMap, instructions);
  }

  private static BoardMap parseBoardMap(String boardMapInput) {
    String[] lines = boardMapInput.split("\n");
    int height = lines.length;
    int width = Arrays.stream(lines).mapToInt(String::length).max().orElseThrow();

    BoardMap result = new BoardMap(width, height);

    for (int row = 0; row < lines.length; row++) {
      String line = lines[row];

      for (int column = 0; column < line.length(); column++) {
        Tile tile = parseTile(line.charAt(column));
        result.setTile(new Position(column, row), tile);
      }
    }

    return result;
  }

  private static Tile parseTile(char symbol) {
    return switch (symbol) {
      case ' ' -> null;
      case '.' -> Tile.OPEN;
      case '#' -> Tile.WALL;
      default -> throw new IllegalArgumentException();
    };
  }

  private static List<Instruction> parseInstructions(String movesInput) {
    List<Instruction> result = new ArrayList<>();

    int number = 0;
    for (int i = 0; i < movesInput.length(); i++) {
      char character = movesInput.charAt(i);
      if (character >= '0' && character <= '9') {
        number = number * 10 + (character - '0');
      } else if (character == 'L' || character == 'R') {
        result.add(GoForward.tiles(number));
        number = 0;
        result.add(character == 'L' ? TurnCounterClockwise.INSTANCE : TurnClockwise.INSTANCE);
      } else {
        throw new IllegalArgumentException();
      }
    }

    if (number != 0) {
      result.add(GoForward.tiles(number));
    }

    return result;
  }
}
