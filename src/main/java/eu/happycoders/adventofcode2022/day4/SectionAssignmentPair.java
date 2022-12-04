package eu.happycoders.adventofcode2022.day4;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A pair of two section assignments.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record SectionAssignmentPair(SectionAssignment section1, SectionAssignment section2) {

  boolean oneSectionsFullyContainsTheOther() {
    return section1.fullyContains(section2) || section2.fullyContains(section1);
  }

  boolean sectionsOverlap() {
    return section1.overlaps(section2);
  }
}
