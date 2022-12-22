package eu.happycoders.adventofcode2022.day22;

import java.util.Arrays;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A map of the board with its open tiles and walls.
 *
 * <p>This board uses 0-based coordinates, that makes all position calculation much easier.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class BoardMap {

  private final int width;
  private final int height;

  // With a board size of 150 x 200 = 30000,
  // we don't need to optimize for size and can easily use an enum to store a tile.
  private final Tile[][] tiles;

  BoardMap(int width, int height) {
    this.width = width;
    this.height = height;
    this.tiles = new Tile[height][width];
  }

  int width() {
    return width;
  }

  int height() {
    return height;
  }

  // Internally, we work with 0-based coordinates, that makes all position calculation much easier.
  void setTile(Position position, Tile tile) {
    tiles[position.row()][position.column()] = tile;
  }

  // Internally, we work with 0-based coordinates, that makes all position calculation much easier.
  Tile getTile(Position position) {
    return tiles[position.row()][position.column()];
  }

  Position findStartPosition() {
    // "leftmost open tile of the top row of tiles"
    for (int column = 0; column < width; column++) {
      Position position = new Position(column, 0);
      if (getTile(position) == Tile.OPEN) {
        return position;
      }
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    BoardMap that = (BoardMap) object;
    return Arrays.deepEquals(tiles, that.tiles);
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(tiles);
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    for (int row = 0; row < height; row++) {
      for (int column = 0; column < width; column++) {
        Tile tile = tiles[row][column];
        result.append(tile == null ? ' ' : tile.symbol());
      }
      result.append('\n');
    }

    return result.toString();
  }
}
