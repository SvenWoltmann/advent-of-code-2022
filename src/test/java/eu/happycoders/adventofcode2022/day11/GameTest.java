package eu.happycoders.adventofcode2022.day11;

import static eu.happycoders.adventofcode2022.day11.Game.RELIEF_OPERATION_PART_1;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.function.LongUnaryOperator;
import org.junit.jupiter.api.Test;

class GameTest {

  private Monkey monkey0;
  private Monkey monkey1;
  private Monkey monkey2;
  private Monkey monkey3;
  private Game game;

  @Test
  void
      givenAGameWithFourMonkeysAndThePart1ReliefOperation_playRound_monkeysHaveItemsWithSpecificWorryLevels() {
    setUpGame(RELIEF_OPERATION_PART_1);

    game.playRound();

    // After 1 round:
    assertThat(monkey0.getWorryLevels()).containsExactly(toLongs(20, 23, 27, 26));
    assertThat(monkey1.getWorryLevels()).containsExactly(toLongs(2080, 25, 167, 207, 401, 1046));
    assertThat(monkey2.getWorryLevels()).isEmpty();
    assertThat(monkey3.getWorryLevels()).isEmpty();

    game.playRound();

    // After 2 rounds:
    assertThat(monkey0.getWorryLevels()).containsExactly(toLongs(695, 10, 71, 135, 350));
    assertThat(monkey1.getWorryLevels()).containsExactly(toLongs(43, 49, 58, 55, 362));
    assertThat(monkey2.getWorryLevels()).isEmpty();
    assertThat(monkey3.getWorryLevels()).isEmpty();

    game.playRound();

    // After 3 rounds:
    assertThat(monkey0.getWorryLevels()).containsExactly(toLongs(16, 18, 21, 20, 122));
    assertThat(monkey1.getWorryLevels()).containsExactly(toLongs(1468, 22, 150, 286, 739));
    assertThat(monkey2.getWorryLevels()).isEmpty();
    assertThat(monkey3.getWorryLevels()).isEmpty();

    game.playRounds(17);

    // After 20 rounds:
    assertThat(monkey0.getWorryLevels()).containsExactly(toLongs(10, 12, 14, 26, 34));
    assertThat(monkey1.getWorryLevels()).containsExactly(toLongs(245, 93, 53, 199, 115));
    assertThat(monkey2.getWorryLevels()).isEmpty();
    assertThat(monkey3.getWorryLevels()).isEmpty();

    assertThat(monkey0.getNumberOfInspections()).isEqualTo(101);
    assertThat(monkey1.getNumberOfInspections()).isEqualTo(95);
    assertThat(monkey2.getNumberOfInspections()).isEqualTo(7);
    assertThat(monkey3.getNumberOfInspections()).isEqualTo(105);

    assertThat(game.getLevelOfMonkeyBusiness()).isEqualTo(10605);
  }

  @Test
  void
      givenAGameWithFourMonkeysAndThePart2ReliefOperation_playRound_monkeysHaveItemsWithSpecificWorryLevels() {
    LongUnaryOperator reliefOperation = old -> old % (23 * 19 * 13 * 17);
    setUpGame(reliefOperation);

    game.playRound();

    // After 1 round:
    assertThat(monkey0.getNumberOfInspections()).isEqualTo(2);
    assertThat(monkey1.getNumberOfInspections()).isEqualTo(4);
    assertThat(monkey2.getNumberOfInspections()).isEqualTo(3);
    assertThat(monkey3.getNumberOfInspections()).isEqualTo(6);

    game.playRounds(19);

    // After 20 rounds:
    assertThat(monkey0.getNumberOfInspections()).isEqualTo(99);
    assertThat(monkey1.getNumberOfInspections()).isEqualTo(97);
    assertThat(monkey2.getNumberOfInspections()).isEqualTo(8);
    assertThat(monkey3.getNumberOfInspections()).isEqualTo(103);

    // After 1,000 rounds:
    game.playRounds(980);

    assertThat(monkey0.getNumberOfInspections()).isEqualTo(5204);
    assertThat(monkey1.getNumberOfInspections()).isEqualTo(4792);
    assertThat(monkey2.getNumberOfInspections()).isEqualTo(199);
    assertThat(monkey3.getNumberOfInspections()).isEqualTo(5192);

    game.playRounds(1_000);

    // After 2,000 rounds:
    assertThat(monkey0.getNumberOfInspections()).isEqualTo(10419);
    assertThat(monkey1.getNumberOfInspections()).isEqualTo(9577);
    assertThat(monkey2.getNumberOfInspections()).isEqualTo(392);
    assertThat(monkey3.getNumberOfInspections()).isEqualTo(10391);

    game.playRounds(8_000);

    // After 10,000 rounds:
    assertThat(monkey0.getNumberOfInspections()).isEqualTo(52166);
    assertThat(monkey1.getNumberOfInspections()).isEqualTo(47830);
    assertThat(monkey2.getNumberOfInspections()).isEqualTo(1938);
    assertThat(monkey3.getNumberOfInspections()).isEqualTo(52013);

    assertThat(game.getLevelOfMonkeyBusiness()).isEqualTo(2713310158L);
  }

  private void setUpGame(LongUnaryOperator reliefOperation) {
    monkey0 =
        new Monkey(
            0, //
            itemsWithWorryLevels(79, 98),
            worryLevel -> worryLevel * 19,
            23,
            2,
            3);

    monkey1 =
        new Monkey(
            1, //
            itemsWithWorryLevels(54, 65, 75, 74),
            worryLevel -> worryLevel + 6,
            19,
            2,
            0);

    monkey2 =
        new Monkey(
            2, //
            itemsWithWorryLevels(79, 60, 97),
            worryLevel -> worryLevel * worryLevel,
            13,
            1,
            3);

    monkey3 =
        new Monkey(
            3, //
            itemsWithWorryLevels(74),
            worryLevel -> worryLevel + 3,
            17,
            0,
            1);

    game = new Game(List.of(monkey0, monkey1, monkey2, monkey3), reliefOperation);
  }

  private List<Item> itemsWithWorryLevels(int... values) {
    return Arrays.stream(values).mapToObj(Item::new).toList();
  }

  private Long[] toLongs(int... values) {
    Long[] result = new Long[values.length];
    for (int i = 0; i < values.length; i++) {
      result[i] = (long) values[i];
    }
    return result;
  }
}
