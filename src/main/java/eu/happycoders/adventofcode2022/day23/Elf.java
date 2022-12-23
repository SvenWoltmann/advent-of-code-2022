package eu.happycoders.adventofcode2022.day23;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An elf with its position and proposed step for the second half of the round.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Elf {
  private Position position;
  private Direction proposedStep;

  Elf(Position position) {
    this.position = position;
  }

  void setPosition(Position position) {
    this.position = position;
  }

  Position position() {
    return position;
  }

  void setProposedStep(Direction proposedStep) {
    this.proposedStep = proposedStep;
  }

  Direction proposedStep() {
    return proposedStep;
  }
}
