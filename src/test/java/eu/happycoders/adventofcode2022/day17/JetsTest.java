package eu.happycoders.adventofcode2022.day17;

import static eu.happycoders.adventofcode2022.day17.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JetsTest {

  @Test
  void givenJetsWithTestInput_next_returnsTheInputDirectionsAndWrapsAround() {
    Jets jets = new Jets(TEST_INPUT);

    StringBuilder directions = new StringBuilder();
    for (int i = 0; i < 5 * TEST_INPUT.length(); i++) {
      directions.append(jets.next() == Direction.RIGHT ? '>' : '<');
    }

    assertThat(directions.toString()).isEqualTo(TEST_INPUT.repeat(5));
  }
}
