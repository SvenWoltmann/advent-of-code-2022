package eu.happycoders.adventofcode2022.day14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day14SolverTest {

  @Test
  void givenTestInput_solvePart1_returns24() {
    String input = TestInputs.TEST_INPUT;

    int sum = Day14Solver.solvePart1(input);

    assertThat(sum).isEqualTo(24);
  }

  @Test
  void givenTestInput_solvePart2_returns93() {
    String input = TestInputs.TEST_INPUT;

    int sum = Day14Solver.solvePart2(input);

    assertThat(sum).isEqualTo(93);
  }
}
