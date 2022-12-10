package eu.happycoders.adventofcode2022.day10;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Main application for day 10.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Main10 {

  private static final String INPUT =
      """
          addx 1
          addx 5
          addx -1
          addx 20
          addx -14
          addx -1
          addx 5
          addx 13
          addx -12
          addx 3
          addx 3
          addx 3
          addx 1
          addx 4
          noop
          noop
          addx 1
          noop
          noop
          addx 4
          noop
          addx -35
          addx 11
          addx -1
          addx -7
          addx 5
          addx 2
          addx 3
          addx -2
          addx 2
          addx 5
          addx 5
          noop
          noop
          addx -2
          addx 2
          noop
          addx 3
          addx 2
          addx 7
          noop
          noop
          addx 3
          addx -2
          addx -36
          noop
          addx 25
          addx -22
          addx 7
          noop
          addx -2
          noop
          noop
          noop
          addx 5
          addx 5
          addx 4
          noop
          addx -2
          addx 5
          addx -4
          addx 5
          addx 4
          noop
          addx -29
          addx 32
          addx -23
          addx -12
          noop
          addx 7
          noop
          addx -2
          addx 4
          addx 3
          addx 20
          addx 3
          addx -20
          addx 5
          addx 16
          addx -15
          addx 6
          noop
          noop
          noop
          addx 5
          noop
          addx 5
          noop
          noop
          noop
          addx -37
          addx 2
          addx -2
          addx 7
          noop
          addx -2
          addx 5
          addx 2
          addx 3
          addx -2
          addx 2
          addx 5
          addx 2
          addx -6
          addx -15
          addx 24
          addx 2
          noop
          addx 3
          addx -8
          addx 15
          addx -14
          addx 15
          addx -38
          noop
          noop
          addx 21
          addx -14
          addx 1
          addx 5
          noop
          addx -2
          addx 7
          addx -1
          addx 5
          noop
          addx 2
          addx 3
          addx 3
          addx -2
          addx 4
          addx 2
          addx -17
          addx 20
          noop
          noop
          noop
          noop""";

  public static void main(String[] args) {
    System.out.println(Day10Solver.getSumOfSelectedSignalStrengths(INPUT));
    System.out.println(Day10Solver.render(INPUT));
  }
}
