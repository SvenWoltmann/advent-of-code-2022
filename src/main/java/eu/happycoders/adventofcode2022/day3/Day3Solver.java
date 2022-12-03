package eu.happycoders.adventofcode2022.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 3.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day3Solver {
  static int calculateSumOfPriorities(String input) {
    return input
        .lines()
        .map(ItemsParser::parse)
        .map(Rucksack::new)
        .map(Rucksack::findMisplacedItem)
        .mapToInt(Item::getPriority)
        .sum();
  }

  static int calculateSumOfPrioritiesForGroupsOfThree(String input) {
    List<Rucksack> rucksacks = input.lines().map(ItemsParser::parse).map(Rucksack::new).toList();

    return toGroupsOfThreeRucksacks(rucksacks).stream()
        .map(groupOfThree -> groupOfThree.stream().map(Rucksack::items).toList())
        .map(CommonItemFinder::findCommonItem)
        .mapToInt(Item::getPriority)
        .sum();
  }

  private static List<List<Rucksack>> toGroupsOfThreeRucksacks(List<Rucksack> rucksacks) {
    if (rucksacks.size() % 3 != 0) {
      throw new IllegalArgumentException("Number of rucksacks must be dividable by 3");
    }

    List<List<Rucksack>> result = new ArrayList<>();

    for (Iterator<Rucksack> iterator = rucksacks.iterator(); iterator.hasNext(); ) {
      result.add(List.of(iterator.next(), iterator.next(), iterator.next()));
    }

    return result;
  }
}
