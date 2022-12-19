package eu.happycoders.adventofcode2022.day19;

import static eu.happycoders.adventofcode2022.day19.TestInputs.TEST_BLUEPRINT_1;
import static eu.happycoders.adventofcode2022.day19.TestInputs.TEST_BLUEPRINT_2;
import static eu.happycoders.adventofcode2022.day19.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class BlueprintsParserTest {

  @Test
  void givenTheTestInput_parse_returnsTheParsedPuzzleInput() {
    String input = TEST_INPUT;

    List<Blueprint> blueprints = BlueprintsParser.parse(input);

    assertThat(blueprints).containsExactly(TEST_BLUEPRINT_1, TEST_BLUEPRINT_2);
  }
}
