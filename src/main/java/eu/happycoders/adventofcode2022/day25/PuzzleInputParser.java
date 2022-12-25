package eu.happycoders.adventofcode2022.day25;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input text into a string list.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  static List<String> parse(String input) {
    return input.lines().toList();
  }
}
