package eu.happycoders.adventofcode2022.day15;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A range with a start and end point.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class Range {

  private int start;
  private int end;

  Range(int start, int end) {
    this.start = start;
    this.end = end;
  }

  int getStart() {
    return start;
  }

  int getEnd() {
    return end;
  }

  int getLength() {
    return end - start + 1;
  }

  boolean overlapsWithOrTouches(Range other) {
    return start >= other.start && start <= other.end
        || end >= other.start && end <= other.end
        || other.start >= start && other.start <= end
        || other.end >= start && other.end <= end
        || start == other.end + 1
        || end + 1 == other.start;
  }

  void mergeWith(Range other) {
    start = Math.min(start, other.start);
    end = Math.max(end, other.end);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Range that = (Range) object;
    return start == that.start && end == that.end;
  }

  @Override
  public int hashCode() {
    int result = start;
    result = 31 * result + end;
    return result;
  }

  @Override
  public String toString() {
    return start + "-" + end;
  }
}
