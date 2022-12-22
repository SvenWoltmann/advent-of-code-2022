package eu.happycoders.adventofcode2022.day22;

import static eu.happycoders.adventofcode2022.day22.TestInputs.TEST_CUBE_RULES;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day22SolverTest {

  @Test
  void givenTestInput_solveTask1_returns6032() {
    String input = TestInputs.TEST_INPUT;

    int finalPassword = Day22Solver.solveTask1(input);

    assertThat(finalPassword).isEqualTo(6032);
  }

  @Test
  void givenTestInput_solveTask2_returns5031() {
    String input = TestInputs.TEST_INPUT;

    long result = Day22Solver.solveTask2(input, TEST_CUBE_RULES);

    assertThat(result).isEqualTo(5031);
  }
}
