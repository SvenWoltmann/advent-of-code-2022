package eu.happycoders.adventofcode2022.day4;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SectionAssignmentTest {

  private static Stream<Arguments> fullyContainsArguments() {
    return Stream.of(
        Arguments.of(new SectionAssignment(2, 4), new SectionAssignment(6, 8), false),
        Arguments.of(new SectionAssignment(2, 3), new SectionAssignment(4, 5), false),
        Arguments.of(new SectionAssignment(5, 7), new SectionAssignment(7, 9), false),
        Arguments.of(new SectionAssignment(2, 8), new SectionAssignment(3, 7), true),
        Arguments.of(new SectionAssignment(6, 6), new SectionAssignment(4, 6), true),
        Arguments.of(new SectionAssignment(2, 6), new SectionAssignment(4, 8), false));
  }

  @ParameterizedTest
  @MethodSource("fullyContainsArguments")
  void givenTwoSectionAssignments_fullyContains_returnsExpectedResult(
      SectionAssignment sectionAssignment1,
      SectionAssignment sectionAssignment2,
      boolean expectedResult) {
    boolean result =
        sectionAssignment1.fullyContains(sectionAssignment2)
            || sectionAssignment2.fullyContains(sectionAssignment1);

    assertThat(result).isEqualTo(expectedResult);
  }

  private static Stream<Arguments> overlapsArguments() {
    return Stream.of(
        Arguments.of(new SectionAssignment(2, 4), new SectionAssignment(6, 8), false),
        Arguments.of(new SectionAssignment(2, 3), new SectionAssignment(4, 5), false),
        Arguments.of(new SectionAssignment(5, 7), new SectionAssignment(7, 9), true),
        Arguments.of(new SectionAssignment(2, 8), new SectionAssignment(3, 7), true),
        Arguments.of(new SectionAssignment(6, 6), new SectionAssignment(4, 6), true),
        Arguments.of(new SectionAssignment(2, 6), new SectionAssignment(4, 8), true));
  }

  @ParameterizedTest
  @MethodSource("overlapsArguments")
  void givenTwoSectionAssignments_overlaps_returnsExpectedResult(
      SectionAssignment sectionAssignment1,
      SectionAssignment sectionAssignment2,
      boolean expectedResult) {
    boolean result = sectionAssignment1.overlaps(sectionAssignment2);

    assertThat(result).isEqualTo(expectedResult);
  }
}
