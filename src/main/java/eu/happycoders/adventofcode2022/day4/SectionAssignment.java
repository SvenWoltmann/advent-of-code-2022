package eu.happycoders.adventofcode2022.day4;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single section assignment containing a start section ID and en end section ID.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record SectionAssignment(int start, int end) {
  boolean fullyContains(SectionAssignment other) {
    return start <= other.start && end >= other.end;
  }

  boolean overlaps(SectionAssignment other) {
    return start >= other.start && start <= other.end
        || end >= other.start && end <= other.end
        || other.start >= start && other.start <= end
        || other.end >= start && other.end <= end;
  }
}
