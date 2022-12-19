package eu.happycoders.adventofcode2022.day19;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 19.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day19Solver {

  static int solveTask1(String input) {
    List<Blueprint> blueprints = BlueprintsParser.parse(input);

    int sumOfQualityLevels = 0;

    for (Blueprint blueprint : blueprints) {
      RobotFactory factory = new RobotFactory(blueprint);
      Simulator simulator = new Simulator(factory, 24);
      int largestNumberOfGeodes = simulator.runSimulation();
      int qualityLevel = blueprint.getId() * largestNumberOfGeodes;

      System.out.printf(
          "Blueprint %d: %d geodes -> qualityLevel = %d%n",
          blueprint.getId(), largestNumberOfGeodes, qualityLevel);

      sumOfQualityLevels += qualityLevel;
    }

    System.out.printf("Sum of quality levels: %d%n", sumOfQualityLevels);

    return sumOfQualityLevels;
  }

  static int solveTask2(String input) {
    List<Blueprint> blueprints = BlueprintsParser.parse(input);

    int product = 1;

    // This time only the first three blueprints
    for (int i = 0; i < Math.min(blueprints.size(), 3); i++) {
      Blueprint blueprint = blueprints.get(i);
      RobotFactory factory = new RobotFactory(blueprint);
      Simulator simulator = new Simulator(factory, 32);
      int largestNumberOfGeodes = simulator.runSimulation();

      System.out.printf("Blueprint %d: %d geodes%n", blueprint.getId(), largestNumberOfGeodes);

      product *= largestNumberOfGeodes;
    }

    System.out.printf("Product of first three quality levels: %d%n", product);

    return product;
  }
}
