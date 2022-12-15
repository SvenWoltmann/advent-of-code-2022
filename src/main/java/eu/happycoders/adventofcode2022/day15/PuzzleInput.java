package eu.happycoders.adventofcode2022.day15;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The puzzle input as a list of sensor readings.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PuzzleInput(List<SensorReading> sensorReadings) {

  @Override
  public String toString() {
    return sensorReadings.stream().map(SensorReading::toString).collect(Collectors.joining("\n"));
  }
}
