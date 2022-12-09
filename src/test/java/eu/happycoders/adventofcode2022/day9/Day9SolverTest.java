package eu.happycoders.adventofcode2022.day9;

import static eu.happycoders.adventofcode2022.day9.TestInput.LARGER_TEST_INPUT;
import static eu.happycoders.adventofcode2022.day9.TestInput.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day9SolverTest {

  @Test
  void givenTestInput_calculateNumberOfTailPositionsForRopeLength2_returns13() {
    String input = TEST_INPUT;

    int numberOfTailPositions = Day9Solver.calculateNumberOfTailPositions(input, 2);

    assertThat(numberOfTailPositions).isEqualTo(13);
  }

  @Test
  void givenTestInput_calculateNumberOfTailPositionsForRopeLength10_returns1() {
    String input = TEST_INPUT;

    int numberOfTailPositions = Day9Solver.calculateNumberOfTailPositions(input, 10);

    assertThat(numberOfTailPositions).isEqualTo(1);
  }

  @Test
  void givenLargerTestInput_calculateNumberOfTailPositionsForRopeLength10_returns36() {
    String input = LARGER_TEST_INPUT;

    int numberOfTailPositions = Day9Solver.calculateNumberOfTailPositions(input, 10);

    assertThat(numberOfTailPositions).isEqualTo(36);
  }
}
