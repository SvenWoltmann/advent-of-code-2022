package eu.happycoders.adventofcode2022.day11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day11SolverTest {

  static final String TEST_INPUT =
      """
        Monkey 0:
          Starting items: 79, 98
          Operation: new = old * 19
          Test: divisible by 23
            If true: throw to monkey 2
            If false: throw to monkey 3

        Monkey 1:
          Starting items: 54, 65, 75, 74
          Operation: new = old + 6
          Test: divisible by 19
            If true: throw to monkey 2
            If false: throw to monkey 0

        Monkey 2:
          Starting items: 79, 60, 97
          Operation: new = old * old
          Test: divisible by 13
            If true: throw to monkey 1
            If false: throw to monkey 3

        Monkey 3:
          Starting items: 74
          Operation: new = old + 3
          Test: divisible by 17
            If true: throw to monkey 0
            If false: throw to monkey 1""";

  @Test
  void givenTestInput_getLevelOfMonkeyBusinessPart1_returns10605() {
    long levelOfMonkeyBusiness = Day11Solver.getLevelOfMonkeyBusinessPart1(TEST_INPUT);

    assertThat(levelOfMonkeyBusiness).isEqualTo(10605L);
  }

  @Test
  void givenTestInput_getLevelOfMonkeyBusinessPart2_returns2713310158() {
    long levelOfMonkeyBusiness = Day11Solver.getLevelOfMonkeyBusinessPart2(TEST_INPUT);

    assertThat(levelOfMonkeyBusiness).isEqualTo(2713310158L);
  }
}
