package eu.happycoders.adventofcode2022.day23;

import static eu.happycoders.adventofcode2022.day23.TestInputs.TEST_INPUT;
import static eu.happycoders.adventofcode2022.day23.TestInputs.TEST_INPUT_SMALL_EXAMPLE;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class PuzzleInputParserTest {

  @Test
  void givenTheTestInput_parse_returnsTheParsedPuzzleInput() {
    String input = TEST_INPUT;

    List<Position> elvesPositions = PuzzleInputParser.parse(input);

    assertThat(elvesPositions).isEqualTo(TestInputs.ELVES_POSITIONS);
  }

  @Test
  void givenTheTestInputForTheSmallExample_parse_returnsTheParsedPuzzleInput() {
    String input = TEST_INPUT_SMALL_EXAMPLE;

    List<Position> elvesPositions = PuzzleInputParser.parse(input);

    assertThat(elvesPositions).isEqualTo(TestInputs.ELVES_POSITIONS_SMALL_EXAMPLE);
  }
}
