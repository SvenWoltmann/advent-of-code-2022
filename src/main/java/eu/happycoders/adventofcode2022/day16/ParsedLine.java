package eu.happycoders.adventofcode2022.day16;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A parsed line from the puzzle input.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record ParsedLine(String valveName, int flowRate, List<String> leadingTo) {

  private static final Pattern PATTERN =
      Pattern.compile(
          "Valve ([A-Z][A-Z]) has flow rate=(\\d+); tunnels? leads? to valves? ([A-Z ,]*)");

  static ParsedLine parse(String input) {
    Matcher matcher = PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(input);
    }

    String valveName = matcher.group(1);
    int flowRate = Integer.parseInt(matcher.group(2));
    String leadingToStr = matcher.group(3);
    String[] leadingTo = leadingToStr.split(", ");

    return new ParsedLine(valveName, flowRate, Arrays.asList(leadingTo));
  }

  @Override
  public String toString() {
    return "Valve %s has flow rate=%d; tunnels lead to valves %s"
        .formatted(valveName, flowRate, String.join(", ", leadingTo));
  }
}
