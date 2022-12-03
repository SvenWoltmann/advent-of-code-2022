package eu.happycoders.adventofcode2022.day3;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single item contained in a rucksack.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Item(char type) {

  int getPriority() {
    if (type >= 'a' && type <= 'z') {
      return type - 'a' + 1;
    } else if (type >= 'A' && type <= 'Z') {
      return type - 'A' + 27;
    } else {
      throw new IllegalArgumentException();
    }
  }
}
