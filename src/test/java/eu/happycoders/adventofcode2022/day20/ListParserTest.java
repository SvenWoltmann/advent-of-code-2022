package eu.happycoders.adventofcode2022.day20;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ListParserTest {

  @Test
  void givenTheTestInput_parse_returnsAListOfNumbers() {
    String input = TestInputs.TEST_INPUT;

    List<Long> numbers = ListParser.parse(input);

    assertThat(numbers).containsExactly(1L, 2L, -3L, 3L, -2L, 0L, 4L);
  }
}
