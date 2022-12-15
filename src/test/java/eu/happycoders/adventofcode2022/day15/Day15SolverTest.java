package eu.happycoders.adventofcode2022.day15;

import static eu.happycoders.adventofcode2022.day15.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day15SolverTest {

  @Test
  void givenTheTestInput_solvePart1_returns26() {
    String input = TEST_INPUT;

    int numberOfPositionsWithoutBeacon = Day15Solver.solvePart1(input, 10);

    assertThat(numberOfPositionsWithoutBeacon).isEqualTo(26);
  }

  @Test
  void givenTheTestInput_solvePart2_returns56000011() {
    String input = TEST_INPUT;

    long tuningFrequency = Day15Solver.solvePart2(input, 20);

    assertThat(tuningFrequency).isEqualTo(56000011L);
  }
}
