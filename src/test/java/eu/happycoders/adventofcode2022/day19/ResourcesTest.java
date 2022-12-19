package eu.happycoders.adventofcode2022.day19;

import static eu.happycoders.adventofcode2022.day19.ResourceType.CLAY;
import static eu.happycoders.adventofcode2022.day19.ResourceType.GEODE;
import static eu.happycoders.adventofcode2022.day19.ResourceType.OBSIDIAN;
import static eu.happycoders.adventofcode2022.day19.ResourceType.ORE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ResourcesTest {

  @Test
  void givenSomeResourcesAndSomeCost_subtract_returnsTheCorrectDifference() {
    Resources resources =
        Resources.builder().with(ORE, 5).with(CLAY, 10).with(OBSIDIAN, 15).build();
    Resources cost = Resources.builder().with(ORE, 1).with(CLAY, 15).with(GEODE, 5).build();

    Resources newResources = resources.subtract(cost);

    assertThat(newResources.get(ORE)).isEqualTo(4);
    assertThat(newResources.get(CLAY)).isEqualTo(-5);
    assertThat(newResources.get(OBSIDIAN)).isEqualTo(15);
    assertThat(newResources.get(GEODE)).isEqualTo(-5);
  }

  @Test
  void givenSomeResourcesAndCostThatCanBeCovered_cover_returnsTrue() {
    Resources resources =
        Resources.builder().with(ORE, 5).with(CLAY, 10).with(OBSIDIAN, 15).build();
    Resources cost = Resources.builder().with(ORE, 1).with(CLAY, 5).build();

    boolean covered = resources.cover(cost);

    assertThat(covered).isTrue();
  }

  @Test
  void givenSomeResourcesAndCostThatCanNotBeCovered_cover_returnsFalse() {
    Resources resources =
        Resources.builder().with(ORE, 5).with(CLAY, 10).with(OBSIDIAN, 15).build();
    Resources cost = Resources.builder().with(CLAY, 1).with(GEODE, 5).build();

    boolean covered = resources.cover(cost);

    assertThat(covered).isFalse();
  }
}
