package eu.happycoders.adventofcode2022.day17;

import static eu.happycoders.adventofcode2022.day17.Direction.LEFT;
import static eu.happycoders.adventofcode2022.day17.Direction.RIGHT;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The jets pushing the rocks left and right.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Jets {

  private final String input;

  private int index;

  Jets(String input) {
    this.input = input;
  }

  Direction next() {
    Direction direction = input.charAt(index) == '<' ? LEFT : RIGHT;
    index++;
    if (index == input.length()) {
      index = 0;
    }
    return direction;
  }

  int index() {
    return index;
  }
}
