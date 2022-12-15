package eu.happycoders.adventofcode2022.day15;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A single sensor reading consisting of the sensor position and the beacon position.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record SensorReading(Position sensor, Position beacon, int maxDistance) {

  SensorReading(Position sensor, Position beacon) {
    this(sensor, beacon, sensor.distanceTo(beacon));
  }

  @Override
  public String toString() {
    return "Sensor at %s: closest beacon is at %s".formatted(sensor, beacon);
  }
}
