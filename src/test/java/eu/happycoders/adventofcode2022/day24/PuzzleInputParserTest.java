package eu.happycoders.adventofcode2022.day24;

import static eu.happycoders.adventofcode2022.day24.TestInputs.TEST_INPUT;
import static eu.happycoders.adventofcode2022.day24.TestInputs.TEST_INPUT_WITH_MORE_BLIZZARDS;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PuzzleInputParserTest {

  @Test
  void givenTheTestInput_parse_returnsTheParsedPuzzleInput() {
    String input = TEST_INPUT;

    ValleyMap valleyMap = PuzzleInputParser.parse(input);

    assertThat(valleyMap).isEqualTo(TestInputs.TEST_VALLEY_MAP);
  }

  @Test
  void givenTheTestInputWithMoreBlizzards_parse_returnsTheParsedPuzzleInput() {
    String input = TEST_INPUT_WITH_MORE_BLIZZARDS;

    ValleyMap valleyMap = PuzzleInputParser.parse(input);

    assertThat(valleyMap).isEqualTo(TestInputs.TEST_VALLEY_MAP_WITH_MORE_BLIZZARDS);
  }
}
