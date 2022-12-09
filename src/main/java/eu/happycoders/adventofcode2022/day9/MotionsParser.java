package eu.happycoders.adventofcode2022.day9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input to a {@link Motions} object containing a list of {@link Motion}s.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class MotionsParser {

  private static final Pattern LINE_PATTERN = Pattern.compile("([URDL]) (\\d{1,5})");

  static Motions parse(String input) {
    return input
        .lines()
        .map(MotionsParser::parseLine)
        .collect(Motions::new, Motions::add, Motions::addAll);
  }

  private static Motion parseLine(String input) {
    Matcher matcher = LINE_PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Invalid input: " + input);
    }
    Direction direction = Direction.ofIndicator(matcher.group(1));
    int steps = Integer.parseInt(matcher.group(2));
    return new Motion(direction, steps);
  }
}
