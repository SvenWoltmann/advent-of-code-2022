package eu.happycoders.adventofcode2022.day17;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Main application for day 17.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Main17 {

  private static final String INPUT =
      "><<<<>><<<>><>>><<<>>>><<<<>>>><<>>><>>><>><<<>>><<<>>>><>><>>>><<<>><<<<>><<<><<<<>>><<>>><<><<<>>>><<<><>><<>><<<<>>><>>><<<>>>><<<<>>>><><>>><>>><<<<>>>><<<<>>><<<<><<<>>>><<><<<>>>><<<<>>><>>>><<<>>>><>>><<>>><<<>><<<<>><<>>><<<><<>>><<>>>><<>>><>>><<<>>><<<>>>><<>>><<<>><<<<>>><>>>><<><>>>><>>>><>>>><<>><<<>>>><<<>>><<>>>><<<<>>>><<<><>>>><<<>>><<<<>>><<>>>><<<<>><<<>>>><<><<><<>><<<<>>>><<>>>><<<<>><<<<>>><<>>>><<>>><<<>>>><<<<>><>><<<<>><<<<><<<<>>><<>>><<<<><<<<>>>><>>><<<<>><<>>>><<<><>><<<<>>>><><<<><<<<>>>><<<>>><<<><><<<>>><>>><>>>><<<>>><<><><<>>><<<<><>>><>><>><<>>>><<<<>><<<>><<<>>><<>>><>>>><><<>>><<<<><>><>>>><>>>><>><>><<>>><>>><>>><<<<>><<<<><<<>><<><>><>><<<<>>>><<>><<<>>>><<><<<><<<<>><<<>><<>><>>>><<>>>><<>>>><<>>><<<><<<>><<<>>><<<<>>><>><<>><<<><><<<<><>>><<<<><<<>>><<<>>>><<<><<<>><<<<>>>><<>>><<><><<<<><>><<<><<<<>>><<<<>>>><<><<><<<<>>>><<<>>>><<<<>><<<<>><<<<>>><<<<>>><<>>>><<>>>><<<>>><<>>>><<<><<>>>><><<>>>><>>>><<>><>>>><<<>><<<<>>>><<<>><>>>><<<>><<>>><<<>>>><>>><>>>><<<>><<<>>>><<<<><<<<><<<<>>>><<>><<<><<>>>><<<>>><>>>><><<<><<>><<<><<<>>><>><<<><<<>><>><<<<><<<<><>><<<>>><<<>>><>>><<<<><>>><<<>><<<<>>><><<<>>>><<<><>><<<><<<<>><<<<>>>><><<<<>>><<<<>>>><<<<>><>><<><<<<><<>>><<>>>><<<><<>>>><>><<<><<>><>><<<<>><><<>>>><<>><><<>>><<<>><<><<<>><<><<><>>>><<<<>>><>>><<<>>>><<><<<>>><<<<><<<<>>>><<><>><><<>>><>><><<<>><>>>><>><<<<><<>>><<<<>>><<<>><<<<>>><>>><<<<>>><>>><<<<><<<<>><<<<><<<><<<>>>><<<>>>><<<>>>><<<<>><>><<<<>>><<<<>><<<>><<<>><>>>><<><>>><<<>>>><>><><><>>><<>>><<<>><>><<>>>><<<<>>><<<<>><<><<<<>><>><>>><<<><<>>><<><<><<>>><<>>><<<<>>><<><<<>>>><>>><>>>><<<<><<<>>><<>>><>><<>>>><<<>><<<<>><<<<>><<<>><<<<><<<>><<>>><<<<>>>><<><<<>><><<<<>>><<<<>>>><<<>><<>>><>><<<<>>>><>>><<><<<<>>>><>><<<>>>><<>>>><<<>>><><<<>>>><>>><<><<<><>>><<><<<<>><<>>>><<<<>>><<<<><<<>>>><<<<><<<<>><<<<>><>>>><<><>><<<>>><>><<>><<<<>>><<<>><<><<<<>><<<>>>><<>>>><<<<><><<<<>>>><<>>><<<>>><<<>><<>><<<><>>>><<><<<>><<<>>>><>>><<>><<<><><><<<>>>><>>>><<<<>>><<<><<<<>>><<>>><<<>><<<><<<<>>><<<<>><<<<><<>>>><>><<<<>><<<>>>><<<<>>><<<>><<>><<<>>>><>><>>><>>>><<>>>><<<>><<<<>>>><<<>><<<>>>><<<<>><<<>>><>>><>>><<>><>>><<<<>>>><<><><<><<<<>><>>><>>>><<<>>><<>><><>><><<<<>>>><<<>>>><>>>><>>>><<<<>><<<>><<>><<>>>><<<><>>><<>>><<>>><<<>>><<<<><<>><<><<>><>>>><<<<>>>><>><<>><>>><<<>>><>>>><<>>>><>>>><<<><<<>>>><<<<>><<>>><>><<>>><<<>>>><<<<><>>>><<<<>><<><><<<<>>><>>><<<>><><>><>>><<>>>><<<<><<<>>>><<<>><<>>><<<>><<<>><<<<><><>>>><<>>>><<>>><<<>><<<<><<<><<>>>><>>><<<>><<<<>><>>>><<<<>>>><<<<>>>><>>>><>>>><<<>>><>>><<>><<<>><>><<<<>><<<<>><<<><><<><<<<>><>>><>>><<<>>>><><><<>>>><<<>>><<<<>>><>>>><<<>>><<<><<<>>>><<>>><<<>>>><>>>><<><<><<<<>><<<><<<<>><<<>>>><<><<<<>>><<<<>><<>>>><<<<>><>>>><>><<<>>>><<<<><<<<><><<<><<><<<<><<<><<<<>>>><<<<>>>><<>>><<<<><<><<<<>>><<<<>>><>>>><>><>>><><<<>>><>>>><>><<<>><<<<>>><<>><<><<<>>>><<><<><<><<>><<<>>><<<>>><>>>><>><>><<<<>>>><<>>><<<<>>><<>><<<<><<>>>><>>>><<<<>>>><<<<>><>>><<>>>><<<><<<<>><<<<><<>>>><><<>>><<<<>>>><<>>><<><<>><>>><>>>><<>><<<><<<<><<<<>><<<>><<>>>><>><<<<><<<>><<><<<<><<<>><>>>><<>>><<<<><>>><<<<>>>><<<>><>>>><>><<<<>><>><<<<>>>><>>><><>>><<><>><<<>>>><<<>>><<<<><<<<>><>><<>>>><<<<>><>><<<>><<<<>>>><<>>><<<><<<><<<<>><<<<><<>>>><<<<>>>><<<<>>>><<<>><<<<>><>>><<>>><<<<>>><>>>><<<<><<>><<<>>>><><<<<><<<>>><<<<><<<<>><<<>><<<<>>><<<<>>><<><<><<<>>>><><<<>>>><<>>><<<<>>>><<<<>>>><>>>><<<<>>>><>>><<<>><<<<>>><<><><<<<>>>><<<>>>><>>>><<>>><<<<>>><<<<>><<><<<>><>>>><>>><>><>>><<>>>><<>>><<<<><<<>><<>>><>>>><<<><>><<>>>><>>><<>>><<<>>><<><<<<>>><<>><<<<><<>>><<<><<<>>><<>>><<<<>><><<<>>>><<<<>>><><<>><<<><<<<>><><<<<>><<<>><>><><<<>>><<<<>>><>>><<>><<<>><>><<>><<<><<<>><<>>>><<>>><<><<>>>><<>>>><><>>><<><<<<>><><><<<>><<<>>>><<<>><>>><>>>><><<<>><><>>><>>><<>>><><<<<>>>><<><<<<>>>><<>>>><<<<>>>><<><<<<>>><<<>>><<>>>><<<>>><<<<>><<><<<<><>>>><<<<><<>><>>>><>>><<<<>><<<>>>><<<<>>><<><<<<>>><<<>>><>>><<<<>>><<<<>><>>><<<<>>><>><<<>>><<<<>><<<<>><<<<><>>><>>>><<>>>><<>><<>>>><><<>>><<<>><>><>>><<<<>>><<<>>>><<<>>>><<>>><<<<>>><>>>><<<<>><<>>><><<<>>><>><>><<>><><<<<>>>><<><<>><<<>>>><<<>><>><<><<<<>><<<>><<<>><<<>>>><<<>>><<<<><<><<<<>>>><<<><<>>>><<<><<<>>><<<>>><<<>>><>>>><<<<>>><<<>><<<<>>>><<<><>>>><<><<<<>>>><<<>>><<<>>>><<<<>>><<<<><><<>>>><>><<<<>>>><<><<<<>>>><<<<>>><<<<><>>>><>><>>><<<>>><<<<>><>><>><>>><<>><>>><<>>><><<<<><<<><<>>><<><>>><<><<>>>><>>><<>>>><<<>>><<<>>>><<>>>><<>>>><<>>>><<<<>><<<<><><<<><>>>><<<><>><<<>>><<<<><<><<>>><<>>><<>><<<<>>>><<>>><<>>><<<>>>><<<>>><<<>>>><<<>>><<<<>>>><><<<><<<>><<>>>><<>>><<<<><<<>>>><<>>><<>>><<<>><<>>><<><>>><<<<>>>><<<>>><<<><<<<>>>><<<>>><<><>>><<><<<>><<>>><<<<>><>>>><>>><<<>>><<<>>>><<<<>>><<<>>><>>><>>><<<><<<>><<<><<<<>>><<>>><>>>><<<><<<<>>><<>>><>><<<>>><<><<><<>><<<<>><<<>>><<><<<<><<<<>><<<<>>>><><<<><>>><<>><<<<>>><>><>>>><<><<><<<>><<>><<>>>><<<<><<<>>>><<<>>>><<<>>>><<<><<<<>>>><<<>><<<<><<<>><>>>><>>><<><>>>><>>><<<<>>><<<<>>><<<>><<>>>><<<>>><><>><>><<>><>>>><>>>><>>>><>><<>>>><<<>><<><>><<<<>>><<<>>><<<<>><<<<><<<<>><>>><<<><><<<><<><<>>><<><<><<<>>>><<<>>><<<<>>><><<<>><<<>>>><<<>><>><<<>>><<<<>><>>><<<>><>><<<<>>>><<><>>>><<<><<><<>><>>>><<<<>>>><><<>>>><<>><<>>><><<<>>>><<<>>><<<>>><>><><<<<>><<<<>>><<<<>><<<<><<<>>>><<>>>><<>><<>>>><<><>>>><<>><<<<>>><<<>><>>><<<<>>>><<>><<<<><<<<>>>><<>>><<<>>><<<<>>>><><<<<>><<<><<<<><>>>><<><<><<>><>>>><><>>><<<>>><<<>>>><<>>><<<<>><<<<>>>><<<><<<>><<>>>><>><<><<<>><<<<><>><<>><<<>><<><<<<>>>><<>>>><<<>>>><<<>><<<<><<<<>>>><>>><>>><<<>>><<>><>>><<<>>>><<<>><>>>><><>><<<>><<><<<>><<<>>><<<<>>><<>>><<>>><<<<>><>>><<>>><>>><<<>>><<<<><<>>>><<<<>>><<<<>><<<>>><<>>>><>>><<<<><>>><<<>><<><<><<><><<<>>><<<>>>><<><>><<<>><<<<>><<>>><>>><<<<>><<<><<<<>><>>><>>>><<<<><<<<>>>><<<<>>>><<><<>>>><<<<>><>><<>>><>>>><<>><>><<<>><<<>>><<<<>><>>><<<<>>>><<<>>>><<<<><><<<<><<>>><<<<>>>><<<<>><<<<><<<<><>><><<>><<<>><<<<>>>><<<<>>><<<>>>><<<>><<<>>><>>><<<<>><<<<><<<>><<<<>>>><<<>><<<<><<>><<<>>>><<<<><<<<>>><>>><<<>>><<<>>>><>><>>><<><<><<<<><<>>>><<>>>><<<>>>><<<>>><<<>><<<><<<><><<<>>>><<<<><>><<<>>><>>>><<<>>>><>>>><<>><<><<>>>><<<<>>>><<<<><<><>>><<<<>><<>>><<>><<<>><>><<>>><<<>>>><<<<>><<<>><<<<><<<>><<<<>>>><<<>>>><<<>><><<<>>>><<<>><<<<><><>>><>>><<>><<<>>>><>>>><>>><<<<>>><<<<>>>><<<>><>>>><<>><>>>><<<>>>><<>>>><<<<>>>><<<>><<<<><<<<>>>><<<>>><><<<>>>><>>><<<<>><<<<>>><><<<<>><<<>>><<<<>>><<<><<<<>>><<<>>>><<<><<<><><<<<>>><<<<>>><<<>><<<<>><><<<>>><>>><<<>>><<<>>>><>>>><<<><<>>><<>>><>>>><<<>><>><><<<<>>><<<>>>><<>>><<><>>>><<<>><<<><<><<<>>>><>>>><<<<>><<<<>><<<>>>><<<><<<><>>>><<<<>><<><<>>><<<<>>><>>><<<><><<<<>><>><>>><<<>>>><<<><><<<<><<<<>>><<><<<<>><<>>>><<><>>>><<<>>><<<>>>><<<>>><><<<<><<>>><<><<<><<<<>>><<>>>><>><<<>>>><<>>>><<><<<>>><<>>>><>><<<>>>><<<<>>>><>>><<><><<><><>><<>><>><>><<>>>><<>><<<<><<<<>>>><><<>><>>>><<><<><<>>><<<><<<>>>><<<>>>><<<<>>><<<>>><<<<>><<<>>>><<<><>>><><<<<><<<<>>>><<>>>><>>>><<>>>><>>><<>><<<<><<<<>>>><<<<><>>>><<<>><<>>><<<<><<>><<>><><<<>>><<<>>>><<<>>><>>><><<<<>>>><<>>>><>>>><><<<<>>>><<>>>><<>><>>>><<<<><<<>>>><<>><<<<>>>><<<><<<><<<>>><<>>><>><<>>><>><<<>>><<<<>><<>><<<>>>><<<>>>><<><<>>>><<>><<<<>><<<>>>><<>>>><<<>>><<><<>>>><<>>><>>>><<<><<<>><>><<<<>>><<>><>><<>><>>>><><<<>><<><<>>><<>><<<><<><<><<<><><<>>>><<<><<<>>><>>>><<<>>>><<<<>>><<<><>>><>>>><<>><<<<>><>><<<>><<>><<<><><<>>>><<<<>>><<<>>><<<<>><<>><<<>><>><<<>>><<<>>><<<<>>>><<>>>><<<<>>><<<>><<<<><><<<<>>>><>>>><<<<>><<<<><<<<>><>>>><<<><>><<<>>><<<<><<<<>>><<<<><<>>>><<><>><<<>>>><<<<>>>><>>><<<>><<<<>>><>>><>><<<>>><<<>>>><>>>><<<<>><<>><<<>>><<<<>>><<<<><<<>>><<<><<<<><><<<><<><<<><<<<>>><<<<>><<<<>><>><>><<><<<>>><<<><<><<>>><<<<>>><<<>>>><<><<<>>>><<<>><<<>><>>>><>>><>><<<>><<>>>><<<<>>>><>><<>><<<>>><>>>><<>><<<>><<><<>>>><><<<><>>><<>>>><<<<>>>><<<>>>><<<>>><<<><<<>>>><<<>>>><<<>>>><<<<><>>><>><<>><<<><<<><<>><>>><<<>>><<<>><<<>>><<<<>>>><<<<><>>><<>>><>>><<<<>><<>><>>>><<>>><<<<>>><<<<>>><<<<><<<<>>><<<>><><><<<><<<<>>><>>><<><>><<>>>><<>>><<<>>>><<<<>>><<<>><<>><>>><>>><<<<>>>><<<<>>>><<>><<<<>>>><>>>><<<><<<>>><<<>>>><<<<>>><><<<<>><<><<>>>><<<<>>><<<<>>><<<<><<<>>>><<><<>>>><><<<>>>><<><<>>><<>>>><<<><<><>>><<<<>>><<<>>>><<><<>>><<<<><>>>><<>>><<<>>>><<<<><<>><<>><<>>><><<<>><<<<>><><<<<><>><<>><<<>>>><<>>>><>>>><<><>><>>><<<>>><>>>><<<><<><<<>><<<>><<>>><<><<>>><<<>>><<<>>>><>>><>><><<><<>>><<<<>>><>>><<<><<><<<>><>><<>>><>>>><<>>>><<<><>>>><<>>>><>>>><<<<>>><<>>><>>><<>><<><<<<>>>><>>><<>>>><><<><<<>>><<>><>>><<<<>>>><>>>><<<>>><<<>><<<>><<>>>><>><>>><<<><<<>>>><<<<>><<>>><<<<>>><<>>><<>>><>>>><<<<><<<>>>><<<>>><<<<><<><<>>>><<<>>><<<<>>><><<<<>><<<><<<<>><<<>><<<<><<<<>>>><>><>>><<><<<>><<<>>><><<<<>><<<<>><<>>><<<<>>><>>><>><<<>><<<>><>>><<<>>>><<<>><<<<><<><<<<>>><<<>>>><<<<>>><<<<>>><><<<>>><<<>><<<<><<<<><<<>>><<<>>>><><<<>><>>>><<<<>><<>>><<<>>><<>>>><<<<>>>><<>>>><<<<>>><<>>><<>><>>><<>>><<<<>><>>><><>><><<>>>><<>>><>>><<<<><<<<>><<<<>>><<<<>>><<<<>>>><<<<>>><<<><><<<<><>>>><>><<<<>><<<<><<>>>><><>>>><<<<>><<>>>><<<><>>>><<<>><<<>><>><>>>><<<>>><<<>>><<>>>><<<><<<>><>>>><>>><<<>>>><><<>>><<<>>>><<>>>><<<>>>><<<<><<><>><>>>><<>>>><<<<>><<<><<<<>>><>>><<<>>><>><>>>><<<<>>>><<<>><<>>><>>><<<>><<<<>>><<<>>><<>>><<>>><>>>><<>>>><<<<>>>><<>>>><<><<>><>>>><<>>>><<<<>>>><<<<><<<><>>>><<<>>>><<<<>>>><><<<><<<<><<<<>><<<><>>><<>>><>><<>>>><<>><<<<>>>><<>>><<>>>><<>><>><><>><<<<><>>><<>>>><<>>>><>>><><<<><<<<>>><<<>>>><<>>><<<<>><<>>><<<<>>><<<<>><<>>><><<>>><<>><<<>>><<>>><<<>>><<>><<><>>>><>><>>><<>><<>>><<<<>>>><<<>>>><<<<>><<<<>>>><<<<><<<><>>><<<<><<>>><<>><<<<><<<><<<><<><<><>>>><<>><<<><>><<>><<<><<<><<<>>><<<><<>><<<><<<>>>><<>>>><<><>>>><<<<>>><><<><<<>><>>>><<<>>><<<>>>><>><<<>>>><<>>>><><<<>>><<>><><<>><>>><<>>><<><<<>><<<<>><><<<<>>>><<><<<<>>>><<<<>><<<><<<<>><<<<>>><<><<><>><><<<>>>><<<>>>><<<<>><<<>>><<>>><<>>>><>>>><<>>><>>>><<<<>><<<>>><<<><>>><>>><<<><<<<>>>><<<>>>><<<<><>>><<<>><<>><<>>><<>>>><>>><<<>>><<<>>>><<<>>>><<<<>><><<<><>><>><<<<>>>><<<>>>><<><>><><<<<>>>><><>>>><<>><<<<>><<<<><<<<>>>><<<>>><<<>>><<<>><<<<>><<>><>>><<>><<>><<<<>>>><<<>><>>>><<<<>>>><<<>>>><<>>><<<>>>><<<<><<<>><<<>>><<<<>>><><<>>>><<>>><<>>>";

  public static void main(String[] args) {
    System.out.println(Day17Solver.solve(INPUT, 2022, false));
    System.out.println(Day17Solver.solve(INPUT, 1_000_000_000_000L, false));
  }
}