package eu.happycoders.adventofcode2022.day5;

import static eu.happycoders.adventofcode2022.day5.TestInput.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

class PuzzleInputParserTest {

  @Test
  void givenTestInput_parse_returnsParsedPuzzleInput() {
    PuzzleInput result = PuzzleInputParser.parse(TEST_INPUT);

    assertThat(result.crateStacks().size()).isEqualTo(3);
    assertThat(result.crateStacks().stackAt(1)).isEqualTo(CrateStack.of('Z', 'N'));
    assertThat(result.crateStacks().stackAt(2)).isEqualTo(CrateStack.of('M', 'C', 'D'));
    assertThat(result.crateStacks().stackAt(3)).isEqualTo(CrateStack.of('P'));

    assertThat(result.moves())
        .containsExactly(
            new Move(1, 2, 1), //
            new Move(3, 1, 3),
            new Move(2, 2, 1),
            new Move(1, 1, 2));
  }

  @Test
  void givenInvalidInput_parse_throwsAnException() {
    String invalidInput = "fizzbuzz";

    ThrowableAssert.ThrowingCallable invocation = () -> PuzzleInputParser.parse(invalidInput);

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }
}
