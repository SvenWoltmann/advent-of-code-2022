package eu.happycoders.adventofcode2022.day8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PatchOfTreesTest {

  @Test
  void givenATestPatchOfTrees_getScenicScoreAt2Comma1_returns4() {
    PatchOfTrees patchOfTrees = TestInput.TEST_PATCH_OF_TREES;

    int scenicScore = patchOfTrees.getScenicScoreAt(new Position(2, 1));

    assertThat(scenicScore).isEqualTo(4);
  }

  @Test
  void givenATestPatchOfTrees_getScenicScoreAt2Comma3_returns8() {
    PatchOfTrees patchOfTrees = TestInput.TEST_PATCH_OF_TREES;

    int scenicScore = patchOfTrees.getScenicScoreAt(new Position(2, 3));

    assertThat(scenicScore).isEqualTo(8);
  }

  @Test
  void givenATestPatchOfTrees_getHighestScenicScore_returns8() {
    PatchOfTrees patchOfTrees = TestInput.TEST_PATCH_OF_TREES;

    int scenicScore = patchOfTrees.getHighestScenicScore();

    assertThat(scenicScore).isEqualTo(8);
  }
}
