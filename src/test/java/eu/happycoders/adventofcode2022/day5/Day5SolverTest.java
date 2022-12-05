package eu.happycoders.adventofcode2022.day5;

import static eu.happycoders.adventofcode2022.day5.TestInput.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day5SolverTest {

  @Test
  void givenTestInputAndCrateMover9000_solve_returnsCMZ() {
    String result = Day5Solver.solve(TEST_INPUT, new CrateMover9000());

    assertThat(result).isEqualTo("CMZ");
  }

  @Test
  void givenTestInputAndCrateMover9001_solve_returnsMCD() {
    String result = Day5Solver.solve(TEST_INPUT, new CrateMover9001());

    assertThat(result).isEqualTo("MCD");
  }
}
