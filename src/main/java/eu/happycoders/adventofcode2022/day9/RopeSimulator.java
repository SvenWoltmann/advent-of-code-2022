package eu.happycoders.adventofcode2022.day9;

import java.util.HashSet;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A rope simulator allowing to apply a given list of motions to a rope of a given length.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class RopeSimulator {

  private final Rope rope;
  private final Set<Position> tailPositions = new HashSet<>();

  RopeSimulator(int ropeLength) {
    rope = new Rope(ropeLength);
    tailPositions.add(rope.getTailPos());
  }

  void move(Motions motions) {
    for (Motion motion : motions.toList()) {
      apply(motion);
    }
  }

  private void apply(Motion motion) {
    for (int i = 0; i < motion.steps(); i++) {
      rope.moveHead(motion.direction());
      tailPositions.add(rope.getTailPos());
    }
  }

  int getNumberOfTailPositions() {
    return tailPositions.size();
  }

  @Override
  public String toString() {
    Borders borders = getBorders();

    int width = borders.getWidth();
    int height = borders.getHeight();

    boolean[][] field = new boolean[width][height];
    for (Position tailPosition : tailPositions) {
      field[tailPosition.x() - borders.minX()][tailPosition.y() - borders.minY()] = true;
    }

    StringBuilder result = new StringBuilder();
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        if (x + borders.minX() == 0 && y + borders.minY() == 0) {
          result.append('s');
        } else {
          result.append(field[x][y] ? '#' : '.');
        }
      }
      result.append('\n');
    }

    return result.toString();
  }

  private Borders getBorders() {
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxY = Integer.MIN_VALUE;

    for (Position tailPosition : tailPositions) {
      if (tailPosition.x() < minX) {
        minX = tailPosition.x();
      }
      if (tailPosition.x() > maxX) {
        maxX = tailPosition.x();
      }
      if (tailPosition.y() < minY) {
        minY = tailPosition.y();
      }
      if (tailPosition.y() > maxY) {
        maxY = tailPosition.y();
      }
    }

    return new Borders(minX, maxX, minY, maxY);
  }
}
