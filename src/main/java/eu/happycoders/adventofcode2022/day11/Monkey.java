package eu.happycoders.adventofcode2022.day11;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.LongUnaryOperator;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A monkey playing the "Monkey in the middle" game.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Monkey {

  private final int id;
  private final Queue<Item> items = new ArrayDeque<>();
  private final LongUnaryOperator operation;
  private final int testDivisor;
  private final int targetMonkeyIdTrue;
  private final int targetMonkeyIdFalse;

  private long numberOfInspections;

  Monkey(
      int id,
      List<Item> startingItems,
      LongUnaryOperator operation,
      int testDivisor,
      int targetMonkeyIdTrue,
      int targetMonkeyIdFalse) {
    this.id = id;
    this.items.addAll(startingItems);
    this.operation = operation;
    this.testDivisor = testDivisor;
    this.targetMonkeyIdTrue = targetMonkeyIdTrue;
    this.targetMonkeyIdFalse = targetMonkeyIdFalse;
  }

  public int getId() {
    return id;
  }

  void turn(LongUnaryOperator reliefOperation, Map<Integer, Monkey> monkeyMap) {
    while (!items.isEmpty()) {
      Item item = items.poll();
      inspect(item, reliefOperation, monkeyMap);
    }
  }

  private void inspect(
      Item item, LongUnaryOperator reliefOperation, Map<Integer, Monkey> monkeyMap) {
    item.changeWorryLevel(operation);
    item.changeWorryLevel(reliefOperation);

    if (item.getWorryLevel() % testDivisor == 0) {
      monkeyMap.get(targetMonkeyIdTrue).addItem(item);
    } else {
      monkeyMap.get(targetMonkeyIdFalse).addItem(item);
    }

    numberOfInspections++;
  }

  void addItem(Item item) {
    items.add(item);
  }

  List<Long> getWorryLevels() {
    return items.stream().map(Item::getWorryLevel).toList();
  }

  long getNumberOfInspections() {
    return numberOfInspections;
  }

  public long getTestDivisor() {
    return testDivisor;
  }
}
