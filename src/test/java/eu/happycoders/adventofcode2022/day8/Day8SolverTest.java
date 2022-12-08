package eu.happycoders.adventofcode2022.day8;

import static eu.happycoders.adventofcode2022.day8.TestInput.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day8SolverTest {

  @Test
  void givenTestInput_getVisibleTrees_returns21() {
    int visibleTrees = Day8Solver.getVisibleTrees(TEST_INPUT);
    assertThat(visibleTrees).isEqualTo(21);
  }

  @Test
  void givenTestInput_getHighestScenicScore_returns8() {
    int highestScenicScore = Day8Solver.getHighestScenicScore(TEST_INPUT);
    assertThat(highestScenicScore).isEqualTo(8);
  }
}
