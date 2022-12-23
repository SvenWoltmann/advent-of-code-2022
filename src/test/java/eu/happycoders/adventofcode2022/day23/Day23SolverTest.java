package eu.happycoders.adventofcode2022.day23;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day23SolverTest {

  @Test
  void givenTestInput_solveTask1_returns110() {
    String input = TestInputs.TEST_INPUT;

    int numberOfEmptyGroundTiles = Day23Solver.solveTask1(input);

    assertThat(numberOfEmptyGroundTiles).isEqualTo(110);
  }

  @Test
  void givenTestInput_solveTask2_returns20() {
    String input = TestInputs.TEST_INPUT;

    int firstRoundWithoutMoves = Day23Solver.solveTask2(input);

    assertThat(firstRoundWithoutMoves).isEqualTo(20);
  }
}
