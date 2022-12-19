package eu.happycoders.adventofcode2022.day19;

import java.util.Locale;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The specific resource type (ore, clay, obsidian, geode).
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum ResourceType {
  ORE,
  CLAY,
  OBSIDIAN,
  GEODE;

  @Override
  public String toString() {
    return name().toLowerCase(Locale.US);
  }
}
