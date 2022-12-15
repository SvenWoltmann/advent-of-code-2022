package eu.happycoders.adventofcode2022.day15;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input string to a {@link PuzzleInput} object.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  private static final Pattern PATTERN =
      Pattern.compile(
          "Sensor at x=(-?\\d+), y=(-?\\d+): closest beacon is at x=(-?\\d+), y=(-?\\d+)");

  static PuzzleInput parse(String input) {
    List<SensorReading> sensorReadings =
        input.lines().map(PuzzleInputParser::parseSensorReading).toList();
    return new PuzzleInput(sensorReadings);
  }

  private static SensorReading parseSensorReading(String input) {
    Matcher matcher = PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Error parsing: " + input);
    }

    int sensorX = Integer.parseInt(matcher.group(1));
    int sensorY = Integer.parseInt(matcher.group(2));
    int beaconX = Integer.parseInt(matcher.group(3));
    int beaconY = Integer.parseInt(matcher.group(4));

    return new SensorReading(new Position(sensorX, sensorY), new Position(beaconX, beaconY));
  }
}
