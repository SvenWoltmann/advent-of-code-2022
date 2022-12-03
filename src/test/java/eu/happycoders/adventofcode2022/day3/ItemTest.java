package eu.happycoders.adventofcode2022.day3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.stream.Stream;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ItemTest {

  public static Stream<Arguments> typesAndPriorities() {
    return Stream.of(
        Arguments.of('p', 16),
        Arguments.of('L', 38),
        Arguments.of('P', 42),
        Arguments.of('v', 22),
        Arguments.of('t', 20),
        Arguments.of('s', 19));
  }

  @ParameterizedTest
  @MethodSource("typesAndPriorities")
  void givenAnItem_getPriority_returnsTheExpectedPriority(char itemType, int expectedPriority) {
    Item item = new Item(itemType);

    int priority = item.getPriority();

    assertThat(priority).isEqualTo(expectedPriority);
  }

  @Test
  void givenAnInvalidItem_getPriority_throwsAnException() {
    Item item = new Item('?');

    ThrowableAssert.ThrowingCallable invocation = item::getPriority;

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }
}
