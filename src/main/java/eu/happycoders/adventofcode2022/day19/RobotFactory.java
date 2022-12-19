package eu.happycoders.adventofcode2022.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A factory for robots.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class RobotFactory {

  private final Blueprint blueprint;

  RobotFactory(Blueprint blueprint) {
    this.blueprint = blueprint;
  }

  List<RobotTypeWithCost> getProducibleRobotTypes(
      Resources resources, Set<ResourceType> allowedTypes) {
    List<RobotTypeWithCost> result = new ArrayList<>();
    for (ResourceType resourceType : ResourceType.values()) {
      if (allowedTypes == null || allowedTypes.contains(resourceType)) {
        Resources robotCost = blueprint.getRobotCost(resourceType);
        if (resources.cover(robotCost)) {
          result.add(new RobotTypeWithCost(resourceType, robotCost));
        }
      }
    }

    return result;
  }
}
