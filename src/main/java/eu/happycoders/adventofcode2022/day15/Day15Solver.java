package eu.happycoders.adventofcode2022.day15;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 15.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day15Solver {

  static int solvePart1(String input, int row) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    SensorReadingsAnalyzer sensorReadingsAnalyzer =
        new SensorReadingsAnalyzer(puzzleInput.sensorReadings());

    return sensorReadingsAnalyzer.countNonBeaconFieldsInRow(row);
  }

  static long solvePart2(String input, int maxCoords) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);

    SensorReadingsAnalyzer sensorReadingsAnalyzer =
        new SensorReadingsAnalyzer(puzzleInput.sensorReadings());

    Position beaconPos = sensorReadingsAnalyzer.findBeacon(maxCoords, maxCoords);

    return (long) beaconPos.x() * 4_000_000 + beaconPos.y();
  }
}
