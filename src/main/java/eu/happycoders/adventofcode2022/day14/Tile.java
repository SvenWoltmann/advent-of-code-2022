package eu.happycoders.adventofcode2022.day14;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A tile on the vertical slice of the cave.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Tile {
  ROCK('#'),
  AIR('.'),
  SOURCE_OF_SAND('+'),
  SAND('o'),
  FLOWING_SAND('~');

  private final char symbol;

  Tile(char symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return String.valueOf(symbol);
  }
}
