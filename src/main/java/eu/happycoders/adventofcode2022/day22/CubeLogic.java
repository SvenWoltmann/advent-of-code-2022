package eu.happycoders.adventofcode2022.day22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The logic for mapping the 3D cube to the 2D board map and vice-versa.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CubeLogic {

  private final int cubeFaceLength;
  private final Map<WormholeCoordinates, WormholeCoordinates> wormholeMap;

  CubeLogic(int cubeFaceLength, List<Wormhole> wormholes) {
    this.cubeFaceLength = cubeFaceLength;

    this.wormholeMap = new HashMap<>();
    for (Wormhole wormhole : wormholes) {
      this.wormholeMap.put(wormhole.start(), wormhole.end());
      this.wormholeMap.put(wormhole.end(), wormhole.start());
    }
  }

  CubeFaceCoordinates toCubeFaceCoordinates(Position position, BoardMap boardMap) {
    int cubeFacesColumn = position.column() / cubeFaceLength;
    int cubeFacesRow = position.row() / cubeFaceLength;
    int horizontalCubes = boardMap.width() / cubeFaceLength;
    int cubeFaceId = cubeFacesRow * horizontalCubes + cubeFacesColumn;
    return new CubeFaceCoordinates(
        cubeFaceId,
        cubeFaceLength,
        new Position(
            position.column() - cubeFacesColumn * cubeFaceLength,
            position.row() - cubeFacesRow * cubeFaceLength));
  }

  WormholeCoordinates findTransport(WormholeCoordinates startCoordinates) {
    return wormholeMap.get(startCoordinates);
  }

  Position toBoardMapCoordinates(CubeFaceCoordinates cubeFaceCoordinates, BoardMap boardMap) {
    int horizontalCubes = boardMap.width() / cubeFaceLength;
    int offsetColumn = (cubeFaceCoordinates.faceId() % horizontalCubes) * cubeFaceLength;
    int offsetRow = (cubeFaceCoordinates.faceId() / horizontalCubes) * cubeFaceLength;
    int newColumn = offsetColumn + cubeFaceCoordinates.position().column();
    int newRow = offsetRow + cubeFaceCoordinates.position().row();
    return new Position(newColumn, newRow);
  }
}
