package eu.happycoders.adventofcode2022.day23;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PositionTest {

  @Test
  void givenAPosition_getEightAdjacentPositions_returnsTheEightAdjacentPositions() {
    Position position = new Position(20, 10);

    List<Position> adjacentPositions = position.getEightAdjacentPositions();

    assertThat(adjacentPositions)
        .containsExactlyInAnyOrder(
            new Position(20, 9),
            new Position(21, 9),
            new Position(21, 10),
            new Position(21, 11),
            new Position(20, 11),
            new Position(19, 11),
            new Position(19, 10),
            new Position(19, 9));
  }

  public static Stream<Arguments> positionsAndDirections() {
    return Stream.of(
        Arguments.of(new Position(40, 30), Direction.NORTH, new Position(40, 29)),
        Arguments.of(new Position(50, 40), Direction.NORTH_EAST, new Position(51, 39)),
        Arguments.of(new Position(-100, -200), Direction.EAST, new Position(-99, -200)),
        Arguments.of(new Position(0, 0), Direction.SOUTH_EAST, new Position(1, 1)),
        Arguments.of(new Position(55, 55), Direction.SOUTH, new Position(55, 56)),
        Arguments.of(new Position(123, 456), Direction.SOUTH_WEST, new Position(122, 457)),
        Arguments.of(new Position(-80, 80), Direction.WEST, new Position(-81, 80)),
        Arguments.of(new Position(80, -80), Direction.NORTH_WEST, new Position(79, -81)));
  }

  @ParameterizedTest
  @MethodSource("positionsAndDirections")
  void givenAPositionAndADirection_at_returnsThePositionAtTheDirection(
      Position position, Direction direction, Position expectedPosition) {
    Position newPosition = position.at(direction);

    assertThat(newPosition).isEqualTo(expectedPosition);
  }
}
