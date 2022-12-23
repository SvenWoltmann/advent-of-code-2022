package eu.happycoders.adventofcode2022.day23;

import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input text into a list of elves positions.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  private static final char ELF_SYMBOL = '#';

  static List<Position> parse(String input) {
    List<Position> result = new ArrayList<>();

    String[] lines = input.split("\\n");
    for (int y = 0; y < lines.length; y++) {
      String line = lines[y];
      for (int x = 0; x < line.length(); x++) {
        if (line.charAt(x) == ELF_SYMBOL) {
          result.add(new Position(x, y));
        }
      }
    }

    return result;
  }
}
