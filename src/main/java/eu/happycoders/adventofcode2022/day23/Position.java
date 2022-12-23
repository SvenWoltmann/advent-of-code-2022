package eu.happycoders.adventofcode2022.day23;

import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A position with X/Y coordinates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
@SuppressWarnings("PMD.ShortVariable") // x and y are OK!
record Position(int x, int y) {

  List<Position> getEightAdjacentPositions() {
    List<Position> result = new ArrayList<>();

    for (Direction direction : Direction.values()) {
      result.add(at(direction));
    }

    return result;
  }

  Position at(Direction direction) {
    return switch (direction) {
      case NORTH -> new Position(x, y - 1);
      case NORTH_EAST -> new Position(x + 1, y - 1);
      case EAST -> new Position(x + 1, y);
      case SOUTH_EAST -> new Position(x + 1, y + 1);
      case SOUTH -> new Position(x, y + 1);
      case SOUTH_WEST -> new Position(x - 1, y + 1);
      case WEST -> new Position(x - 1, y);
      case NORTH_WEST -> new Position(x - 1, y - 1);
    };
  }
}
