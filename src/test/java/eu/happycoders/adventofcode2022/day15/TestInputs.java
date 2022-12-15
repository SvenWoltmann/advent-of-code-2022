package eu.happycoders.adventofcode2022.day15;

import java.util.ArrayList;
import java.util.List;

class TestInputs {

  static final String TEST_INPUT =
      """
          Sensor at x=2, y=18: closest beacon is at x=-2, y=15
          Sensor at x=9, y=16: closest beacon is at x=10, y=16
          Sensor at x=13, y=2: closest beacon is at x=15, y=3
          Sensor at x=12, y=14: closest beacon is at x=10, y=16
          Sensor at x=10, y=20: closest beacon is at x=10, y=16
          Sensor at x=14, y=17: closest beacon is at x=10, y=16
          Sensor at x=8, y=7: closest beacon is at x=2, y=10
          Sensor at x=2, y=0: closest beacon is at x=2, y=10
          Sensor at x=0, y=11: closest beacon is at x=2, y=10
          Sensor at x=20, y=14: closest beacon is at x=25, y=17
          Sensor at x=17, y=20: closest beacon is at x=21, y=22
          Sensor at x=16, y=7: closest beacon is at x=15, y=3
          Sensor at x=14, y=3: closest beacon is at x=15, y=3
          Sensor at x=20, y=1: closest beacon is at x=15, y=3""";

  static final PuzzleInput TEST_PUZZLE_INPUT = createTestPuzzleInput();

  private static PuzzleInput createTestPuzzleInput() {
    List<SensorReading> sensors = new ArrayList<>();

    sensors.add(new SensorReading(new Position(2, 18), new Position(-2, 15)));
    sensors.add(new SensorReading(new Position(9, 16), new Position(10, 16)));
    sensors.add(new SensorReading(new Position(13, 2), new Position(15, 3)));
    sensors.add(new SensorReading(new Position(12, 14), new Position(10, 16)));
    sensors.add(new SensorReading(new Position(10, 20), new Position(10, 16)));
    sensors.add(new SensorReading(new Position(14, 17), new Position(10, 16)));
    sensors.add(new SensorReading(new Position(8, 7), new Position(2, 10)));
    sensors.add(new SensorReading(new Position(2, 0), new Position(2, 10)));
    sensors.add(new SensorReading(new Position(0, 11), new Position(2, 10)));
    sensors.add(new SensorReading(new Position(20, 14), new Position(25, 17)));
    sensors.add(new SensorReading(new Position(17, 20), new Position(21, 22)));
    sensors.add(new SensorReading(new Position(16, 7), new Position(15, 3)));
    sensors.add(new SensorReading(new Position(14, 3), new Position(15, 3)));
    sensors.add(new SensorReading(new Position(20, 1), new Position(15, 3)));

    return new PuzzleInput(sensors);
  }
}
