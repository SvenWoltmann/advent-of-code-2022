package eu.happycoders.adventofcode2022.day14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CaveTest {

  @Test
  void givenACaveWithTheTestPuzzleInput_letItFlowAndCountRestingUnitsOfSand_returns24() {
    Cave cave = new Cave(TestInputs.TEST_PUZZLE_INPUT, false);

    System.out.println("Initial cave:");
    System.out.println(cave);

    int result = cave.letItFlowAndCountRestingUnitsOfSand();

    System.out.println("Filled cave:");
    System.out.println(cave);

    assertThat(result).isEqualTo(24);
  }
}
