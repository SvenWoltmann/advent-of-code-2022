package eu.happycoders.adventofcode2022.day4;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class InputParserTest {

  @Test
  void givenASingleLineTestInput_parseSectionAssignmentPair_returnsTheSectionAssignmentPair() {
    String testInput = "2-4,6-8";

    SectionAssignmentPair pair = InputParser.parseSectionAssignmentPair(testInput);

    assertThat(pair)
        .isEqualTo(
            new SectionAssignmentPair(new SectionAssignment(2, 4), new SectionAssignment(6, 8)));
  }

  @Test
  void
      givenAMultiLineTestInput_parseListOfSectionAssignmentPairs_returnsTheListOfSectionAssignmentPairs() {
    String testInput = """
            2-4,6-8
            2-3,4-5""";

    List<SectionAssignmentPair> list = InputParser.parseListOfSectionAssignmentPairs(testInput);

    assertThat(list)
        .containsExactly(
            new SectionAssignmentPair(new SectionAssignment(2, 4), new SectionAssignment(6, 8)),
            new SectionAssignmentPair(new SectionAssignment(2, 3), new SectionAssignment(4, 5)));
  }
}
