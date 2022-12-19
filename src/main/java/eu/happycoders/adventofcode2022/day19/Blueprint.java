package eu.happycoders.adventofcode2022.day19;

import java.util.EnumMap;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A blueprint defining which robots the {@link RobotFactory} can produce at what cost.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Blueprint {

  private final int id;
  private final EnumMap<ResourceType, Resources> robotCosts = new EnumMap<>(ResourceType.class);

  Blueprint(
      int id,
      Resources oreRobotCost,
      Resources clayRobotCost,
      Resources obsidianRobotCost,
      Resources geodeRobotCost) {
    this.id = id;
    robotCosts.put(ResourceType.ORE, oreRobotCost);
    robotCosts.put(ResourceType.CLAY, clayRobotCost);
    robotCosts.put(ResourceType.OBSIDIAN, obsidianRobotCost);
    robotCosts.put(ResourceType.GEODE, geodeRobotCost);
  }

  int getId() {
    return id;
  }

  Resources getRobotCost(ResourceType resourceType) {
    return robotCosts.get(resourceType);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Blueprint that = (Blueprint) object;
    return id == that.id && robotCosts.equals(that.robotCosts);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + robotCosts.hashCode();
    return result;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Blueprint ").append(id).append(':');

    for (ResourceType resourceType : ResourceType.values()) {
      result.append(
          " Each %s robot costs %s.".formatted(resourceType, robotCosts.get(resourceType)));
    }

    return result.toString();
  }
}
