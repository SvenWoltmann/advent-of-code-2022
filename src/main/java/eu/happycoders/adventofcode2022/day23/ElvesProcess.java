package eu.happycoders.adventofcode2022.day23;

import static eu.happycoders.adventofcode2022.day23.DirectionLogic.determineDirectionsToLookAt;
import static eu.happycoders.adventofcode2022.day23.DirectionLogic.getFourAdjacentDirectionsInOrderForRound;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The process to move the elves.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ElvesProcess {

  private final List<Elf> elves;
  private Set<Position> elvesPositions;
  int round;

  ElvesProcess(List<Position> positions) {
    this.elves = positions.stream().map(Elf::new).toList();
    this.elvesPositions = new HashSet<>(positions);
  }

  List<Elf> getElves() {
    return List.copyOf(elves);
  }

  boolean playOneRound() {
    boolean proposalsMade = playFirstHalf();
    if (!proposalsMade) {
      return false;
    }
    return playSecondHalf();
  }

  boolean playFirstHalf() {
    round++;
    boolean proposalsMade = false;
    for (Elf elf : elves) {
      List<Position> adjacentPositions = elf.position().getEightAdjacentPositions();
      if (noElvesAreInOneThosePositions(adjacentPositions)) {
        continue;
      }

      List<Direction> adjacentDirections = getFourAdjacentDirectionsInOrderForRound(round);
      Direction proposedStep = calculateProposedStep(elf.position(), adjacentDirections);
      proposalsMade |= proposedStep != null;
      elf.setProposedStep(proposedStep);
    }
    return proposalsMade;
  }

  private Direction calculateProposedStep(Position position, List<Direction> directions) {
    for (Direction direction : directions) {
      List<Position> positions =
          determineDirectionsToLookAt(direction).stream().map(position::at).toList();
      if (noElvesAreInOneThosePositions(positions)) {
        return direction;
      }
    }
    return null;
  }

  private boolean noElvesAreInOneThosePositions(List<Position> positions) {
    for (Position position : positions) {
      if (elvesPositions.contains(position)) {
        return false;
      }
    }
    return true;
  }

  boolean playSecondHalf() {
    Set<Position> proposedDestinations = new HashSet<>();
    Set<Position> duplicates = new HashSet<>();

    for (Elf elf : elves) {
      if (elf.proposedStep() != null) {
        Position position = elf.position().at(elf.proposedStep());
        if (proposedDestinations.contains(position)) {
          duplicates.add(position);
        } else {
          proposedDestinations.add(position);
        }
      }
    }

    boolean anyoneMoved = false;
    for (Elf elf : elves) {
      if (elf.proposedStep() != null) {
        Position position = elf.position().at(elf.proposedStep());
        if (!duplicates.contains(position)) {
          anyoneMoved = true;
          elf.setPosition(position);
        }
        elf.setProposedStep(null);
      }
    }

    if (anyoneMoved) {
      this.elvesPositions = elves.stream().map(Elf::position).collect(Collectors.toSet());
    }

    return anyoneMoved;
  }

  Rectangle getSmallestRectangle() {
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int maxY = Integer.MIN_VALUE;
    for (Position elvesPosition : elvesPositions) {
      minX = Math.min(minX, elvesPosition.x());
      maxX = Math.max(maxX, elvesPosition.x());
      minY = Math.min(minY, elvesPosition.y());
      maxY = Math.max(maxY, elvesPosition.y());
    }
    return new Rectangle(minX, minY, maxX, maxY);
  }

  public int getRound() {
    return round;
  }
}
