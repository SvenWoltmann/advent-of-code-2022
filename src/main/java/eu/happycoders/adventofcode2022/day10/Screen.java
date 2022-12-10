package eu.happycoders.adventofcode2022.day10;

import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The simulated cathode-ray tube screen.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Screen {

  private static final int SCREEN_WIDTH = 40;

  private final List<boolean[]> rows = new ArrayList<>();

  private boolean[] currentRow;
  private int currentX;

  void draw(boolean lit) {
    if (currentX == 0) {
      currentRow = new boolean[SCREEN_WIDTH];
      rows.add(currentRow);
    }

    currentRow[currentX] = lit;

    currentX++;
    if (currentX == SCREEN_WIDTH) {
      currentX = 0;
    }
  }

  int getCurrentX() {
    return currentX;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (boolean[] row : rows) {
      for (boolean lit : row) {
        result.append(lit ? '#' : '.');
      }
      result.append('\n');
    }
    return result.toString().stripTrailing();
  }
}
