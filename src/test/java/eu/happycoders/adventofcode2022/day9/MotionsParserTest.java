package eu.happycoders.adventofcode2022.day9;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MotionsParserTest {

  @Test
  void givenTestInput_parse_returnsMotionsForTestInput() {
    String input = TestInput.TEST_INPUT;

    Motions motions = MotionsParser.parse(input);

    assertThat(motions).isEqualTo(TestInput.TEST_MOTIONS);
  }
}
