package eu.happycoders.adventofcode2022.day25;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day25SolverTest {

  @Test
  void givenTheTestInput_solveTask1_returnsSumInSnafu() {
    String input = TestInputs.TEST_INPUT;

    String sumInSnafu = Day25Solver.solveTask1(input);

    assertThat(sumInSnafu).isEqualTo("2=-1=0");
  }
}
