package eu.happycoders.adventofcode2022.day20;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input into a list of Longs.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ListParser {

  static List<Long> parse(String input) {
    return input.lines().map(Long::parseLong).toList();
  }
}
