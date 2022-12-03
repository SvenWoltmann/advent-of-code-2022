package eu.happycoders.adventofcode2022.day3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.List;
import java.util.stream.Stream;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CommonItemFinderTest {

  @Test
  void givenTwoListsOfItems_findCommonItem_returnsTheCommonItem() {
    List<Item> items1 = ItemsParser.parse("vJrwpWtwJgWr");
    List<Item> items2 = ItemsParser.parse("hcsFMMfFFhFp");

    Item commonItem = CommonItemFinder.findCommonItem(List.of(items1, items2));

    assertThat(commonItem).isEqualTo(new Item('p'));
  }

  @Test
  void givenTwoListsWithoutACommonItem_findCommonItem_throwsAnException() {
    List<Item> items1 = ItemsParser.parse("abc");
    List<Item> items2 = ItemsParser.parse("def");

    ThrowableAssert.ThrowingCallable invocation =
        () -> CommonItemFinder.findCommonItem(List.of(items1, items2));

    assertThatIllegalArgumentException().isThrownBy(invocation);
  }

  private static Stream<Arguments> threeRowArguments() {
    return Stream.of(
        Arguments.of(
            List.of(
                "vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg"),
            new Item('r')),
        Arguments.of(
            List.of(
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", //
                "ttgJtRGJQctTZtZT",
                "CrZsJsPPZsGzwwsLwLmpwMDw"),
            new Item('Z')));
  }

  @ParameterizedTest
  @MethodSource("threeRowArguments")
  void givenThreeListsOfItems_findCommonItem_returnsTheCommonItem(
      List<String> itemLists, Item expectedCommonItem) {
    List<List<Item>> parsedItemLists = itemLists.stream().map(ItemsParser::parse).toList();

    Item commonItem = CommonItemFinder.findCommonItem(parsedItemLists);

    assertThat(commonItem).isEqualTo(expectedCommonItem);
  }
}
