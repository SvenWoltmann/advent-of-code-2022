package eu.happycoders.adventofcode2022.day2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

class Day2SolverTest {

  @Test
  void givenInputAY_calculateScoreWithGuessedMeaningForOneRound_returns8() {
    int score = Day2Solver.calculateScoreWithGuessedMeaningForOneRound("A Y");
    assertThat(score).isEqualTo(8);
  }

  @Test
  void givenInputBY_calculateScoreWithGuessedMeaningForOneRound_returns1() {
    int score = Day2Solver.calculateScoreWithGuessedMeaningForOneRound("B X");
    assertThat(score).isEqualTo(1);
  }

  @Test
  void givenInputCZ_calculateScoreWithGuessedMeaningForOneRound_returns6() {
    int score = Day2Solver.calculateScoreWithGuessedMeaningForOneRound("C Z");
    assertThat(score).isEqualTo(6);
  }

  @Test
  void givenInvalidInput_calculateScoreWithGuessedMeaningForOneRound_throwsException() {
    ThrowableAssert.ThrowingCallable invocation =
        () -> Day2Solver.calculateScoreWithGuessedMeaningForOneRound("too long");

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }

  @Test
  void givenTestInputForThreeRounds_calculateScoreWithGuessedMeaning_returns15() {
    String testInput = """
              A Y
              B X
              C Z""";

    int score = Day2Solver.calculateScoreWithGuessedMeaning(testInput);

    assertThat(score).isEqualTo(15);
  }

  @Test
  void givenInputAY_calculateScoreWithCorrectMeaningForOneRound_returns4() {
    int score = Day2Solver.calculateScoreWithCorrectMeaningForOneRound("A Y");
    assertThat(score).isEqualTo(4);
  }

  @Test
  void givenInputBX_calculateScoreWithCorrectMeaningForOneRound_returns1() {
    int score = Day2Solver.calculateScoreWithCorrectMeaningForOneRound("B X");
    assertThat(score).isEqualTo(1);
  }

  @Test
  void givenInputCZ_calculateScoreWithCorrectMeaningForOneRound_returns7() {
    int score = Day2Solver.calculateScoreWithCorrectMeaningForOneRound("C Z");
    assertThat(score).isEqualTo(7);
  }

  @Test
  void givenInvalidInput_calculateScoreWithCorrectMeaningForOneRound_throwsException() {
    ThrowableAssert.ThrowingCallable invocation =
        () -> Day2Solver.calculateScoreWithCorrectMeaningForOneRound("too long");

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }

  @Test
  void givenTestInputForThreeRounds_calculateScoreWithCorrectMeaning_returns12() {
    String testInput = """
              A Y
              B X
              C Z""";

    int score = Day2Solver.calculateScoreWithCorrectMeaning(testInput);

    assertThat(score).isEqualTo(12);
  }
}
