package eu.happycoders.adventofcode2022.day4;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parser for {@link SectionAssignment} and {@link SectionAssignmentPair}.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class InputParser {

  private static final Pattern PATTERN =
      Pattern.compile("(\\d{1,5})-(\\d{1,5}),(\\d{1,5})-(\\d{1,5})");

  static List<SectionAssignmentPair> parseListOfSectionAssignmentPairs(String input) {
    String[] lines = input.split("\\n");
    return Arrays.stream(lines).map(InputParser::parseSectionAssignmentPair).toList();
  }

  static SectionAssignmentPair parseSectionAssignmentPair(String input) {
    Matcher matcher = PATTERN.matcher(input);
    boolean matches = matcher.find();

    if (!matches) {
      throw new IllegalArgumentException();
    }

    int start1 = Integer.parseInt(matcher.group(1));
    int end1 = Integer.parseInt(matcher.group(2));
    int start2 = Integer.parseInt(matcher.group(3));
    int end2 = Integer.parseInt(matcher.group(4));

    return new SectionAssignmentPair(
        new SectionAssignment(start1, end1), new SectionAssignment(start2, end2));
  }
}
