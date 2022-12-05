package eu.happycoders.adventofcode2022.day5;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Implementation of a crate mover that moves all crates at a time.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CrateMover9001 implements CrateMover {

  @Override
  public void move(CrateStacks crateStacks, Move move) {
    CrateStack fromStack = CrateMover.getSourceStack(crateStacks, move);
    CrateStack toStack = CrateMover.getTargetStack(crateStacks, move);

    Deque<Crate> helperStack = new LinkedList<>();
    for (int i = 0; i < move.number(); i++) {
      helperStack.push(fromStack.pop());
    }

    while (!helperStack.isEmpty()) {
      toStack.push(helperStack.pop());
    }
  }
}
