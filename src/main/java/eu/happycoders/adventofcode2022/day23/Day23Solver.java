package eu.happycoders.adventofcode2022.day23;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 23.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day23Solver {

  static int solveTask1(String input) {
    List<Position> elvesPositions = PuzzleInputParser.parse(input);
    ElvesProcess elvesProcess = new ElvesProcess(elvesPositions);
    for (int i = 0; i < 10; i++) {
      elvesProcess.playOneRound();
    }
    Rectangle smallestRectangle = elvesProcess.getSmallestRectangle();
    return smallestRectangle.area() - elvesPositions.size();
  }

  static int solveTask2(String input) {
    List<Position> elvesPositions = PuzzleInputParser.parse(input);
    ElvesProcess elvesProcess = new ElvesProcess(elvesPositions);

    boolean anyoneMoved;
    do {
      anyoneMoved = elvesProcess.playOneRound();
    } while (anyoneMoved);

    return elvesProcess.getRound();
  }
}
