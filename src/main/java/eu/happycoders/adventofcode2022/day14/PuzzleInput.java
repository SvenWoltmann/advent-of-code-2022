package eu.happycoders.adventofcode2022.day14;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The puzzle input as a list of rock shapes.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PuzzleInput(List<RockShape> rockShapes) {

  @Override
  public String toString() {
    return rockShapes.stream().map(RockShape::toString).collect(Collectors.joining("\n"));
  }
}
