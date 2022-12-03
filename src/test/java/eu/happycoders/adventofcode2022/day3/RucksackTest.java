package eu.happycoders.adventofcode2022.day3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RucksackTest {

  private static Stream<Arguments> rucksackItemsWithMisplacedItemType() {
    return Stream.of(
        Arguments.of("vJrwpWtwJgWrhcsFMMfFFhFp", new Item('p')),
        Arguments.of("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL", new Item('L')),
        Arguments.of("PmmdzqPrVvPwwTWBwg", new Item('P')),
        Arguments.of("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", new Item('v')),
        Arguments.of("ttgJtRGJQctTZtZT", new Item('t')),
        Arguments.of("CrZsJsPPZsGzwwsLwLmpwMDw", new Item('s')));
  }

  @ParameterizedTest
  @MethodSource("rucksackItemsWithMisplacedItemType")
  void givenARucksackWithItems_findMisplacedItem_returnsTheMisplacedItem(
      String items, Item expectedMisplacedItem) {
    Rucksack rucksack = new Rucksack(ItemsParser.parse(items));

    Item misplacedItem = rucksack.findMisplacedItem();

    assertThat(misplacedItem).isEqualTo(expectedMisplacedItem);
  }
}
