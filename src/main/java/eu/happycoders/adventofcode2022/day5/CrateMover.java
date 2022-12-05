package eu.happycoders.adventofcode2022.day5;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Interface for a crate mover.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
interface CrateMover {

  void move(CrateStacks crateStacks, Move move);

  static CrateStack getSourceStack(CrateStacks crateStacks, Move move) {
    return crateStacks.stackAt(move.source());
  }

  static CrateStack getTargetStack(CrateStacks crateStacks, Move move) {
    return crateStacks.stackAt(move.target());
  }
}
