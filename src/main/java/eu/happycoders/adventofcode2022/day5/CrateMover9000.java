package eu.happycoders.adventofcode2022.day5;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Implementation of a crate mover that moves one crate at a time.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CrateMover9000 implements CrateMover {

  @Override
  public void move(CrateStacks crateStacks, Move move) {
    CrateStack fromStack = CrateMover.getSourceStack(crateStacks, move);
    CrateStack toStack = CrateMover.getTargetStack(crateStacks, move);

    for (int i = 0; i < move.number(); i++) {
      toStack.push(fromStack.pop());
    }
  }
}
