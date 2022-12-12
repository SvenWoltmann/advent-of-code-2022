package eu.happycoders.adventofcode2022.day12;

import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The puzzle input consisting of a height map, start and end coordinates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PuzzleInput(HeightMap map, Position start, Position end) {

  PuzzleInput {
    Objects.requireNonNull(map, "map");
    Objects.requireNonNull(start, "start");
    Objects.requireNonNull(end, "end");
  }
}
