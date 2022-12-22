package eu.happycoders.adventofcode2022.day22;

import static eu.happycoders.adventofcode2022.day22.Direction.RIGHT;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Executes instructions on the board (and the cube).
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class InstructionExecutor {

  private final BoardMap boardMap;
  private final CubeLogic cubeLogic;

  private Position position;
  private Direction direction;

  InstructionExecutor(BoardMap boardMap, CubeLogic cubeLogic) {
    this.boardMap = boardMap;
    this.cubeLogic = cubeLogic;
    this.position = boardMap.findStartPosition();
    this.direction = RIGHT;
  }

  void execute(List<Instruction> instructions) {
    for (Instruction instruction : instructions) {
      switch (instruction) {
        case GoForward goForward -> goForward(goForward.numberOfTiles());
        case TurnClockwise ignored -> turnClockwise();
        case TurnCounterClockwise ignored -> turnCounterClockwise();
        default -> throw new IllegalArgumentException();
      }
    }
  }

  private void goForward(int numberOfTiles) {
    // Go forward on open tiles until we hit a wall.
    // If we leave the map, we re-enter it at the next open space.
    for (int i = 0; i < numberOfTiles; i++) {
      NextPositionAndDirection nextPositionAndDirection = move(position, direction);
      Tile tile = boardMap.getTile(nextPositionAndDirection.position());
      switch (tile) {
        case WALL -> {
          return;
        }
        case OPEN -> {
          position = nextPositionAndDirection.position();
          direction = nextPositionAndDirection.direction();
        }
        default -> throw new IllegalArgumentException();
      }
    }
  }

  record NextPositionAndDirection(Position position, Direction direction) {}

  private NextPositionAndDirection move(Position position, Direction direction) {
    if (cubeLogic == null) {
      return move2D(position, direction);
    } else {
      return move3D(position, direction);
    }
  }

  private NextPositionAndDirection move2D(Position position, Direction direction) {
    do {
      position = wrapAround2D(position.move(direction));
    } while (boardMap.getTile(position) == null);

    return new NextPositionAndDirection(position, direction);
  }

  private Position wrapAround2D(Position position) {
    if (position.column() < 0) {
      return new Position(boardMap.width() - 1, position.row());
    }

    if (position.column() >= boardMap.width()) {
      return new Position(0, position.row());
    }

    if (position.row() < 0) {
      return new Position(position.column(), boardMap.height() - 1);
    }

    if (position.row() >= boardMap.height()) {
      return new Position(position.column(), 0);
    }

    return position;
  }

  private NextPositionAndDirection move3D(Position position, Direction direction) {
    Position newPosition = position.move(direction);
    Direction newDirection = direction;

    // New position is outside the boundaries or off-map?
    if (newPosition.column() < 0
        || newPosition.column() >= boardMap.width()
        || newPosition.row() < 0
        || newPosition.row() >= boardMap.height()
        || boardMap.getTile(newPosition) == null) {
      // Map position on board map to cube face coordinates
      CubeFaceCoordinates cubeFaceCoordinates = cubeLogic.toCubeFaceCoordinates(position, boardMap);

      // Find a wormhole from old to new cube face coordinates
      WormholeCoordinates startCoordinates =
          new WormholeCoordinates(cubeFaceCoordinates.faceId(), direction);
      WormholeCoordinates endCoordinates = cubeLogic.findTransport(startCoordinates);

      // Transport from old to new cube face
      CubeFaceCoordinates newCubeFaceCoordinates =
          cubeFaceCoordinates.transportTo(endCoordinates, direction);

      // Map new cube face coordinates back to board map
      newPosition = cubeLogic.toBoardMapCoordinates(newCubeFaceCoordinates, boardMap);
      newDirection = endCoordinates.side().flip();
    }

    return new NextPositionAndDirection(newPosition, newDirection);
  }

  private void turnClockwise() {
    direction = direction.clockwise();
  }

  private void turnCounterClockwise() {
    direction = direction.counterClockwise();
  }

  int calculateFinalPassword() {
    // Here (and only here) we have to map from 0-based to 1-based coordinates
    return 1000 * (position.row() + 1) + 4 * (position.column() + 1) + direction.number();
  }
}
