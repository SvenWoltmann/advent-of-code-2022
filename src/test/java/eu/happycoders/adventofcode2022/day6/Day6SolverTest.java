package eu.happycoders.adventofcode2022.day6;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Day6SolverTest {

  private static Stream<Arguments> startOfPacketTestArguments() {
    return Stream.of(
        Arguments.of("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 7),
        Arguments.of("bvwbjplbgvbhsrlpgdmjqwftvncz", 5),
        Arguments.of("nppdvjthqldpwncqszvftbrmjlhg", 6),
        Arguments.of("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 10),
        Arguments.of("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 11));
  }

  @ParameterizedTest
  @MethodSource("startOfPacketTestArguments")
  void givenADataStream_detectStartOfPacket_returnsExpectedResult(
      String signal, int expectedResult) {
    int result = Day6Solver.detectStartOfPacket(signal);

    assertThat(result).isEqualTo(expectedResult);
  }

  private static Stream<Arguments> startOfMessageTestArguments() {
    return Stream.of(
        Arguments.of("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 19),
        Arguments.of("bvwbjplbgvbhsrlpgdmjqwftvncz", 23),
        Arguments.of("nppdvjthqldpwncqszvftbrmjlhg", 23),
        Arguments.of("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 29),
        Arguments.of("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 26));
  }

  @ParameterizedTest
  @MethodSource("startOfMessageTestArguments")
  void givenADataStream_detectStartOfMessage_returnsExpectedResult(
      String signal, int expectedResult) {
    int result = Day6Solver.detectStartOfMessage(signal);

    assertThat(result).isEqualTo(expectedResult);
  }
}
