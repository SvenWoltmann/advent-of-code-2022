package eu.happycoders.adventofcode2022.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A list of ranges, which merges ranges overlapping or adjacent ranges when a range is added.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Ranges {

  private final List<Range> list = new ArrayList<>();

  List<Range> getList() {
    return list;
  }

  void addRange(int from, int to) {
    Range newRange = new Range(from, to);

    for (Iterator<Range> iterator = list.iterator(); iterator.hasNext(); ) {
      Range range = iterator.next();

      if (range.overlapsWithOrTouches(newRange)) {
        newRange.mergeWith(range);
        iterator.remove();
      }
    }

    list.add(newRange);
  }

  Optional<Integer> getSingleUncoveredValue(int min, int max) {
    if (list.contains(new Range(min, max))) {
      return Optional.empty();
    }

    if (list.size() != 2) {
      throw newMultipleUncoveredValuesFoundException();
    }

    Range ft1 = list.get(0);
    Range ft2 = list.get(1);

    if (ft1.getStart() == min) {
      int result = ft1.getEnd() + 1;
      makeSureRangeStartsRightAfterResult(ft2, result);
      return Optional.of(result);
    }

    if (ft2.getStart() == min) {
      int result = ft2.getEnd() + 1;
      makeSureRangeStartsRightAfterResult(ft1, result);
      return Optional.of(result);
    }

    throw newMultipleUncoveredValuesFoundException();
  }

  private void makeSureRangeStartsRightAfterResult(Range range, int result) {
    if (range.getStart() != result + 1) {
      throw newMultipleUncoveredValuesFoundException();
    }
  }

  private IllegalStateException newMultipleUncoveredValuesFoundException() {
    return new IllegalStateException("Multiple uncovered values found in range: " + this);
  }

  @Override
  public String toString() {
    return list.toString();
  }
}
