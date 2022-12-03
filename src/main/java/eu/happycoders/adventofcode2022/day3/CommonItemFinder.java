package eu.happycoders.adventofcode2022.day3;

import java.util.List;

class CommonItemFinder {

  static Item findCommonItem(List<List<Item>> lists) {
    int numberOfLists = lists.size();
    int allBitsSet = (1 << numberOfLists) - 1;
    int[] itemCounter = new int[52];

    for (int i = 0; i < lists.size(); i++) {
      int bitForThisList = 1 << i;
      List<Item> items = lists.get(i);
      for (Item item : items) {
        int posInCounter = calculatePosInCounter(item);
        itemCounter[posInCounter] |= bitForThisList;
        if (itemCounter[posInCounter] == allBitsSet) {
          return item;
        }
      }
    }

    throw new IllegalArgumentException("Lists contain no common item");
  }

  private static int calculatePosInCounter(Item item) {
    // An item's priority is between 1 and 52. So simply subtract 1.
    return item.getPriority() - 1;
  }
}
