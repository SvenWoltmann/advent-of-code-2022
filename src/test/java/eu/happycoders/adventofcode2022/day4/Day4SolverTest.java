package eu.happycoders.adventofcode2022.day4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day4SolverTest {

  public static final String TEST_INPUT =
      """
        2-4,6-8
        2-3,4-5
        5-7,7-9
        2-8,3-7
        6-6,4-6
        2-6,4-8""";

  @Test
  void givenTheTestInput_countFullContainments_returns2() {
    int fullContainments = Day4Solver.countFullContainments(TEST_INPUT);

    assertThat(fullContainments).isEqualTo(2);
  }

  @Test
  void givenTheTestInput_countOverlaps_returns4() {
    int fullContainments = Day4Solver.countOverlaps(TEST_INPUT);

    assertThat(fullContainments).isEqualTo(4);
  }
}
