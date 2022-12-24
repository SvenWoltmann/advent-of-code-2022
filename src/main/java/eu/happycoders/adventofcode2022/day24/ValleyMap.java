package eu.happycoders.adventofcode2022.day24;

import java.util.Arrays;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The valley map of blizzards.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ValleyMap {

  private final int width;
  private final int height;
  private final Tile[][] tiles;
  private final Position startPosition;
  private final Position targetPosition;

  ValleyMap(Tile[][] tiles) {
    this.width = tiles[0].length;
    this.height = tiles.length;
    this.tiles = tiles;

    this.startPosition = new Position(0, -1);
    this.targetPosition = new Position(width - 1, height);
  }

  Position startPosition() {
    return startPosition;
  }

  Position targetPosition() {
    return targetPosition;
  }

  boolean contains(Position position) {
    return position.column() >= 0
        && position.column() < width
        && position.row() >= 0
        && position.row() < height;
  }

  boolean isBlizzardAtMinute(Position position, int minute) {
    return isUpBlizzardAtMinute(position, minute)
        || isDownBlizzardAtMinute(position, minute)
        || isLeftBlizzardAtMinute(position, minute)
        || isRightBlizzardAtMinute(position, minute);
  }

  private boolean isUpBlizzardAtMinute(Position position, int minute) {
    return tiles[modulo(position.row() + minute, height)][position.column()] == Tile.UP;
  }

  private boolean isDownBlizzardAtMinute(Position position, int minute) {
    return tiles[modulo(position.row() - minute, height)][position.column()] == Tile.DOWN;
  }

  private boolean isLeftBlizzardAtMinute(Position position, int minute) {
    return tiles[position.row()][modulo(position.column() + minute, width)] == Tile.LEFT;
  }

  private boolean isRightBlizzardAtMinute(Position position, int minute) {
    return tiles[position.row()][modulo(position.column() - minute, width)] == Tile.RIGHT;
  }

  private int modulo(int numerator, int denominator) {
    int result = numerator % denominator;
    if (result < 0) {
      result += denominator;
    }
    return result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    ValleyMap that = (ValleyMap) object;
    return Arrays.deepEquals(tiles, that.tiles);
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(tiles);
  }

  @Override
  public String toString() {
    return toStringAtTime(0);
  }

  String toStringAtTime(int minute) {
    StringBuilder result = new StringBuilder();

    for (int row = 0; row < height; row++) {
      for (int column = 0; column < width; column++) {
        result.append(getSymbolAtMinute(new Position(column, row), minute));
      }
      result.append('\n');
    }

    return result.toString();
  }

  private char getSymbolAtMinute(Position position, int minute) {
    boolean isUpBlizzard = isUpBlizzardAtMinute(position, minute);
    boolean isDownBlizzard = isDownBlizzardAtMinute(position, minute);
    boolean isLeftBlizzard = isLeftBlizzardAtMinute(position, minute);
    boolean isRightBlizzard = isRightBlizzardAtMinute(position, minute);

    int count = countBlizzards(isUpBlizzard, isDownBlizzard, isLeftBlizzard, isRightBlizzard);
    if (count == 0) {
      return Tile.CLEAR_GROUND.symbol();
    } else if (count == 1) {
      if (isUpBlizzard) {
        return Tile.UP.symbol();
      } else if (isDownBlizzard) {
        return Tile.DOWN.symbol();
      } else if (isLeftBlizzard) {
        return Tile.LEFT.symbol();
      } else {
        return Tile.RIGHT.symbol();
      }
    } else {
      return (char) ('0' + count);
    }
  }

  private static int countBlizzards(
      boolean isUpBlizzard,
      boolean isDownBlizzard,
      boolean isLeftBlizzard,
      boolean isRightBlizzard) {
    int count = 0;
    if (isUpBlizzard) {
      count++;
    }
    if (isDownBlizzard) {
      count++;
    }
    if (isLeftBlizzard) {
      count++;
    }
    if (isRightBlizzard) {
      count++;
    }
    return count;
  }
}
