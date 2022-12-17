package eu.happycoders.adventofcode2022.day17;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day17SolverTest {

  @Test
  void givenTheTestInput_solveFor2022Rocks_returns_3068() {
    String input = TestInputs.TEST_INPUT;

    long height = Day17Solver.solve(input, 2022, true);

    assertThat(height).isEqualTo(3068L);
  }
}
