package eu.happycoders.adventofcode2022.day18;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 18.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day18Solver {

  static int solveTask1(String input) {
    List<Cube> cubes = CubesParser.parse(input);
    Droplet droplet = new Droplet(cubes);
    return droplet.getSurfaceArea();
  }

  static int solveTask2(String input) {
    List<Cube> cubes = CubesParser.parse(input);
    Droplet droplet = new Droplet(cubes);
    Box box = new Box(droplet);
    box.floodFill();
    return box.getExternalSurfaceArea();
  }
}
