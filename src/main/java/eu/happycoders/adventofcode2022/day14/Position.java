package eu.happycoders.adventofcode2022.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An X/Y position on the vertical slice of the cave.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
@SuppressWarnings("PMD.ShortVariable") // x and y are OK!
record Position(int x, int y) {

  private static final Pattern PATTERN = Pattern.compile("(\\d+),(\\d+)");

  static Position parse(String s) {
    Matcher matcher = PATTERN.matcher(s);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Cannot parse position: " + s);
    }
    int x = Integer.parseInt(matcher.group(1));
    int y = Integer.parseInt(matcher.group(2));
    return new Position(x, y);
  }

  Position down() {
    return new Position(x, y + 1);
  }

  Position downLeft() {
    return new Position(x - 1, y + 1);
  }

  Position downRight() {
    return new Position(x + 1, y + 1);
  }

  @Override
  public String toString() {
    return x + ", " + y;
  }
}
