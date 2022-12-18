package eu.happycoders.adventofcode2022.day18;

import java.util.List;

class TestInputs {

  static final String TEST_INPUT =
      """
          2,2,2
          1,2,2
          3,2,2
          2,1,2
          2,3,2
          2,2,1
          2,2,3
          2,2,4
          2,2,6
          1,2,5
          3,2,5
          2,1,5
          2,3,5""";

  static final List<Cube> TEST_CUBES = createTestCubes();

  private static List<Cube> createTestCubes() {
    return List.of(
        new Cube(2, 2, 2),
        new Cube(1, 2, 2),
        new Cube(3, 2, 2),
        new Cube(2, 1, 2),
        new Cube(2, 3, 2),
        new Cube(2, 2, 1),
        new Cube(2, 2, 3),
        new Cube(2, 2, 4),
        new Cube(2, 2, 6),
        new Cube(1, 2, 5),
        new Cube(3, 2, 5),
        new Cube(2, 1, 5),
        new Cube(2, 3, 5));
  }
}
