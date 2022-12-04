package eu.happycoders.adventofcode2022.day4;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 4.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day4Solver {

  static int countFullContainments(String input) {
    return (int)
        InputParser.parseListOfSectionAssignmentPairs(input).stream()
            .filter(SectionAssignmentPair::oneSectionsFullyContainsTheOther)
            .count();
  }

  static int countOverlaps(String input) {
    return (int)
        InputParser.parseListOfSectionAssignmentPairs(input).stream()
            .filter(SectionAssignmentPair::sectionsOverlap)
            .count();
  }
}
