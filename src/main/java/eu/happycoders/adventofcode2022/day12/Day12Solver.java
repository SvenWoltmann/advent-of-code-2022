package eu.happycoders.adventofcode2022.day12;

import java.util.List;
import java.util.Optional;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 12.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day12Solver {

  static int getLengthOfShortestPath(String inputString) {
    PuzzleInput input = PuzzleInputParser.parse(inputString);

    return new ShortestPathFinder(input.map(), input.start(), input.end())
        .getLengthOfShortestPath()
        .orElseThrow();
  }

  static int getLengthOfShortestPathLengthFromAnyStartingPoint(String inputString) {
    PuzzleInput input = PuzzleInputParser.parse(inputString);

    List<Position> starts = input.map().getAllStartingPoints();

    int shortestShortestPath = Integer.MAX_VALUE;
    for (Position start : starts) {
      Optional<Integer> shortestPath =
          new ShortestPathFinder(input.map(), start, input.end()).getLengthOfShortestPath();
      if (shortestPath.isPresent() && shortestPath.get() < shortestShortestPath) {
        shortestShortestPath = shortestPath.get();
      }
    }

    return shortestShortestPath;
  }
}
