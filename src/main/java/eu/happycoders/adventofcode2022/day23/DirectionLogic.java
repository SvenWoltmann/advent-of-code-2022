package eu.happycoders.adventofcode2022.day23;

import static eu.happycoders.adventofcode2022.day23.Direction.EAST;
import static eu.happycoders.adventofcode2022.day23.Direction.NORTH;
import static eu.happycoders.adventofcode2022.day23.Direction.NORTH_EAST;
import static eu.happycoders.adventofcode2022.day23.Direction.NORTH_WEST;
import static eu.happycoders.adventofcode2022.day23.Direction.SOUTH;
import static eu.happycoders.adventofcode2022.day23.Direction.SOUTH_EAST;
import static eu.happycoders.adventofcode2022.day23.Direction.SOUTH_WEST;
import static eu.happycoders.adventofcode2022.day23.Direction.WEST;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Contains the logic for which directions to look at in the various steps of the process.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
public class DirectionLogic {

  private static final List<Direction> EAST_NORTH_SOUTH_WEST = List.of(EAST, NORTH, SOUTH, WEST);
  private static final List<Direction> NORTH_SOUTH_WEST_EAST = List.of(NORTH, SOUTH, WEST, EAST);
  private static final List<Direction> SOUTH_WEST_EAST_NORTH = List.of(SOUTH, WEST, EAST, NORTH);
  private static final List<Direction> WEST_EAST_NORTH_SOUTH = List.of(WEST, EAST, NORTH, SOUTH);

  private static final List<Direction> N_NE_NW = List.of(NORTH, NORTH_EAST, NORTH_WEST);
  private static final List<Direction> S_SE_SW = List.of(SOUTH, SOUTH_EAST, SOUTH_WEST);
  private static final List<Direction> W_NW_SW = List.of(WEST, NORTH_WEST, SOUTH_WEST);
  private static final List<Direction> E_NE_SE = List.of(EAST, NORTH_EAST, SOUTH_EAST);

  static List<Direction> getFourAdjacentDirectionsInOrderForRound(int round) {
    return switch (round % 4) {
      case 0 -> EAST_NORTH_SOUTH_WEST;
      case 1 -> NORTH_SOUTH_WEST_EAST;
      case 2 -> SOUTH_WEST_EAST_NORTH;
      case 3 -> WEST_EAST_NORTH_SOUTH;
      default -> throw new AssertionError("Invalid result of remainder operation");
    };
  }

  static List<Direction> determineDirectionsToLookAt(Direction direction) {
    return switch (direction) {
      case NORTH -> N_NE_NW;
      case SOUTH -> S_SE_SW;
      case WEST -> W_NW_SW;
      case EAST -> E_NE_SE;
      default -> throw new IllegalArgumentException(
          "Invalid direction for this step: " + direction);
    };
  }
}
