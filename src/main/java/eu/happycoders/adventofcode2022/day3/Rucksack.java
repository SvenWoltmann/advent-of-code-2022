package eu.happycoders.adventofcode2022.day3;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A rucksack containing a list of items.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Rucksack {

  private final List<Item> items;

  Rucksack(List<Item> items) {
    this.items = items;
  }

  List<Item> items() {
    return items;
  }

  Item findMisplacedItem() {
    List<List<Item>> lists = splitItemsIntoTwoSublists();
    return CommonItemFinder.findCommonItem(lists);
  }

  private List<List<Item>> splitItemsIntoTwoSublists() {
    int numberOfItems = items.size();
    if (numberOfItems % 2 != 0) {
      throw new IllegalArgumentException();
    }

    int half = numberOfItems / 2;
    List<Item> left = items.subList(0, half);
    List<Item> right = items.subList(half, numberOfItems);

    return List.of(left, right);
  }
}
