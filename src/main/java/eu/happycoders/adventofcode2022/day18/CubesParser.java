package eu.happycoders.adventofcode2022.day18;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input string into a list of cubes.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CubesParser {

  private static final Pattern PATTERN = Pattern.compile("(\\d+),(\\d+),(\\d+)");

  static List<Cube> parse(String input) {
    return input.lines().map(CubesParser::parseCube).toList();
  }

  @SuppressWarnings("PMD.ShortVariable") // x, y, and z are OK!
  private static Cube parseCube(String input) {
    Matcher matcher = PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(input);
    }

    int x = Integer.parseInt(matcher.group(1));
    int y = Integer.parseInt(matcher.group(2));
    int z = Integer.parseInt(matcher.group(3));

    return new Cube(x, y, z);
  }
}
