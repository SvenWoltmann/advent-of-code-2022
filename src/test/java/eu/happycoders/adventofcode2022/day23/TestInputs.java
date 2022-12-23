package eu.happycoders.adventofcode2022.day23;

import java.util.List;

class TestInputs {

  static final String TEST_INPUT =
      """
          ....#..
          ..###.#
          #...#.#
          .#...##
          #.###..
          ##.#.##
          .#..#..""";

  static final List<Position> ELVES_POSITIONS =
      List.of(
          new Position(4, 0),
          new Position(2, 1),
          new Position(3, 1),
          new Position(4, 1),
          new Position(6, 1),
          new Position(0, 2),
          new Position(4, 2),
          new Position(6, 2),
          new Position(1, 3),
          new Position(5, 3),
          new Position(6, 3),
          new Position(0, 4),
          new Position(2, 4),
          new Position(3, 4),
          new Position(4, 4),
          new Position(0, 5),
          new Position(1, 5),
          new Position(3, 5),
          new Position(5, 5),
          new Position(6, 5),
          new Position(1, 6),
          new Position(4, 6));

  static final String TEST_INPUT_SMALL_EXAMPLE =
      """
          .....
          ..##.
          ..#..
          .....
          ..##.
          .....""";

  static final List<Position> ELVES_POSITIONS_SMALL_EXAMPLE =
      List.of(
          new Position(2, 1),
          new Position(3, 1),
          new Position(2, 2),
          new Position(2, 4),
          new Position(3, 4));
}
