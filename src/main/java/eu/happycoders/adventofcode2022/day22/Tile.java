package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A tile on the board map.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Tile {
  OPEN('.'),
  WALL('#');

  private final char symbol;

  Tile(char symbol) {
    this.symbol = symbol;
  }

  char symbol() {
    return symbol;
  }
}
