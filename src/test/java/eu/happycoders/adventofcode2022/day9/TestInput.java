package eu.happycoders.adventofcode2022.day9;

import static eu.happycoders.adventofcode2022.day9.Direction.DOWN;
import static eu.happycoders.adventofcode2022.day9.Direction.LEFT;
import static eu.happycoders.adventofcode2022.day9.Direction.RIGHT;
import static eu.happycoders.adventofcode2022.day9.Direction.UP;

class TestInput {

  static final String TEST_INPUT =
      """
            R 4
            U 4
            L 3
            D 1
            R 4
            D 1
            L 5
            R 2""";

  static final String LARGER_TEST_INPUT =
      """
            R 5
            U 8
            L 8
            D 3
            R 17
            D 10
            L 25
            U 20""";

  static final Motions TEST_MOTIONS = getTestMotions();

  private static Motions getTestMotions() {
    Motions expectedMotions = new Motions();

    expectedMotions.add(RIGHT, 4);
    expectedMotions.add(UP, 4);
    expectedMotions.add(LEFT, 3);
    expectedMotions.add(DOWN, 1);
    expectedMotions.add(RIGHT, 4);
    expectedMotions.add(DOWN, 1);
    expectedMotions.add(LEFT, 5);
    expectedMotions.add(RIGHT, 2);

    return expectedMotions;
  }
}
