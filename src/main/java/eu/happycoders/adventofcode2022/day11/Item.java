package eu.happycoders.adventofcode2022.day11;

import java.util.function.LongUnaryOperator;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single item with a worry level.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Item {

  private long worryLevel;

  Item(long worryLevel) {
    this.worryLevel = worryLevel;
  }

  void changeWorryLevel(LongUnaryOperator operator) {
    worryLevel = operator.applyAsLong(worryLevel);
  }

  Long getWorryLevel() {
    return worryLevel;
  }

  @Override
  public String toString() {
    return "Item{" + "worryLevel=" + worryLevel + '}';
  }
}
