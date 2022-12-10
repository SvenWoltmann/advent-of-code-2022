package eu.happycoders.adventofcode2022.day10;

import java.util.List;
import java.util.Objects;

class OperationsParser {
  static List<Operation> parse(String input) {
    return input.lines().map(OperationsParser::parseSingleOperation).toList();
  }

  private static Operation parseSingleOperation(String line) {
    Objects.requireNonNull(line);

    if (line.equals("noop")) {
      return new NoOp();
    }

    if (line.startsWith("addx ")) {
      return new AddX(Integer.parseInt(line.substring(5)));
    }

    throw new IllegalArgumentException("Cannot parse line: " + line);
  }
}
