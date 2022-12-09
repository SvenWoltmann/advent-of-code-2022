package eu.happycoders.adventofcode2022.day9;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The minimum/maximum X and Y values of the rope's knots' coordinates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
public record Borders(int minX, int maxX, int minY, int maxY) {

  public int getWidth() {
    return maxX - minX + 1;
  }

  public int getHeight() {
    return maxY - minY + 1;
  }
}
