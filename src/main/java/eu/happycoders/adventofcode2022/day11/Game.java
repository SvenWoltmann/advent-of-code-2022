package eu.happycoders.adventofcode2022.day11;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;
import java.util.stream.Collectors;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The "Monkey in the middle" game.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Game {

  static final LongUnaryOperator RELIEF_OPERATION_PART_1 = worryLevel -> worryLevel / 3;

  private final List<Monkey> monkeys;
  private final Map<Integer, Monkey> monkeyMap;
  private final LongUnaryOperator reliefOperation;

  Game(List<Monkey> monkeys, LongUnaryOperator reliefOperation) {
    this.monkeys = monkeys;
    this.monkeyMap = monkeys.stream().collect(Collectors.toMap(Monkey::getId, Function.identity()));
    this.reliefOperation = reliefOperation;
  }

  void playRounds(int numberOfRounds) {
    for (int i = 0; i < numberOfRounds; i++) {
      playRound();
    }
  }

  void playRound() {
    for (Monkey monkey : monkeys) {
      monkey.turn(reliefOperation, monkeyMap);
    }
  }

  long getLevelOfMonkeyBusiness() {
    if (monkeys.size() < 2) {
      throw new IllegalStateException("Need at least 2 monkeys");
    }

    List<Long> sortedNumbersOfInspections =
        monkeys.stream()
            .map(Monkey::getNumberOfInspections)
            .sorted(Comparator.reverseOrder())
            .toList();

    return sortedNumbersOfInspections.get(0) * sortedNumbersOfInspections.get(1);
  }
}
