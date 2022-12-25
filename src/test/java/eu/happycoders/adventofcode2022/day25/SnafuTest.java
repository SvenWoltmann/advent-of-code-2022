package eu.happycoders.adventofcode2022.day25;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SnafuTest {

  private static Stream<Arguments> snafuArguments() {
    return Stream.of(
        Arguments.of(1, "1"),
        Arguments.of(2, "2"),
        Arguments.of(3, "1="),
        Arguments.of(4, "1-"),
        Arguments.of(5, "10"),
        Arguments.of(6, "11"),
        Arguments.of(7, "12"),
        Arguments.of(8, "2="),
        Arguments.of(9, "2-"),
        Arguments.of(10, "20"),
        Arguments.of(11, "21"),
        Arguments.of(15, "1=0"),
        Arguments.of(20, "1-0"),
        Arguments.of(31, "111"),
        Arguments.of(32, "112"),
        Arguments.of(37, "122"),
        Arguments.of(107, "1-12"),
        Arguments.of(198, "2=0="),
        Arguments.of(201, "2=01"),
        Arguments.of(353, "1=-1="),
        Arguments.of(906, "12111"),
        Arguments.of(1257, "20012"),
        Arguments.of(1747, "1=-0-2"),
        Arguments.of(2022, "1=11-2"),
        Arguments.of(12345, "1-0---0"),
        Arguments.of(314159265, "1121-1110-1=0"),
        Arguments.of(33448434171005L, "2---1010-0=1220-=010"));
  }

  @ParameterizedTest
  @MethodSource("snafuArguments")
  void givenADecimal_toSnafuString_returnsSnafuString(long decimal, String expectedSnafuString) {
    String snafuString = Snafu.toSnafuString(decimal);

    assertThat(snafuString).isEqualTo(expectedSnafuString);
  }

  @ParameterizedTest
  @MethodSource("snafuArguments")
  void givenASnafuString_parseSnafuString_returnsDecimal(long expectedDecimal, String snafuString) {
    long decimal = Snafu.parseSnafuString(snafuString);

    assertThat(decimal).isEqualTo(expectedDecimal);
  }
}
