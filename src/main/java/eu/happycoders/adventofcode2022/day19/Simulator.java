package eu.happycoders.adventofcode2022.day19;

import static eu.happycoders.adventofcode2022.day19.ResourceType.GEODE;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Simulates robots collecting resources and the robot factory building new robots.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Simulator {

  private final RobotFactory factory;
  private final int maxMinutes;
  private int largestNumberOfGeodes;

  Simulator(RobotFactory factory, int maxMinutes) {
    this.factory = factory;
    this.maxMinutes = maxMinutes;
  }

  int runSimulation() {
    simulateRound(1, Situation.initialSituation());
    return largestNumberOfGeodes;
  }

  private void simulateRound(int minute, Situation situation) {
    // Optimization: Is it possible to beat the current record from the current situation?
    if (!canWeBeatTheRecord(minute, situation)) {
      return;
    }

    // Option 1: Produce a robot
    List<RobotTypeWithCost> producibleRobotTypes = defineRobotTypesToProduce(minute, situation);
    for (RobotTypeWithCost robotTypeWithCost : producibleRobotTypes) {
      // Optimization: If I *could* have produced this robot in the previous round but didn't
      // produce *any*, then it wouldn't have made sense to save the money. So don't produce it now!
      if (couldHaveBoughtThisRobotBeforeButDidnt(situation, robotTypeWithCost)) {
        continue;
      }

      simulateRoundProducing(minute, situation, robotTypeWithCost);
    }

    // Option 2: Wait and save resource for a more expensive robot
    // (unless I have enough resources for all types of robots)
    if (producibleRobotTypes.size() < ResourceType.values().length) {
      simulateRoundProducing(minute, situation, null);
    }
  }

  private boolean canWeBeatTheRecord(int minute, Situation situation) {
    int remainingMinutes = maxMinutes + 1 - minute; // +1 as we start at minute 1

    int currentNumberOfGeodeRobots = situation.robots().getNumberOfRobots(GEODE);

    int maximumAdditionalGeodeFromExistingRobots = currentNumberOfGeodeRobots * remainingMinutes;
    int maximumAdditionalGeodeFromNewRobots = remainingMinutes * (remainingMinutes - 1) / 2;

    int currentAmountOfGeode = situation.resources().get(GEODE);

    int reachableGeode =
        currentAmountOfGeode
            + maximumAdditionalGeodeFromExistingRobots
            + maximumAdditionalGeodeFromNewRobots;

    return reachableGeode > largestNumberOfGeodes;
  }

  private List<RobotTypeWithCost> defineRobotTypesToProduce(int minute, Situation situation) {
    //  Optimization: We don't need to produce any robots in the last minute
    if (minute == maxMinutes) {
      return Collections.emptyList();
    }

    // Optimization: We don't need to produce any other than geode-producing robots in the minute
    // before the last
    if (minute == maxMinutes - 1) {
      return factory.getProducibleRobotTypes(situation.resources(), Set.of(GEODE));
    }

    // Optimization: We don't need to produce any other than geode-, ore- and obsidian-producing
    // robots if it's two minutes before the end
    if (minute == maxMinutes - 2) {
      return factory.getProducibleRobotTypes(
          situation.resources(), Set.of(GEODE, ResourceType.ORE, ResourceType.OBSIDIAN));
    }

    return factory.getProducibleRobotTypes(situation.resources(), null);
  }

  private static boolean couldHaveBoughtThisRobotBeforeButDidnt(
      Situation situation, RobotTypeWithCost robotTypeWithCost) {
    if (situation.robotBoughtToCreateThisSituation() == null) {
      Situation parentSituation = situation.parent();
      return parentSituation != null && parentSituation.resources().cover(robotTypeWithCost.cost());
    }
    return false;
  }

  private void simulateRoundProducing(
      int minute, Situation situation, RobotTypeWithCost robotTypeWithCost) {
    Resources resources = situation.resources();

    // Subtract resources for robot
    if (robotTypeWithCost != null) {
      resources = resources.subtract(robotTypeWithCost.cost());
    }

    // Produce resources
    Robots robots = situation.robots();
    resources = robots.produceResources(resources);

    // Produce robot
    if (robotTypeWithCost != null) {
      robots = situation.robots().addOneRobot(robotTypeWithCost.resourceType());
    }

    Situation newSituation = new Situation(robots, robotTypeWithCost, resources, situation);

    if (minute == maxMinutes) {
      int numberOfGeodes = newSituation.resources().get(GEODE);
      if (numberOfGeodes > largestNumberOfGeodes) {
        largestNumberOfGeodes = numberOfGeodes;
      }
    } else {
      simulateRound(minute + 1, newSituation);
    }
  }
}
