package eu.happycoders.adventofcode2022.day13;

import static eu.happycoders.adventofcode2022.day13.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day13SolverTest {

  @Test
  void givenTestInput_getSumOfIndicesOfPacketsInRightOrder_returns13() {
    String input = TEST_INPUT;

    int sum = Day13Solver.getSumOfIndicesOfPacketsInRightOrder(input, true);

    assertThat(sum).isEqualTo(13);
  }

  @Test
  void givenTestInput_getDecoderKey_returns140() {
    String input = TEST_INPUT;

    int decoderKey = Day13Solver.getDecoderKey(input, true);

    assertThat(decoderKey).isEqualTo(140);
  }
}
