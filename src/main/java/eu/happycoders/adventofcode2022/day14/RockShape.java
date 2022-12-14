package eu.happycoders.adventofcode2022.day14;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The vertical shape of a rock as a list of X/Y positions.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record RockShape(List<Position> positions) {

  @Override
  public String toString() {
    return positions.stream().map(Position::toString).collect(Collectors.joining(" -> "));
  }
}
