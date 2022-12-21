package eu.happycoders.adventofcode2022.day21;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day21SolverTest {

  @Test
  void givenTestInput_solveTask1_returns152() {
    String input = TestInputs.TEST_INPUT;

    long result = Day21Solver.solveTask1(input);

    assertThat(result).isEqualTo(152L);
  }

  @Test
  void givenTestInput_solveTask2_returns301() {
    String input = TestInputs.TEST_INPUT;

    long result = Day21Solver.solveTask2(input);

    assertThat(result).isEqualTo(301L);
  }
}
