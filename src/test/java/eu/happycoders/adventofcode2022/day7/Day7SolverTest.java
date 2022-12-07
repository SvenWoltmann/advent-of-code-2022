package eu.happycoders.adventofcode2022.day7;

import static eu.happycoders.adventofcode2022.day7.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day7SolverTest {

  @Test
  void givenTheTestInput_findSumOfSizesOfDirectoriesWithMaximumTotalSize_returns95437() {
    long sum = Day7Solver.findSumOfSizesOfDirectoriesWithMaximumTotalSize(TEST_INPUT, 100_000);

    assertThat(sum).isEqualTo(95437);
  }

  @Test
  void givenTheTestInput_findSizeOfSmallestDirToDelete_returns24933642() {
    long size = Day7Solver.findSizeOfSmallestDirToDelete(TEST_INPUT, 70_000_000, 30_000_000);

    assertThat(size).isEqualTo(24933642);
  }
}
