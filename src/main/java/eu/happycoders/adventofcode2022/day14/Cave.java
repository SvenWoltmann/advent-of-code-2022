package eu.happycoders.adventofcode2022.day14;

import static eu.happycoders.adventofcode2022.day14.Tile.AIR;
import static eu.happycoders.adventofcode2022.day14.Tile.ROCK;
import static eu.happycoders.adventofcode2022.day14.Tile.SAND;
import static eu.happycoders.adventofcode2022.day14.Tile.SOURCE_OF_SAND;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The cave being filled with rocks.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class Cave {

  private final boolean withFloor;
  private final Tile[][] tiles;
  private final Borders borders;
  private final int width;
  private final int height;

  Cave(PuzzleInput input, boolean withFloor) {
    this.withFloor = withFloor;

    List<RockShape> rockShapes = input.rockShapes();

    this.borders = getBorders(rockShapes, withFloor);
    this.width = borders.maxX() - borders.minX() + 1;
    this.height = borders.maxY() + 1;

    this.tiles = createTiles();

    setTile(new Position(500, 0), SOURCE_OF_SAND);

    new CaveRockInitializer(this).setRockTilesInCave(rockShapes);

    if (withFloor) {
      for (int x = borders.minX(); x <= borders.maxX(); x++) {
        setTile(new Position(x, borders.maxY()), ROCK);
      }
    }
  }

  int letItFlowAndCountRestingUnitsOfSand() {
    int unitsOfSand = 0;

    while (true) {
      SandFlowResult result = produceOneSandAndLetItFlow();
      if (result == SandFlowResult.END_OF_GAME) {
        break;
      }
      unitsOfSand++;
    }

    return unitsOfSand;
  }

  private Borders getBorders(List<RockShape> rockShapes, boolean withFloor) {
    Borders result = findBorders(rockShapes);
    if (result.minY() < 0) {
      throw new IllegalArgumentException("y < 0 not allowed");
    }

    if (withFloor) {
      result = extendBordersForFloor(result);
    }

    return result;
  }

  private static Borders findBorders(List<RockShape> rockShapes) {
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxY = Integer.MIN_VALUE;

    for (RockShape rockShape : rockShapes) {
      for (Position position : rockShape.positions()) {
        minX = Math.min(minX, position.x());
        maxX = Math.max(maxX, position.x());
        minY = Math.min(minY, position.y());
        maxY = Math.max(maxY, position.y());
      }
    }

    return new Borders(minX, maxX, minY, maxY);
  }

  private Borders extendBordersForFloor(Borders borders) {
    int newMaxY = borders.maxY() + 2;
    int caveHeight = newMaxY + 1;
    return new Borders(
        borders.minX() - caveHeight,
        borders.maxX() + caveHeight,
        borders.minY(),
        borders.maxY() + 2);
  }

  private Tile[][] createTiles() {
    final Tile[][] result = new Tile[this.height][this.width];
    for (int y = 0; y < this.height; y++) {
      for (int x = 0; x < this.width; x++) {
        result[y][x] = AIR;
      }
    }
    return result;
  }

  void setTile(Position position, Tile tile) {
    tiles[position.y()][position.x() - borders.minX()] = tile;
  }

  Tile getTile(Position position) {
    if (position.x() < borders.minX()
        || position.x() > borders.maxX()
        || position.y() > borders.maxY()) {
      return AIR;
    }

    return tiles[position.y()][position.x() - borders.minX()];
  }

  private SandFlowResult produceOneSandAndLetItFlow() {
    Position position = new Position(500, 0);
    if (withFloor && getTile(position) == SAND) {
      return SandFlowResult.END_OF_GAME;
    }

    while (true) {
      makeSureSandCanBePutAt(position);
      Position nextPosition = findNextPosition(position);
      if (nextPosition == null) {
        setTile(position, SAND);
        return SandFlowResult.RESTING;
      } else if (isOutOfCave(position)) {
        if (withFloor) {
          throw new IllegalStateException("Out of cave although there's a floor");
        }
        return SandFlowResult.END_OF_GAME;
      }
      position = nextPosition;
    }
  }

  private void makeSureSandCanBePutAt(Position position) {
    if (getTile(position) != AIR && getTile(position) != SOURCE_OF_SAND) {
      throw new IllegalStateException("No air at " + position);
    }
  }

  private Position findNextPosition(Position position) {
    if (getTile(position.down()) == AIR) {
      return position.down();
    }
    if (getTile(position.downLeft()) == AIR) {
      return position.downLeft();
    }
    if (getTile(position.downRight()) == AIR) {
      return position.downRight();
    }
    return null;
  }

  private boolean isOutOfCave(Position position) {
    return position.x() < borders.minX()
        || position.x() > borders.maxX()
        || position.y() > borders.maxY();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        result.append(tiles[y][x]);
      }
      result.append('\n');
    }
    return result.toString();
  }

  enum SandFlowResult {
    RESTING,
    END_OF_GAME
  }
}
