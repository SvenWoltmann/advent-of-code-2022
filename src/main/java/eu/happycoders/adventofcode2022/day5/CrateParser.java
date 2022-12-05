package eu.happycoders.adventofcode2022.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses a single {@link Crate}.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CrateParser {

  private static final Pattern PATTERN = Pattern.compile("\\[([A-Z])]");

  static Crate parseCrate(String crateString) {
    if (crateString.equals("   ")) {
      return null;
    }

    Matcher matcher = PATTERN.matcher(crateString);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Cannot parse crate: " + crateString);
    }

    return new Crate(matcher.group(1).charAt(0));
  }
}
