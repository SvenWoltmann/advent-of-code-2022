package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The instruction to go forward a certain amount of tiles.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record GoForward(int numberOfTiles) implements Instruction {

  static GoForward tiles(int numberOfTiles) {
    return new GoForward(numberOfTiles);
  }
}
