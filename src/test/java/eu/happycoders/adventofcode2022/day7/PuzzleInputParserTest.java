package eu.happycoders.adventofcode2022.day7;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuzzleInputParserTest {

  private PuzzleInputParser puzzleInputParser;

  @BeforeEach
  void setUpParser() {
    puzzleInputParser = new PuzzleInputParser();
  }

  @Test
  void givenTheTestInput_parse_returnsTheTestDirectoryStructure() {
    String input = TestInputs.TEST_INPUT;

    Directory parsedRoot = puzzleInputParser.parse(input);

    assertThat(parsedRoot).isEqualTo(TestInputs.TEST_DIRECTORY);
  }

  @Test
  void givenAnInvalidCommand_parse_throwsAnException() {
    String command = "$ foo";

    ThrowableAssert.ThrowingCallable invocation = () -> puzzleInputParser.parse(command);

    assertThatIllegalArgumentException().isThrownBy(invocation).withMessage("Unknown command: foo");
  }

  @Test
  void givenInitialChangeDirToAnotherDirectoryThanRoot_process_throwsAnException() {
    String command = "$ cd foo";

    ThrowableAssert.ThrowingCallable invocation = () -> puzzleInputParser.parse(command);

    assertThatIllegalArgumentException()
        .isThrownBy(invocation)
        .withMessage("First cd command must be to '/'");
  }

  @Test
  void givenChangeDirToParentFromRoot_process_throwsAnException() {
    String commands = """
            $ cd /
            $ cd ..""";

    ThrowableAssert.ThrowingCallable invocation = () -> puzzleInputParser.parse(commands);

    assertThatIllegalArgumentException()
        .isThrownBy(invocation)
        .withMessage("Current dir '/' has no parent");
  }

  @Test
  void givenChangeDirToUnknownDirectory_process_throwsAnException() {
    String commands = """
            $ cd /
            $ cd foo""";

    ThrowableAssert.ThrowingCallable invocation = () -> puzzleInputParser.parse(commands);

    assertThatIllegalArgumentException()
        .isThrownBy(invocation)
        .withMessage("Cannot find dir 'foo' under dir '/'");
  }

  @Test
  void givenListOutputWithoutListCommand_process_throwsAnException() {
    String commands = """
            $ cd /
            14848514 b.txt""";

    ThrowableAssert.ThrowingCallable invocation = () -> puzzleInputParser.parse(commands);

    assertThatIllegalStateException()
        .isThrownBy(invocation)
        .withMessage("Not in list output state");
  }

  @Test
  void givenUnexpectedListOutput_process_throwsAnException() {
    String commands = """
            $ cd /
            $ ls
            unexpected""";

    ThrowableAssert.ThrowingCallable invocation = () -> puzzleInputParser.parse(commands);

    assertThatIllegalArgumentException()
        .isThrownBy(invocation)
        .withMessage("Invalid list output line: unexpected");
  }
}
