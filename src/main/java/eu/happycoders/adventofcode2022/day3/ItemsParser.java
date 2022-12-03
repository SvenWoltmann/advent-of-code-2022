package eu.happycoders.adventofcode2022.day3;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses a string into a list of items.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ItemsParser {

  static List<Item> parse(String input) {
    return input.chars().mapToObj(charAsInt -> new Item((char) charAsInt)).toList();
  }
}
