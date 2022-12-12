package eu.happycoders.adventofcode2022.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The height map puzzle input.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class HeightMap {

  static final char MIN_HEIGHT = 'a';
  static final char MAX_HEIGHT = 'z';

  private final Size size;
  private final int[][] heights;

  HeightMap(Size size) {
    this.size = size;
    this.heights = new int[size.height()][size.width()];
  }

  Size getSize() {
    return size;
  }

  void setHeight(Position position, int height) {
    if (height < MIN_HEIGHT || height > MAX_HEIGHT) {
      throw new IllegalArgumentException("Invalid height: " + (char) height);
    }
    heights[position.y()][position.x()] = height;
  }

  int getHeight(Position position) {
    return heights[position.y()][position.x()];
  }

  List<Position> getAllStartingPoints() {
    List<Position> result = new ArrayList<>();
    for (int y = 0; y < size.height(); y++) {
      for (int x = 0; x < size.width(); x++) {
        if (heights[y][x] == MIN_HEIGHT) {
          result.add(new Position(x, y));
        }
      }
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

    HeightMap that = (HeightMap) object;
    return Objects.equals(size, that.size) && Arrays.deepEquals(heights, that.heights);
  }

  @Override
  public int hashCode() {
    int result = size != null ? size.hashCode() : 0;
    result = 31 * result + Arrays.deepHashCode(heights);
    return result;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int y = 0; y < size.height(); y++) {
      for (int x = 0; x < size.width(); x++) {
        result.append((char) heights[y][x]);
      }
      result.append('\n');
    }
    return result.toString().stripTrailing();
  }
}
