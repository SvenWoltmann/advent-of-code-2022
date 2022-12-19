package eu.happycoders.adventofcode2022.day19;

import static eu.happycoders.adventofcode2022.day19.ResourceType.CLAY;
import static eu.happycoders.adventofcode2022.day19.ResourceType.OBSIDIAN;
import static eu.happycoders.adventofcode2022.day19.ResourceType.ORE;

class TestInputs {

  static final String TEST_INPUT =
      """
          Blueprint 1: Each ore robot costs 4 ore. Each clay robot costs 2 ore. Each obsidian robot costs 3 ore and 14 clay. Each geode robot costs 2 ore and 7 obsidian.
          Blueprint 2: Each ore robot costs 2 ore. Each clay robot costs 3 ore. Each obsidian robot costs 3 ore and 8 clay. Each geode robot costs 3 ore and 12 obsidian.""";

  static final Blueprint TEST_BLUEPRINT_1 = createTestBlueprint1();

  static final Blueprint TEST_BLUEPRINT_2 = createTestBlueprint2();

  private static Blueprint createTestBlueprint1() {
    Resources oreRobotCost = Resources.builder().with(ORE, 4).build();
    Resources clayRobotCost = Resources.builder().with(ORE, 2).build();
    Resources obsidianRobotCost = Resources.builder().with(ORE, 3).with(CLAY, 14).build();
    Resources geodeRobotCost = Resources.builder().with(ORE, 2).with(OBSIDIAN, 7).build();

    return new Blueprint(1, oreRobotCost, clayRobotCost, obsidianRobotCost, geodeRobotCost);
  }

  private static Blueprint createTestBlueprint2() {
    Resources oreRobotCost = Resources.builder().with(ORE, 2).build();
    Resources clayRobotCost = Resources.builder().with(ORE, 3).build();
    Resources obsidianRobotCost = Resources.builder().with(ORE, 3).with(CLAY, 8).build();
    Resources geodeRobotCost = Resources.builder().with(ORE, 3).with(OBSIDIAN, 12).build();

    return new Blueprint(2, oreRobotCost, clayRobotCost, obsidianRobotCost, geodeRobotCost);
  }
}
