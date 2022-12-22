package eu.happycoders.adventofcode2022.day22;

import static eu.happycoders.adventofcode2022.day22.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PuzzleInputParserTest {

  @Test
  void givenTheTestInput_parse_returnsTheParsedPuzzleInput() {
    String input = TEST_INPUT;

    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    assertThat(puzzleInput.boardMap()).isEqualTo(TestInputs.TEST_BOARD_MAP);
    assertThat(puzzleInput.instructions()).isEqualTo(TestInputs.TEST_INSTRUCTIONS);
  }
}
