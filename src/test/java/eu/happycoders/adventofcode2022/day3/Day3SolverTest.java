package eu.happycoders.adventofcode2022.day3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day3SolverTest {

  public static final String TEST_INPUT =
      """
        vJrwpWtwJgWrhcsFMMfFFhFp
        jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
        PmmdzqPrVvPwwTWBwg
        wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
        ttgJtRGJQctTZtZT
        CrZsJsPPZsGzwwsLwLmpwMDw""";

  @Test
  void givenTestInput_calculateSumOfPriorities_returns157() {
    int sumOfPriorities = Day3Solver.calculateSumOfPriorities(TEST_INPUT);

    assertThat(sumOfPriorities).isEqualTo(157);
  }

  @Test
  void givenTestInput_calculateSumOfPrioritiesForGroupsOfThree_returns70() {
    int sumOfPriorities = Day3Solver.calculateSumOfPrioritiesForGroupsOfThree(TEST_INPUT);

    assertThat(sumOfPriorities).isEqualTo(70);
  }
}
