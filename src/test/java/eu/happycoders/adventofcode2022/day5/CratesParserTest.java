package eu.happycoders.adventofcode2022.day5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CratesParserTest {

  @Test
  void givenASingleCrateRepresentation_parseCrate_returnsTheCrate() {
    String crateString = "[A]";

    Crate crate = CrateParser.parseCrate(crateString);

    assertThat(crate).isEqualTo(new Crate('A'));
  }

  @Test
  void givenThreeSpaces_parseCrate_returnsNull() {
    String crateString = "   ";

    Crate crate = CrateParser.parseCrate(crateString);

    assertThat(crate).isNull();
  }

  @ParameterizedTest
  @ValueSource(
      strings = {
        "fizz", // too long
        "[A ", // not ending with ']'
        " A]" // not starting with '['
      })
  void givenInvalidInput_parseCrate_throwsAnException(String input) {
    ThrowableAssert.ThrowingCallable invocation = () -> CrateParser.parseCrate(input);

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }
}
