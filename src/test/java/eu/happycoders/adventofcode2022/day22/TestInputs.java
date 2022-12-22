package eu.happycoders.adventofcode2022.day22;

import static eu.happycoders.adventofcode2022.day22.Direction.DOWN;
import static eu.happycoders.adventofcode2022.day22.Direction.LEFT;
import static eu.happycoders.adventofcode2022.day22.Direction.RIGHT;
import static eu.happycoders.adventofcode2022.day22.Direction.UP;

import java.util.List;

class TestInputs {

  static final String TEST_INPUT =
      """
                  ...#
                  .#..
                  #...
                  ....
          ...#.......#
          ........#...
          ..#....#....
          ..........#.
                  ...#....
                  .....#..
                  .#......
                  ......#.

          10R5L5R10L4R5L5""";

  static final BoardMap TEST_BOARD_MAP = createTestBoardMap();

  static final List<Instruction> TEST_INSTRUCTIONS =
      List.of(
          GoForward.tiles(10),
          TurnClockwise.INSTANCE,
          GoForward.tiles(5),
          TurnCounterClockwise.INSTANCE,
          GoForward.tiles(5),
          TurnClockwise.INSTANCE,
          GoForward.tiles(10),
          TurnCounterClockwise.INSTANCE,
          GoForward.tiles(4),
          TurnClockwise.INSTANCE,
          GoForward.tiles(5),
          TurnCounterClockwise.INSTANCE,
          GoForward.tiles(5));

  static final CubeLogic TEST_CUBE_RULES =
      new CubeLogic(
          4,
          List.of(
              new Wormhole(new WormholeCoordinates(2, UP), new WormholeCoordinates(4, UP)),
              new Wormhole(new WormholeCoordinates(2, LEFT), new WormholeCoordinates(5, UP)),
              new Wormhole(new WormholeCoordinates(2, RIGHT), new WormholeCoordinates(11, RIGHT)),
              new Wormhole(new WormholeCoordinates(4, LEFT), new WormholeCoordinates(11, DOWN)),
              new Wormhole(new WormholeCoordinates(4, DOWN), new WormholeCoordinates(10, DOWN)),
              new Wormhole(new WormholeCoordinates(5, DOWN), new WormholeCoordinates(10, LEFT)),
              new Wormhole(new WormholeCoordinates(6, RIGHT), new WormholeCoordinates(11, UP))));

  private static BoardMap createTestBoardMap() {
    BoardMap result = new BoardMap(16, 12);

    for (int row = 0; row < 4; row++) {
      for (int col = 8; col < 12; col++) {
        result.setTile(new Position(col, row), Tile.OPEN);
      }
    }

    result.setTile(new Position(11, 0), Tile.WALL);
    result.setTile(new Position(9, 1), Tile.WALL);
    result.setTile(new Position(8, 2), Tile.WALL);

    for (int row = 4; row < 8; row++) {
      for (int col = 0; col < 12; col++) {
        result.setTile(new Position(col, row), Tile.OPEN);
      }
    }

    result.setTile(new Position(3, 4), Tile.WALL);
    result.setTile(new Position(11, 4), Tile.WALL);
    result.setTile(new Position(8, 5), Tile.WALL);
    result.setTile(new Position(2, 6), Tile.WALL);
    result.setTile(new Position(7, 6), Tile.WALL);
    result.setTile(new Position(10, 7), Tile.WALL);

    for (int row = 8; row < 12; row++) {
      for (int col = 8; col < 16; col++) {
        result.setTile(new Position(col, row), Tile.OPEN);
      }
    }

    result.setTile(new Position(11, 8), Tile.WALL);
    result.setTile(new Position(13, 9), Tile.WALL);
    result.setTile(new Position(9, 10), Tile.WALL);
    result.setTile(new Position(14, 11), Tile.WALL);

    return result;
  }
}
