package eu.happycoders.adventofcode2022.day14;

import static eu.happycoders.adventofcode2022.day14.Tile.ROCK;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Initializes all rocks in a cave.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CaveRockInitializer {

  private final Cave cave;

  CaveRockInitializer(Cave cave) {
    this.cave = cave;
  }

  void setRockTilesInCave(List<RockShape> rockShapes) {
    for (RockShape rockShape : rockShapes) {
      for (int i = 1; i < rockShape.positions().size(); i++) {
        Position from = rockShape.positions().get(i - 1);
        Position to = rockShape.positions().get(i);
        setRockTiles(from, to);
      }
    }
  }

  private void setRockTiles(Position from, Position to) {
    if (from.y() == to.y()) {
      setHorizontalLineOfRocks(from, to);
    } else if (from.x() == to.x()) {
      setVerticalLineOfRocks(from, to);
    } else {
      throw new IllegalArgumentException("No straight path exists from " + from + " to " + to);
    }
  }

  private void setHorizontalLineOfRocks(Position from, Position to) {
    int minX = Math.min(from.x(), to.x());
    int maxX = Math.max(from.x(), to.x());
    for (int x = minX; x <= maxX; x++) {
      cave.setTile(new Position(x, from.y()), ROCK);
    }
  }

  private void setVerticalLineOfRocks(Position from, Position to) {
    int minY = Math.min(from.y(), to.y());
    int maxY = Math.max(from.y(), to.y());
    for (int y = minY; y <= maxY; y++) {
      cave.setTile(new Position(from.x(), y), ROCK);
    }
  }
}
