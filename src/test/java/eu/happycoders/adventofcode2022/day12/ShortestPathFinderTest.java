package eu.happycoders.adventofcode2022.day12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ShortestPathFinderTest {

  @Test
  void givenTheTestHeightMapAndStartAndEndPoints_getLengthOfShortestPath_returns31() {
    int shortestPathLength =
        new ShortestPathFinder(TestInputs.HEIGHT_MAP, TestInputs.START, TestInputs.END)
            .getLengthOfShortestPath()
            .orElseThrow();

    assertThat(shortestPathLength).isEqualTo(31);
  }
}
