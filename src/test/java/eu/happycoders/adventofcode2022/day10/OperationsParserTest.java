package eu.happycoders.adventofcode2022.day10;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class OperationsParserTest {

  @Test
  void givenInput_parse_returnsListOfOperations() {
    String input = """
            noop
            addx 3
            addx -5""";

    List<Operation> operations = OperationsParser.parse(input);

    assertThat(operations).containsExactly(new NoOp(), new AddX(3), new AddX(-5));
  }
}
