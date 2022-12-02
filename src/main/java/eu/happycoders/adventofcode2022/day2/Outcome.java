package eu.happycoders.adventofcode2022.day2;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Possible outcomes of the rock-paper-scissors game.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Outcome {
  LOOSE(0),
  DRAW(3),
  WIN(6);

  private final int score;

  Outcome(int score) {
    this.score = score;
  }

  int score() {
    return score;
  }

  static Outcome of(char symbol) {
    return switch (symbol) {
      case 'X' -> LOOSE;
      case 'Y' -> DRAW;
      case 'Z' -> WIN;
      default -> throw new IllegalArgumentException("Unknown symbol: " + symbol);
    };
  }
}
