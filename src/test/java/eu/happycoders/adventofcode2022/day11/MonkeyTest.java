package eu.happycoders.adventofcode2022.day11;

import static eu.happycoders.adventofcode2022.day11.Game.RELIEF_OPERATION_PART_1;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class MonkeyTest {

  @Test
  void givenAMonkeyWithTwoItems_turn_monkeyUpdatesWorryLevelsAndSendsBothItemsToMonkey2() {
    Item item1 = new Item(79);
    Item item2 = new Item(98);
    Monkey monkey = new Monkey(1, List.of(item1, item2), worryLevel -> worryLevel * 19, 23, 2, 3);

    Monkey monkey2 = mock(Monkey.class);
    Monkey monkey3 = mock(Monkey.class);
    Map<Integer, Monkey> monkeyMap = Map.of(2, monkey2, 3, monkey3);

    monkey.turn(RELIEF_OPERATION_PART_1, monkeyMap);

    verifyNoInteractions(monkey2);
    verify(monkey3).addItem(item1);
    verify(monkey3).addItem(item2);

    assertThat(item1.getWorryLevel()).isEqualTo(500);
    assertThat(item2.getWorryLevel()).isEqualTo(620);
  }
}
