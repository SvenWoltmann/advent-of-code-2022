package eu.happycoders.adventofcode2022.day5;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Multiple stacks of crates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CrateStacks {

  private final CrateStack[] stacks;

  CrateStacks(int numberOfStacks) {
    stacks = new CrateStack[numberOfStacks];
    for (int i = 0; i < numberOfStacks; i++) {
      stacks[i] = new CrateStack();
    }
  }

  CrateStack stackAt(int position) {
    return stacks[position - 1];
  }

  int size() {
    return stacks.length;
  }
}
