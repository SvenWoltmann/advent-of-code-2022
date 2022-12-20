package eu.happycoders.adventofcode2022.day20;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day20SolverTest {

  @Test
  void givenTestInput_solveTask1_returns3() {
    String input = TestInputs.TEST_INPUT;

    long groveCoordinates = Day20Solver.solveTask1(input);

    assertThat(groveCoordinates).isEqualTo(3L);
  }

  @Test
  void givenTestInput_solveTask2_returns1623178306() {
    String input = TestInputs.TEST_INPUT;

    long groveCoordinates = Day20Solver.solveTask2(input);

    assertThat(groveCoordinates).isEqualTo(1623178306L);
  }
}
