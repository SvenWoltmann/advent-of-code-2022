package eu.happycoders.adventofcode2022.day24;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day24SolverTest {

  @Test
  void givenTestInput_solveTask1_returns18() {
    String input = TestInputs.TEST_INPUT_WITH_MORE_BLIZZARDS;

    int fastestPathInMinutes = Day24Solver.solveTask1(input);

    assertThat(fastestPathInMinutes).isEqualTo(18);
  }

  @Test
  void givenTestInput_solveTask2_returns54() {
    String input = TestInputs.TEST_INPUT_WITH_MORE_BLIZZARDS;

    int fastestPathInMinutes = Day24Solver.solveTask2(input);

    assertThat(fastestPathInMinutes).isEqualTo(54);
  }
}
