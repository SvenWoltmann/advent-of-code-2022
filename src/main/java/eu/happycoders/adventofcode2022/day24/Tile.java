package eu.happycoders.adventofcode2022.day24;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A tile on the valley map.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Tile {
  CLEAR_GROUND('.'),
  UP('^'),
  DOWN('v'),
  LEFT('<'),
  RIGHT('>');

  private final char symbol;

  Tile(char symbol) {
    this.symbol = symbol;
  }

  char symbol() {
    return symbol;
  }

  static Tile of(char symbol) {
    // No need to optimize for speed here, this is called only once when the map is parsed
    for (Tile value : values()) {
      if (value.symbol == symbol) {
        return value;
      }
    }
    throw new IllegalArgumentException("Unknown symbol: " + symbol);
  }
}
