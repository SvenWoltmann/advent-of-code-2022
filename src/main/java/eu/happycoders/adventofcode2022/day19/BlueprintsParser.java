package eu.happycoders.adventofcode2022.day19;

import static eu.happycoders.adventofcode2022.day19.ResourceType.CLAY;
import static eu.happycoders.adventofcode2022.day19.ResourceType.OBSIDIAN;
import static eu.happycoders.adventofcode2022.day19.ResourceType.ORE;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the puzzle input text into a list of {@link Blueprint}s.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class BlueprintsParser {
  private static final Pattern PATTERN =
      Pattern.compile(
          "Blueprint (\\d+): "
              + "Each ore robot costs (\\d+) ore. "
              + "Each clay robot costs (\\d+) ore. "
              + "Each obsidian robot costs (\\d+) ore and (\\d+) clay. "
              + "Each geode robot costs (\\d+) ore and (\\d+) obsidian.");

  static List<Blueprint> parse(String input) {
    return input.lines().map(BlueprintsParser::parseBlueprint).toList();
  }

  private static Blueprint parseBlueprint(String input) {
    Matcher matcher = PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(input);
    }

    int id = Integer.parseInt(matcher.group(1));

    int oreRobotCostOre = Integer.parseInt(matcher.group(2));
    Resources oreRobotCost = Resources.builder().with(ORE, oreRobotCostOre).build();

    int clayRobotCostOre = Integer.parseInt(matcher.group(3));
    Resources clayRobotCost = Resources.builder().with(ORE, clayRobotCostOre).build();

    int obsidianRobotCostOre = Integer.parseInt(matcher.group(4));
    int obsidianRobotCostClay = Integer.parseInt(matcher.group(5));
    Resources obsidianRobotCost =
        Resources.builder()
            .with(ORE, obsidianRobotCostOre)
            .with(CLAY, obsidianRobotCostClay)
            .build();

    int geodeRobotCostOre = Integer.parseInt(matcher.group(6));
    int geodeRobotCostObsidian = Integer.parseInt(matcher.group(7));
    Resources geodeRobotCost =
        Resources.builder()
            .with(ORE, geodeRobotCostOre)
            .with(OBSIDIAN, geodeRobotCostObsidian)
            .build();

    return new Blueprint(id, oreRobotCost, clayRobotCost, obsidianRobotCost, geodeRobotCost);
  }
}
