package eu.happycoders.adventofcode2022.day2;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Rock-paper-scissors game simulator.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class RockPaperScissors {

  static Outcome playRound(Shape myShape, Shape opponentShape) {
    if (isDraw(myShape, opponentShape)) {
      return Outcome.DRAW;
    } else if (isWin(myShape, opponentShape)) {
      return Outcome.WIN;
    } else {
      return Outcome.LOOSE;
    }
  }

  private static boolean isDraw(Shape myShape, Shape opponentShape) {
    return myShape == opponentShape;
  }

  private static boolean isWin(Shape myShapeChar, Shape opponentShapeChar) {
    return myShapeChar == Shape.ROCK && opponentShapeChar == Shape.SCISSORS
        || myShapeChar == Shape.PAPER && opponentShapeChar == Shape.ROCK
        || myShapeChar == Shape.SCISSORS && opponentShapeChar == Shape.PAPER;
  }
}
