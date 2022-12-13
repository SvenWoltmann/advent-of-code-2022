package eu.happycoders.adventofcode2022.day13;

import static eu.happycoders.adventofcode2022.day13.TestInputs.TEST_INPUT;
import static eu.happycoders.adventofcode2022.day13.TestInputs.TEST_PUZZLE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PuzzleParserTest {
  @Test
  void givenTestInput_parse_returnsTestPuzzle() {
    String input = TEST_INPUT;

    Puzzle puzzle = PuzzleParser.parse(input);

    assertThat(puzzle).isEqualTo(TEST_PUZZLE);
  }
}
