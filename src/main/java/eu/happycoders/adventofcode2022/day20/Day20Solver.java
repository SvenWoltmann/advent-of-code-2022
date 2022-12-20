package eu.happycoders.adventofcode2022.day20;

import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 20.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day20Solver {

  private static final long DECRYPTION_KEY = 811_589_153L;

  static long solveTask1(String input) {
    List<Long> numbers = ListParser.parse(input);
    File file = new File(numbers);
    file.mix();
    return file.getGroveCoordinates();
  }

  static long solveTask2(String input) {
    List<Long> numbers = new ArrayList<>(ListParser.parse(input));

    numbers.replaceAll(value -> value * DECRYPTION_KEY);

    File file = new File(numbers);
    for (int i = 0; i < 10; i++) {
      file.mix();
    }
    return file.getGroveCoordinates();
  }
}
