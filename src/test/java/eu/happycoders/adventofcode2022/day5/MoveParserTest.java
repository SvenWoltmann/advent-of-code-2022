package eu.happycoders.adventofcode2022.day5;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class MoveParserTest {

  @Test
  void givenASingleLineOfInput_parseMove_returnsTheCorrectMove() {
    String input = "move 13 from 7 to 8";

    Move move = MoveParser.parseMove(input);

    assertThat(move).isEqualTo(new Move(13, 7, 8));
  }

  @Test
  void givenMultipleLineOfInput_parseMoves_returnsTheCorrectMoves() {
    String input =
        """
            move 14 from 4 to 8
            move 3 from 9 to 7
            move 4 from 5 to 9""";

    List<Move> moves = MoveParser.parseMoves(input);

    assertThat(moves)
        .containsExactly(
            new Move(14, 4, 8), //
            new Move(3, 9, 7),
            new Move(4, 5, 9));
  }
}
