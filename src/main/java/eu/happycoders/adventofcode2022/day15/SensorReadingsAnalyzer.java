package eu.happycoders.adventofcode2022.day15;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Analyzer for sensor readings.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class SensorReadingsAnalyzer {

  private final List<SensorReading> sensorReadings;

  SensorReadingsAnalyzer(List<SensorReading> sensorReadings) {
    this.sensorReadings = sensorReadings;
  }

  int countNonBeaconFieldsInRow(int row) {
    Ranges ranges = getCoveredRangesInRow(row, Integer.MIN_VALUE, Integer.MAX_VALUE);

    int sumOfSensorCoveredFields = ranges.getList().stream().mapToInt(Range::getLength).sum();

    return sumOfSensorCoveredFields - countBeaconsInRow(row);
  }

  Position findBeacon(int maxX, int maxY) {
    Position result = null;
    for (int y = 0; y < maxY; y++) {
      Ranges ranges = getCoveredRangesInRow(y, 0, maxX);
      Optional<Integer> singleUncoveredValue = ranges.getSingleUncoveredValue(0, maxX);
      if (singleUncoveredValue.isPresent()) {
        if (result == null) {
          result = new Position(singleUncoveredValue.get(), y);
        } else {
          throw new IllegalStateException("Two beacons found");
        }
      }
    }
    return result;
  }

  private Ranges getCoveredRangesInRow(int row, int rangeMin, int rangeMax) {
    Ranges ranges = new Ranges();

    for (SensorReading sensor : sensorReadings) {
      int verticalDistance = Math.abs(sensor.sensor().y() - row);
      int maxHorizontalDistance = sensor.maxDistance() - verticalDistance;
      if (maxHorizontalDistance >= 0) {
        int sensorRangeStart = sensor.sensor().x() - maxHorizontalDistance;
        int sensorRangeEnd = sensor.sensor().x() + maxHorizontalDistance;
        ranges.addRange(Math.max(sensorRangeStart, rangeMin), Math.min(sensorRangeEnd, rangeMax));
      }
    }

    return ranges;
  }

  private int countBeaconsInRow(int row) {
    Set<Position> beacons = new HashSet<>();
    for (SensorReading sensor : sensorReadings) {
      if (sensor.beacon().y() == row) {
        beacons.add(sensor.beacon());
      }
    }
    return beacons.size();
  }
}
