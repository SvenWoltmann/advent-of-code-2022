package eu.happycoders.adventofcode2022.day12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InputParserTest {

  @Test
  void givenTestInputAsString_parse_returnsParsedInput() {
    String input = TestInputs.INPUT;

    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    assertThat(puzzleInput.map()).isEqualTo(TestInputs.HEIGHT_MAP);
    assertThat(puzzleInput.start()).isEqualTo(TestInputs.START);
    assertThat(puzzleInput.end()).isEqualTo(TestInputs.END);
  }
}
