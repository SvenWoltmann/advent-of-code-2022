package eu.happycoders.adventofcode2022.day15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RangesTest {

  @Test
  void givenTwoSeparateRanges_getList_returnsThoseTwoSeparateRanges() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 10);
    ranges.addRange(20, 30);

    assertThat(ranges.getList()).containsExactly(new Range(0, 10), new Range(20, 30));
  }

  @Test
  void givenOneRangeAndASecondInside_getList_returnsTheFirstRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 1000);
    ranges.addRange(20, 30);

    assertThat(ranges.getList()).containsExactly(new Range(0, 1000));
  }

  @Test
  void givenOneRangeAndASecondCompletelyCoveringTheFirst_getList_returnsTheSecondRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(20, 30);
    ranges.addRange(0, 1000);

    assertThat(ranges.getList()).containsExactly(new Range(0, 1000));
  }

  @Test
  void givenOneRangeAndASecondCoveringTheEndOfTheFirst_getList_returnsAMergedRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 10);
    ranges.addRange(5, 20);

    assertThat(ranges.getList()).containsExactly(new Range(0, 20));
  }

  @Test
  void givenOneRangeAndASecondCoveringTheBeginningOfTheFirst_getList_returnsAMergedRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(5, 20);
    ranges.addRange(0, 10);

    assertThat(ranges.getList()).containsExactly(new Range(0, 20));
  }

  @Test
  void givenOneRangeAndASecondStartingRightAfterTheEndOfTheFirst_getList_returnsAMergedRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 3);
    ranges.addRange(4, 20);

    assertThat(ranges.getList()).containsExactly(new Range(0, 20));
  }

  @Test
  void
      givenOneRangeAndASecondEndingRightBeforeTheBeginningOfTheSecond_getList_returnsAMergedRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(4, 20);
    ranges.addRange(0, 3);

    assertThat(ranges.getList()).containsExactly(new Range(0, 20));
  }

  @Test
  void givenTwoSeparateRangesAndAThirdTouchingBoth_getList_returnsASingleRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 10);
    ranges.addRange(20, 30);
    ranges.addRange(11, 19);

    assertThat(ranges.getList()).containsExactly(new Range(0, 30));
  }

  @Test
  void givenTwoSeparateRangesAndAThirdCoveringBoth_getList_returnsASingleRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 10);
    ranges.addRange(20, 30);
    ranges.addRange(5, 25);

    assertThat(ranges.getList()).containsExactly(new Range(0, 30));
  }

  @Test
  void
      givenTwoSeparateRangesAndAThirdCoveringTheFirstAndExtendingTheSecond_getList_returnsASingleRange() {
    Ranges ranges = new Ranges();

    ranges.addRange(0, 10);
    ranges.addRange(20, 30);
    ranges.addRange(5, 45);

    assertThat(ranges.getList()).containsExactly(new Range(0, 45));
  }
}
