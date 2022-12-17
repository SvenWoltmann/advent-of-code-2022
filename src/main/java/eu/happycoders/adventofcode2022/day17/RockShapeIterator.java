package eu.happycoders.adventofcode2022.day17;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An iterator returning rock shapes in a specific order.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class RockShapeIterator {

  private int index;

  RockShape next() {
    RockShape rockShape = RockShape.values()[index];

    index++;
    if (index == RockShape.values().length) {
      index = 0;
    }

    return rockShape;
  }
}
