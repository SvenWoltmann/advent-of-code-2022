package eu.happycoders.adventofcode2022.day24;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ValleyWalkerTest {

  @Test
  void
      givenAValleyWalkerWithTheTestValley_findFastestPathAndReturnItsLengthInMinutes1Round_returns18() {
    ValleyWalker valleyWalker = new ValleyWalker(TestInputs.TEST_VALLEY_MAP_WITH_MORE_BLIZZARDS);

    int minMinutes = valleyWalker.findFastestPath(1);

    assertThat(minMinutes).isEqualTo(18);
  }

  @Test
  void
      givenAValleyWalkerWithTheTestValley_findFastestPathAndReturnItsLengthInMinutes2Rounds_returns54() {
    ValleyWalker valleyWalker = new ValleyWalker(TestInputs.TEST_VALLEY_MAP_WITH_MORE_BLIZZARDS);

    int minMinutes = valleyWalker.findFastestPath(3);

    assertThat(minMinutes).isEqualTo(54);
  }
}
