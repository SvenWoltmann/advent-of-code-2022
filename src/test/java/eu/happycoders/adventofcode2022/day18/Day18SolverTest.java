package eu.happycoders.adventofcode2022.day18;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day18SolverTest {

  @Test
  void givenTheTestInput_solveTask1_returns64() {
    String input = TestInputs.TEST_INPUT;

    int surfaceArea = Day18Solver.solveTask1(input);

    assertThat(surfaceArea).isEqualTo(64);
  }

  @Test
  void givenTheTestInput_solveTask2_returns64() {
    String input = TestInputs.TEST_INPUT;

    int surfaceArea = Day18Solver.solveTask2(input);

    assertThat(surfaceArea).isEqualTo(58);
  }
}
