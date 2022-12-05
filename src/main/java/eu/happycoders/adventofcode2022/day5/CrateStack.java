package eu.happycoders.adventofcode2022.day5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single stack of crates.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CrateStack {

  // ArrayDeque is actually the best single-threaded stack implementation to use.
  // However, it doesn't override equals() and hashCode(), so we cannot easily compare two stacks.
  // Therefore, let's use LinkedList, which is not as performant, but performant enough.
  private final Deque<Crate> crates = new LinkedList<>();

  static CrateStack of(char... values) {
    CrateStack crateStack = new CrateStack();
    for (char value : values) {
      crateStack.crates.push(new Crate(value));
    }
    return crateStack;
  }

  void push(Crate crate) {
    crates.push(crate);
  }

  Crate peek() {
    return crates.peek();
  }

  Crate pop() {
    return crates.pop();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    CrateStack that = (CrateStack) object;

    return Objects.equals(crates, that.crates);
  }

  @Override
  public int hashCode() {
    return crates.hashCode();
  }

  @Override
  public String toString() {
    return crates.toString();
  }
}
