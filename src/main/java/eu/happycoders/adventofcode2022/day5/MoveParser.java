package eu.happycoders.adventofcode2022.day5;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input into a list of {@link Move}s.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class MoveParser {

  private static final Pattern MOVE_PATTERN =
      Pattern.compile("move (\\d{1,5}) from (\\d{1,5}) to (\\d{1,5})");

  static List<Move> parseMoves(String input) {
    return input.lines().map(MoveParser::parseMove).toList();
  }

  static Move parseMove(String input) {
    Matcher matcher = MOVE_PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException();
    }

    int number = Integer.parseInt(matcher.group(1));
    int source = Integer.parseInt(matcher.group(2));
    int target = Integer.parseInt(matcher.group(3));

    return new Move(number, source, target);
  }
}
