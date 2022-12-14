package eu.happycoders.adventofcode2022.day14;

import java.util.ArrayList;
import java.util.List;

class TestInputs {

  static final String TEST_INPUT =
      """
            498,4 -> 498,6 -> 496,6
            503,4 -> 502,4 -> 502,9 -> 494,9""";

  static final PuzzleInput TEST_PUZZLE_INPUT = createTestPuzzleInput();

  private static PuzzleInput createTestPuzzleInput() {
    List<RockShape> rockShapes = new ArrayList<>();

    rockShapes.add(
        new RockShape(List.of(new Position(498, 4), new Position(498, 6), new Position(496, 6))));

    rockShapes.add(
        new RockShape(
            List.of(
                new Position(503, 4),
                new Position(502, 4),
                new Position(502, 9),
                new Position(494, 9))));

    return new PuzzleInput(rockShapes);
  }
}
