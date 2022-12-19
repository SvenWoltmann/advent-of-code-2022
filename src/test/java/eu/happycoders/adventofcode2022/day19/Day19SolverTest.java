package eu.happycoders.adventofcode2022.day19;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day19SolverTest {

  @Test
  void givenTheTestInput_solveTask1_returns33() {
    String input = TestInputs.TEST_INPUT;

    int sumOfQualityLevels = Day19Solver.solveTask1(input);

    assertThat(sumOfQualityLevels).isEqualTo(33);
  }

  @Test
  void givenTheTestInput_solveTask2_returns3472() {
    String input = TestInputs.TEST_INPUT;

    int productOfLargestNumbersOfGeodes = Day19Solver.solveTask2(input);

    assertThat(productOfLargestNumbersOfGeodes).isEqualTo(3472);
  }
}
