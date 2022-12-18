package eu.happycoders.adventofcode2022.day18;

import static eu.happycoders.adventofcode2022.day18.TestInputs.TEST_CUBES;
import static eu.happycoders.adventofcode2022.day18.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CubeParserTest {

  @Test
  void givenTheTestInput_parse_returnsTheTestCoordinates() {
    String input = TEST_INPUT;

    List<Cube> cubes = CubesParser.parse(input);

    assertThat(cubes).isEqualTo(TEST_CUBES);
  }
}
