package eu.happycoders.adventofcode2022.day17;

import static eu.happycoders.adventofcode2022.day17.Direction.LEFT;
import static eu.happycoders.adventofcode2022.day17.Direction.RIGHT;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A concrete rock instance placed at the given X/Y coordinates:
 *
 * <ul>
 *   <li>X = 0 means that the rock's left edge is two units away from the left wall of the chamber
 *   <li>Y = 0 means the rock is at the bottom of the chamber
 * </ul>
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Rock {

  private final RockShape shape;
  private int posX;
  private int bottomRow;
  private int spaceLeft;
  private int spaceRight;

  private int lastDeltaX;
  private int lastDeltaY;

  Rock(RockShape shape, int bottomRow) {
    this.shape = shape;
    this.posX = 0;
    this.bottomRow = bottomRow;
    this.spaceLeft = shape.initialSpaceLeft();
    this.spaceRight = shape.initialSpaceRight();
  }

  RockShape shape() {
    return shape;
  }

  int bottomRow() {
    return bottomRow;
  }

  int topRow() {
    return bottomRow + shape.height() - 1;
  }

  byte[] patternAtCurrentPosX() {
    return shape.patternAt(posX);
  }

  boolean couldBeMovedTo(Direction direction) {
    return direction == LEFT && spaceLeft > 0 || direction == RIGHT && spaceRight > 0;
  }

  void moveBy(int deltaX, int deltaY) {
    posX += deltaX;
    spaceLeft += deltaX;
    spaceRight -= deltaX;

    bottomRow += deltaY;

    // Remember move
    lastDeltaX = deltaX;
    lastDeltaY = deltaY;
  }

  void undoLastMove() {
    moveBy(-lastDeltaX, -lastDeltaY);

    lastDeltaX = 0;
    lastDeltaY = 0;
  }
}
