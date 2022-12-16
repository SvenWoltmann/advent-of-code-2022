package eu.happycoders.adventofcode2022.day16;

import static eu.happycoders.adventofcode2022.day16.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day16SolverTest {

  @Test
  void givenTheTestInput_solvePart1_returns1651() {
    String input = TEST_INPUT;

    int mostPressure = Day16Solver.solvePart1(input);

    assertThat(mostPressure).isEqualTo(1651);
  }

  @Test
  void givenTheTestInput_solvePart2_returns1707() {
    String input = TEST_INPUT;

    int mostPressure = Day16Solver.solvePart2(input);

    assertThat(mostPressure).isEqualTo(1707);
  }
}
