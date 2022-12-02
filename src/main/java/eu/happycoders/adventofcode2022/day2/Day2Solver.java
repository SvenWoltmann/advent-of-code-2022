package eu.happycoders.adventofcode2022.day2;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 2.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day2Solver {

  private static final int EXPECTED_LENGTH_OF_INPUT_LINE = 3;

  static int calculateScoreWithGuessedMeaning(String input) {
    return input.lines().mapToInt(Day2Solver::calculateScoreWithGuessedMeaningForOneRound).sum();
  }

  static int calculateScoreWithGuessedMeaningForOneRound(String inputLine) {
    if (inputLine.length() != EXPECTED_LENGTH_OF_INPUT_LINE) {
      throw new IllegalArgumentException();
    }

    Shape opponentShape = Shape.of(inputLine.charAt(0));
    Shape myShape = Shape.of(inputLine.charAt(2));

    int shapeScore = myShape.score();
    int outcomeScore = RockPaperScissors.playRound(myShape, opponentShape).score();

    return shapeScore + outcomeScore;
  }

  static int calculateScoreWithCorrectMeaning(String input) {
    return input.lines().mapToInt(Day2Solver::calculateScoreWithCorrectMeaningForOneRound).sum();
  }

  static int calculateScoreWithCorrectMeaningForOneRound(String inputLine) {
    if (inputLine.length() != EXPECTED_LENGTH_OF_INPUT_LINE) {
      throw new IllegalArgumentException();
    }

    Shape opponentShape = Shape.of(inputLine.charAt(0));
    Outcome requiredOutcome = Outcome.of(inputLine.charAt(2));

    // Trivial solution: Just try all three
    for (Shape myShape : Shape.values()) {
      Outcome outcome = RockPaperScissors.playRound(myShape, opponentShape);
      if (outcome == requiredOutcome) {
        int shapeScore = myShape.score();
        int outcomeScore = outcome.score();
        return shapeScore + outcomeScore;
      }
    }

    throw new IllegalStateException();
  }
}
