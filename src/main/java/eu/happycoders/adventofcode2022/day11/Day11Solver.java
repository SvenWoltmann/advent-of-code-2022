package eu.happycoders.adventofcode2022.day11;

import static eu.happycoders.adventofcode2022.day11.Game.RELIEF_OPERATION_PART_1;

import java.util.List;
import java.util.function.LongUnaryOperator;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 11.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day11Solver {

  private static final int ROUNDS_PART_1 = 20;
  private static final int ROUNDS_PART_2 = 10_000;

  static long getLevelOfMonkeyBusinessPart1(String input) {
    List<Monkey> monkeys = MonkeysParser.parse(input);
    Game game = new Game(monkeys, RELIEF_OPERATION_PART_1);
    game.playRounds(ROUNDS_PART_1);
    return game.getLevelOfMonkeyBusiness();
  }

  static long getLevelOfMonkeyBusinessPart2(String input) {
    List<Monkey> monkeys = MonkeysParser.parse(input);
    LongUnaryOperator reliefOperation = calculateReliefOperationPart2(monkeys);
    Game game = new Game(monkeys, reliefOperation);
    game.playRounds(ROUNDS_PART_2);
    return game.getLevelOfMonkeyBusiness();
  }

  private static LongUnaryOperator calculateReliefOperationPart2(List<Monkey> monkeys) {
    long reliefDivisor = calculateReliefDivisorPart2(monkeys);
    return worryLevel -> worryLevel % reliefDivisor;
  }

  private static long calculateReliefDivisorPart2(List<Monkey> monkeys) {
    long reliefDivisor = 1;

    for (Monkey monkey : monkeys) {
      if (reliefDivisor % monkey.getTestDivisor() != 0) {
        reliefDivisor *= monkey.getTestDivisor();
      }
    }

    return reliefDivisor;
  }
}
