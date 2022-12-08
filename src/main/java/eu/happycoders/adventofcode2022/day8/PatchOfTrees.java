package eu.happycoders.adventofcode2022.day8;

import static eu.happycoders.adventofcode2022.day8.Direction.BOTTOM;
import static eu.happycoders.adventofcode2022.day8.Direction.LEFT;
import static eu.happycoders.adventofcode2022.day8.Direction.RIGHT;
import static eu.happycoders.adventofcode2022.day8.Direction.TOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A patch of tall trees all planted carefully in a grid.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PatchOfTrees {

  private final Size size;
  private final Tree[][] trees;

  PatchOfTrees(Size size) {
    this.size = size;
    this.trees = new Tree[size.rows()][size.columns()];
  }

  void setTree(Position position, Tree tree) {
    trees[position.row()][position.column()] = tree;
  }

  int getVisibleTrees() {
    return (int) getAllPositions().stream().filter(this::isVisible).count();
  }

  private boolean isVisible(Position position) {
    return isVisibleFrom(position, TOP)
        || isVisibleFrom(position, RIGHT)
        || isVisibleFrom(position, BOTTOM)
        || isVisibleFrom(position, LEFT);
  }

  private boolean isVisibleFrom(Position position, Direction direction) {
    int treeHeight = treeAt(position).height();

    position = position.moveTo(direction);
    while (isInPatch(position)) {
      if (treeAt(position).height() >= treeHeight) {
        return false;
      }
      position = position.moveTo(direction);
    }

    return true;
  }

  int getHighestScenicScore() {
    return getAllPositions().stream().mapToInt(this::getScenicScoreAt).max().orElseThrow();
  }

  int getScenicScoreAt(Position position) {
    return getViewingDistance(position, TOP)
        * getViewingDistance(position, RIGHT)
        * getViewingDistance(position, BOTTOM)
        * getViewingDistance(position, LEFT);
  }

  private int getViewingDistance(Position startPosition, Direction direction) {
    int treeHeight = treeAt(startPosition).height();

    int distance = 0;

    Position position = startPosition.moveTo(direction);
    while (isInPatch(position)) {
      distance++;
      if (treeAt(position).height() >= treeHeight) {
        break;
      }
      position = position.moveTo(direction);
    }

    return distance;
  }

  private List<Position> getAllPositions() {
    List<Position> result = new ArrayList<>();
    for (int row = 0; row < size.rows(); row++) {
      for (int column = 0; column < size.columns(); column++) {
        result.add(new Position(column, row));
      }
    }
    return result;
  }

  private Tree treeAt(Position position) {
    return trees[position.row()][position.column()];
  }

  private boolean isInPatch(Position position) {
    return position.column() >= 0
        && position.column() < size.columns()
        && position.row() >= 0
        && position.row() < size.rows();
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }

    PatchOfTrees that = (PatchOfTrees) other;
    return Arrays.deepEquals(trees, that.trees);
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(trees);
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (Tree[] treeRow : trees) {
      for (Tree tree : treeRow) {
        if (tree == null) {
          result.append('.');
        } else {
          result.append(tree.height());
        }
      }
      result.append('\n');
    }
    return result.toString();
  }
}
