package eu.happycoders.adventofcode2022.day17;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 17.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day17Solver {
  static long solve(String input, long numberOfRocks, boolean debugOutput) {
    Chamber chamber = new Chamber(new Jets(input), numberOfRocks);
    RockShapeIterator rockShapeIterator = new RockShapeIterator();

    while (chamber.getNumberOfRocks() < numberOfRocks) {
      chamber.addRockAndLetItFall(rockShapeIterator.next());

      if (debugOutput && chamber.getNumberOfRocks() <= 10) {
        System.out.printf("After %d rocks:%n%s%n", chamber.getNumberOfRocks(), chamber);
      }
    }

    return chamber.getTowerHeight();
  }
}
