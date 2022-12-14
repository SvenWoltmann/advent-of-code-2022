package eu.happycoders.adventofcode2022.day14;

import static eu.happycoders.adventofcode2022.day14.TestInputs.TEST_INPUT;
import static eu.happycoders.adventofcode2022.day14.TestInputs.TEST_PUZZLE_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PuzzleInputParserTest {

  @Test
  void givenTestInput_parse_returnsParsedPuzzleInput() {
    String input = TEST_INPUT;

    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    assertThat(puzzleInput).isEqualTo(TEST_PUZZLE_INPUT);
  }
}
