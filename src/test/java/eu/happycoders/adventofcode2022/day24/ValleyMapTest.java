package eu.happycoders.adventofcode2022.day24;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValleyMapTest {

  private static Stream<Arguments> testInput() {
    return Stream.of(
        // Minute 1
        Arguments.of(new Position(0, 0), 1, false),
        Arguments.of(new Position(1, 0), 1, true),
        Arguments.of(new Position(2, 0), 1, true),
        Arguments.of(new Position(3, 0), 1, false),
        Arguments.of(new Position(4, 0), 1, true),
        Arguments.of(new Position(5, 0), 1, false),
        // Minute 2
        Arguments.of(new Position(0, 1), 2, false),
        Arguments.of(new Position(1, 1), 2, true),
        Arguments.of(new Position(2, 1), 2, true),
        Arguments.of(new Position(3, 1), 2, true),
        Arguments.of(new Position(4, 1), 2, true),
        Arguments.of(new Position(5, 1), 2, true),
        // Minute 3
        Arguments.of(new Position(0, 2), 3, true),
        Arguments.of(new Position(1, 2), 3, true),
        Arguments.of(new Position(2, 2), 3, true),
        Arguments.of(new Position(3, 2), 3, true),
        Arguments.of(new Position(4, 2), 3, false),
        Arguments.of(new Position(5, 2), 3, false),
        // Minute 4
        Arguments.of(new Position(0, 3), 4, false),
        Arguments.of(new Position(1, 3), 4, true),
        Arguments.of(new Position(2, 3), 4, true),
        Arguments.of(new Position(3, 3), 4, true),
        Arguments.of(new Position(4, 3), 4, true),
        Arguments.of(new Position(5, 3), 4, false),
        // Minute 18
        Arguments.of(new Position(0, 2), 18, true),
        Arguments.of(new Position(1, 2), 18, false),
        Arguments.of(new Position(2, 2), 18, false),
        Arguments.of(new Position(3, 2), 18, true),
        Arguments.of(new Position(4, 2), 18, true),
        Arguments.of(new Position(5, 2), 18, true));
  }

  @ParameterizedTest
  @MethodSource("testInput")
  void
      givenTheTestValleyMapAndAPositionAndANumberOfMinutes_isBlizzardAtMinute_returnsExpectedResult(
          Position position, int minute, boolean expectedResult) {
    ValleyMap valleyMap = TestInputs.TEST_VALLEY_MAP_WITH_MORE_BLIZZARDS;

    boolean blizzard = valleyMap.isBlizzardAtMinute(position, minute);

    assertThat(blizzard).isEqualTo(expectedResult);
  }
}
