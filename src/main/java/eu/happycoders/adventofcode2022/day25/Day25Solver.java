package eu.happycoders.adventofcode2022.day25;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 25.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day25Solver {

  static String solveTask1(String input) {
    long sum = input.lines().mapToLong(Snafu::parseSnafuString).sum();
    System.out.println("sum = " + sum);
    return Snafu.toSnafuString(sum);
  }
}
