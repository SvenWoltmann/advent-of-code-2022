package eu.happycoders.adventofcode2022.day19;

import java.util.EnumMap;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The amount of robots of each type.
 *
 * <p>This class is immutable.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Robots {

  private final EnumMap<ResourceType, Integer> numberOfRobots;

  Robots() {
    numberOfRobots = new EnumMap<>(ResourceType.class);
  }

  private Robots(EnumMap<ResourceType, Integer> numberOfRobots) {
    this.numberOfRobots = numberOfRobots;
  }

  Robots addOneRobot(ResourceType resourceType) {
    EnumMap<ResourceType, Integer> newNumberOfRobots = new EnumMap<>(numberOfRobots);
    newNumberOfRobots.compute(
        resourceType, (ignore, oldValue) -> oldValue == null ? 1 : oldValue + 1);
    return new Robots(newNumberOfRobots);
  }

  int getNumberOfRobots(ResourceType resourceType) {
    return numberOfRobots.getOrDefault(resourceType, 0);
  }

  Resources produceResources(Resources oldResources) {
    Resources.ResourcesBuilder builder = Resources.builder();

    for (ResourceType resourceType : ResourceType.values()) {
      int oldValue = oldResources.get(resourceType);
      int numRobots = numberOfRobots.getOrDefault(resourceType, 0);
      builder.with(resourceType, oldValue + numRobots);
    }

    return builder.build();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (ResourceType resourceType : ResourceType.values()) {
      addResourceTypeToString(result, getNumberOfRobots(resourceType), resourceType);
    }
    return result.toString();
  }

  private void addResourceTypeToString(
      StringBuilder result, int amount, ResourceType resourceType) {
    if (amount > 0) {
      if (!result.isEmpty()) {
        result.append(" and ");
      }
      result.append(amount);
      result.append(' ');
      result.append(resourceType);
      result.append("-collecting");
    }
  }
}
