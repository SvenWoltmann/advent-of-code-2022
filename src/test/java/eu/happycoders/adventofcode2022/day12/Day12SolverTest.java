package eu.happycoders.adventofcode2022.day12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day12SolverTest {

  @Test
  void givenTestInput_getLengthOfShortestPath_returns31() {
    String input = TestInputs.INPUT;

    int lengthOfShortestPath = Day12Solver.getLengthOfShortestPath(input);

    assertThat(lengthOfShortestPath).isEqualTo(31);
  }

  @Test
  void givenTestInput_getLengthOfShortestPathLengthFromAnyStartingPoint_returns29() {
    String input = TestInputs.INPUT;

    int shortestPathLength = Day12Solver.getLengthOfShortestPathLengthFromAnyStartingPoint(input);

    assertThat(shortestPathLength).isEqualTo(29);
  }
}
