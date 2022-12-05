package eu.happycoders.adventofcode2022.day5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

class CratesStacksParserTest {

  @Test
  void givenATestInput_parse_returnsParsedCratesStacks() {
    String testInput =
        """
                [D]
            [N] [C]
            [Z] [M] [P]
             1   2   3""";

    CrateStacks crateStacks = CrateStacksParser.parse(testInput);

    assertThat(crateStacks.size()).isEqualTo(3);
    assertThat(crateStacks.stackAt(1)).isEqualTo(CrateStack.of('Z', 'N'));
    assertThat(crateStacks.stackAt(2)).isEqualTo(CrateStack.of('M', 'C', 'D'));
    assertThat(crateStacks.stackAt(3)).isEqualTo(CrateStack.of('P'));
  }

  @Test
  void givenATestInputWithoutTheLastLine_parse_throwsAnException() {
    String testInput =
        """
                    [D]
                [N] [C]
                [Z] [M] [P]""";

    ThrowableAssert.ThrowingCallable invocation = () -> CrateStacksParser.parse(testInput);

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }

  @Test
  void givenASingleLineOfTestInput_parseLine_returnsParsedCrates() {
    String line = "[B]     [M] [H] [L] [Z] [J] [B] [S]";

    Crate[] crates = CrateStacksParser.parseLine(line);

    assertThat(crates)
        .containsExactly(
            new Crate('B'),
            null,
            new Crate('M'),
            new Crate('H'),
            new Crate('L'),
            new Crate('Z'),
            new Crate('J'),
            new Crate('B'),
            new Crate('S'));
  }
}
