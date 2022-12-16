package eu.happycoders.adventofcode2022.day16;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input string to a {@link PuzzleInput} object.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {
  static PuzzleInput parse(String input) {
    List<ParsedLine> valveAndTunnels = input.lines().map(ParsedLine::parse).toList();
    return new PuzzleInput(valveAndTunnels);
  }
}
