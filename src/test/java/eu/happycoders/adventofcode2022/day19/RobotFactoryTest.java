package eu.happycoders.adventofcode2022.day19;

import static eu.happycoders.adventofcode2022.day19.ResourceType.CLAY;
import static eu.happycoders.adventofcode2022.day19.ResourceType.GEODE;
import static eu.happycoders.adventofcode2022.day19.ResourceType.OBSIDIAN;
import static eu.happycoders.adventofcode2022.day19.ResourceType.ORE;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class RobotFactoryTest {

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGivenNoResources_getProducibleRobotTypes_returnsAnEmptyList() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = new Resources();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes).isEmpty();
  }

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGiven1Ore_getProducibleRobotTypes_returnsAnEmptyList() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = Resources.builder().with(ORE, 1).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes).isEmpty();
  }

  @Test
  void givenRobotFactoryWithTestBlueprint_andGiven2Ore_getProducibleRobotTypes_returnsClayRobot() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = Resources.builder().with(ORE, 2).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes)
        .containsExactlyInAnyOrder(
            new RobotTypeWithCost(CLAY, Resources.builder().with(ORE, 2).build()));
  }

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGiven4Ore_getProducibleRobotTypes_returnsClayRobotAndOreRobot() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = Resources.builder().with(ORE, 4).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes)
        .containsExactlyInAnyOrder(
            new RobotTypeWithCost(CLAY, Resources.builder().with(ORE, 2).build()),
            new RobotTypeWithCost(ORE, Resources.builder().with(ORE, 4).build()));
  }

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGiven3OreAnd13Clay_getProducibleRobotTypes_returnsClayRobot() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = Resources.builder().with(ORE, 3).with(CLAY, 13).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes)
        .containsExactlyInAnyOrder(
            new RobotTypeWithCost(CLAY, Resources.builder().with(ORE, 2).build()));
  }

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGiven3OreAnd14Clay_getProducibleRobotTypes_returnsClayRobotAndObisidianRobot() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = Resources.builder().with(ORE, 3).with(CLAY, 14).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes)
        .containsExactlyInAnyOrder(
            new RobotTypeWithCost(CLAY, Resources.builder().with(ORE, 2).build()),
            new RobotTypeWithCost(
                OBSIDIAN, Resources.builder().with(ORE, 3).with(CLAY, 14).build()));
  }

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGiven4OreAnd7Obsidian_getProducibleRobotTypes_returnsClayRobotAndOreRobotAndGeodeRobot() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources = Resources.builder().with(ORE, 4).with(OBSIDIAN, 7).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes)
        .containsExactlyInAnyOrder(
            new RobotTypeWithCost(CLAY, Resources.builder().with(ORE, 2).build()),
            new RobotTypeWithCost(ORE, Resources.builder().with(ORE, 4).build()),
            new RobotTypeWithCost(
                GEODE, Resources.builder().with(ORE, 2).with(OBSIDIAN, 7).build()));
  }

  @Test
  void
      givenRobotFactoryWithTestBlueprint_andGivenLotsOfAllResources_getProducibleRobotTypes_returnsAllRobots() {
    RobotFactory robotFactory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Resources resources =
        Resources.builder().with(ORE, 1000).with(CLAY, 1000).with(OBSIDIAN, 1000).build();

    List<RobotTypeWithCost> producibleRobotTypes =
        robotFactory.getProducibleRobotTypes(resources, null);

    assertThat(producibleRobotTypes)
        .containsExactlyInAnyOrder(
            new RobotTypeWithCost(CLAY, Resources.builder().with(ORE, 2).build()),
            new RobotTypeWithCost(ORE, Resources.builder().with(ORE, 4).build()),
            new RobotTypeWithCost(
                OBSIDIAN, Resources.builder().with(ORE, 3).with(CLAY, 14).build()),
            new RobotTypeWithCost(
                GEODE, Resources.builder().with(ORE, 2).with(OBSIDIAN, 7).build()));
  }
}
