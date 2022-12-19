package eu.happycoders.adventofcode2022.day19;

import java.util.EnumMap;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A collection of ore, clay, obsidian and geode.
 *
 * <p>This class is immutable.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Resources {

  private final EnumMap<ResourceType, Integer> numberOfResources;

  Resources() {
    this.numberOfResources = new EnumMap<>(ResourceType.class);
  }

  private Resources(EnumMap<ResourceType, Integer> numberOfResources) {
    this.numberOfResources = numberOfResources;
  }

  int get(ResourceType resourceType) {
    return numberOfResources.getOrDefault(resourceType, 0);
  }

  Resources subtract(Resources cost) {
    ResourcesBuilder builder = new ResourcesBuilder();
    for (ResourceType resourceType : ResourceType.values()) {
      int oldValue = get(resourceType);
      int costValue = cost.get(resourceType);
      int newValue = oldValue - costValue;
      builder.with(resourceType, newValue);
    }
    return builder.build();
  }

  boolean cover(Resources cost) {
    for (ResourceType value : ResourceType.values()) {
      if (cost.get(value) > get(value)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Resources that = (Resources) object;
    return Objects.equals(numberOfResources, that.numberOfResources);
  }

  @Override
  public int hashCode() {
    return numberOfResources != null ? numberOfResources.hashCode() : 0;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (ResourceType resourceType : ResourceType.values()) {
      addResourceTypeToString(result, get(resourceType), resourceType);
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
    }
  }

  static ResourcesBuilder builder() {
    return new ResourcesBuilder();
  }

  static class ResourcesBuilder {

    private final EnumMap<ResourceType, Integer> numberOfResources =
        new EnumMap<>(ResourceType.class);

    ResourcesBuilder with(ResourceType resourceType, int value) {
      numberOfResources.put(resourceType, value);
      return this;
    }

    Resources build() {
      return new Resources(numberOfResources);
    }
  }
}
