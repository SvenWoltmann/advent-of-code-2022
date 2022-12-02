package eu.happycoders.adventofcode2022.day2;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Shapes used in the rock-paper-scissors game.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum Shape {
  ROCK(1),
  PAPER(2),
  SCISSORS(3);

  private final int score;

  Shape(int score) {
    this.score = score;
  }

  static Shape of(char symbol) {
    return switch (symbol) {
      case 'A', 'X' -> ROCK;
      case 'B', 'Y' -> PAPER;
      case 'C', 'Z' -> SCISSORS;
      default -> throw new IllegalArgumentException("Unknown symbol: " + symbol);
    };
  }

  int score() {
    return score;
  }
}
