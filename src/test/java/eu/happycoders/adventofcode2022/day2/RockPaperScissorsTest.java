package eu.happycoders.adventofcode2022.day2;

import static eu.happycoders.adventofcode2022.day2.Shape.PAPER;
import static eu.happycoders.adventofcode2022.day2.Shape.ROCK;
import static eu.happycoders.adventofcode2022.day2.Shape.SCISSORS;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RockPaperScissorsTest {

  private static Stream<Arguments> rockPaperScissorsInput() {
    return Stream.of(
        Arguments.of(ROCK, ROCK, Outcome.DRAW),
        Arguments.of(ROCK, PAPER, Outcome.LOOSE),
        Arguments.of(ROCK, SCISSORS, Outcome.WIN),
        Arguments.of(PAPER, ROCK, Outcome.WIN),
        Arguments.of(PAPER, PAPER, Outcome.DRAW),
        Arguments.of(PAPER, SCISSORS, Outcome.LOOSE),
        Arguments.of(SCISSORS, ROCK, Outcome.LOOSE),
        Arguments.of(SCISSORS, PAPER, Outcome.WIN),
        Arguments.of(SCISSORS, SCISSORS, Outcome.DRAW));
  }

  @ParameterizedTest
  @MethodSource("rockPaperScissorsInput")
  void givenMyShapeAndTheOpponentsShape_playRound_returnsTheExpectedOutcome(
      Shape myShape, Shape opponentShape, Outcome expectedOutcome) {
    Outcome outcome = RockPaperScissors.playRound(myShape, opponentShape);

    assertThat(outcome).isEqualTo(expectedOutcome);
  }
}
