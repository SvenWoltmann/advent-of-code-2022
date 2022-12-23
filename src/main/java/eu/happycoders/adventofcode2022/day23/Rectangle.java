package eu.happycoders.adventofcode2022.day23;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A rectangle with its min/max X/Y coordinates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Rectangle(int minX, int minY, int maxX, int maxY) {

  int area() {
    int width = maxX - minX + 1;
    int height = maxY - minY + 1;
    return width * height;
  }
}
