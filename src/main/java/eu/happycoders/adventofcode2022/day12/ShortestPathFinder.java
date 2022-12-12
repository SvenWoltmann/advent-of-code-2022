package eu.happycoders.adventofcode2022.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Finds the shortest path on the height map from the given start to the given end.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ShortestPathFinder {

  private final HeightMap map;
  private final Size size;

  private final Position start;
  private final Position end;

  private final int[][] steps;

  ShortestPathFinder(HeightMap map, Position start, Position end) {
    this.map = map;
    this.size = map.getSize();

    this.start = start;
    this.end = end;

    this.steps = new int[size.height()][size.width()];
  }

  Optional<Integer> getLengthOfShortestPath() {
    List<Position> positions = List.of(start);
    List<Position> newPositions = new ArrayList<>();

    int stepNo = 1;
    for (; ; stepNo++) {
      for (Position position : positions) {
        int sourceHeight = map.getHeight(position);

        tryGoTo(position.top(), sourceHeight, stepNo, newPositions);
        tryGoTo(position.right(), sourceHeight, stepNo, newPositions);
        tryGoTo(position.bottom(), sourceHeight, stepNo, newPositions);
        tryGoTo(position.left(), sourceHeight, stepNo, newPositions);
      }

      if (newPositions.isEmpty()) {
        return Optional.empty();
      }

      if (newPositions.contains(end)) {
        break;
      }

      positions = newPositions;
      newPositions = new ArrayList<>();
    }

    return Optional.of(stepNo);
  }

  private void tryGoTo(Position target, int sourceHeight, int stepNo, List<Position> newPositions) {
    if (!target.equals(start)
        && isOnMap(target)
        && map.getHeight(target) <= sourceHeight + 1
        && steps[target.y()][target.x()] == 0) {
      steps[target.y()][target.x()] = stepNo;
      newPositions.add(target);
    }
  }

  private boolean isOnMap(Position position) {
    return position.x() >= 0
        && position.x() < size.width()
        && position.y() >= 0
        && position.y() < size.height();
  }
}
