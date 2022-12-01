package eu.happycoders.adventofcode2022.day1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CaloriesCounterTest {
  static final String TEST_INPUT =
      """
                1000
                2000
                3000

                4000

                5000
                6000

                7000
                8000
                9000

                10000""";

  @Test
  void givenSampleInput_calculateMaxCalories_returns24000() {
    int maxCalories = CaloriesCounter.calculateMaxCalories(TEST_INPUT);

    assertThat(maxCalories).isEqualTo(24000);
  }

  @Test
  void givenSampleInput_calculateSumOfTopThreeCalories_returns45000() {
    int maxCalories = CaloriesCounter.calculateSumOfTopThreeCalories(TEST_INPUT);

    assertThat(maxCalories).isEqualTo(45000);
  }
}
