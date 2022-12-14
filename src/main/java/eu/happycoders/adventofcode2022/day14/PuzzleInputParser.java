package eu.happycoders.adventofcode2022.day14;

import java.util.Arrays;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input string to a {@link PuzzleInput} object.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  static PuzzleInput parse(String input) {
    List<RockShape> rockShapes = input.lines().map(PuzzleInputParser::parseLine).toList();
    return new PuzzleInput(rockShapes);
  }

  private static RockShape parseLine(String input) {
    String[] positionsStr = input.split(" -> ");
    List<Position> positions = Arrays.stream(positionsStr).map(Position::parse).toList();
    return new RockShape(positions);
  }
}
