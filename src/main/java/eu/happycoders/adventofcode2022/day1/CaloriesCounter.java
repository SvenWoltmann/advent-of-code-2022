package eu.happycoders.adventofcode2022.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Solution for day 1.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CaloriesCounter {

  static int calculateMaxCalories(String input) {
    IntStream caloriesSums = getCaloriesSums(input);
    return caloriesSums.max().orElse(0);
  }

  static int calculateSumOfTopThreeCalories(String input) {
    IntStream caloriesSums = getCaloriesSums(input);
    return caloriesSums
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(Integer::valueOf)
        .limit(3)
        .sum();
  }

  private static IntStream getCaloriesSums(String input) {
    String[] blocks = input.split("\\n\\n");
    return Arrays.stream(blocks).mapToInt(CaloriesCounter::sum);
  }

  private static int sum(String input) {
    return input.lines().mapToInt(Integer::parseInt).sum();
  }
}
