package eu.happycoders.adventofcode2022.day24;

class TestInputs {

  static final String TEST_INPUT =
      """
          #.#####
          #.....#
          #>....#
          #.....#
          #...v.#
          #.....#
          #####.#""";

  static final ValleyMap TEST_VALLEY_MAP = createTestValleyMap();

  private static ValleyMap createTestValleyMap() {
    Tile[][] tiles = createGroundTiles(5, 5);

    tiles[1][0] = Tile.RIGHT;
    tiles[3][3] = Tile.DOWN;

    return new ValleyMap(tiles);
  }

  static final String TEST_INPUT_WITH_MORE_BLIZZARDS =
      """
          #.######
          #>>.<^<#
          #.<..<<#
          #>v.><>#
          #<^v^^>#
          ######.#""";

  static final ValleyMap TEST_VALLEY_MAP_WITH_MORE_BLIZZARDS =
      createTestValleyMapWithMoreBlizzards();

  private static ValleyMap createTestValleyMapWithMoreBlizzards() {
    Tile[][] tiles = createGroundTiles(4, 6);

    tiles[0][0] = Tile.RIGHT;
    tiles[0][1] = Tile.RIGHT;
    tiles[0][3] = Tile.LEFT;
    tiles[0][4] = Tile.UP;
    tiles[0][5] = Tile.LEFT;

    tiles[1][1] = Tile.LEFT;
    tiles[1][4] = Tile.LEFT;
    tiles[1][5] = Tile.LEFT;

    tiles[2][0] = Tile.RIGHT;
    tiles[2][1] = Tile.DOWN;
    tiles[2][3] = Tile.RIGHT;
    tiles[2][4] = Tile.LEFT;
    tiles[2][5] = Tile.RIGHT;

    tiles[3][0] = Tile.LEFT;
    tiles[3][1] = Tile.UP;
    tiles[3][2] = Tile.DOWN;
    tiles[3][3] = Tile.UP;
    tiles[3][4] = Tile.UP;
    tiles[3][5] = Tile.RIGHT;

    return new ValleyMap(tiles);
  }

  private static Tile[][] createGroundTiles(int height, int width) {
    Tile[][] tiles = new Tile[height][width];

    for (int row = 0; row < height; row++) {
      for (int column = 0; column < width; column++) {
        tiles[row][column] = Tile.CLEAR_GROUND;
      }
    }

    return tiles;
  }
}
