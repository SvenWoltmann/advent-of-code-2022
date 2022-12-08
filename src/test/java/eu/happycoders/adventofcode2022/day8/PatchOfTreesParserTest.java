package eu.happycoders.adventofcode2022.day8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PatchOfTreesParserTest {

  @Test
  void givenTestInput_parse_returnsTestPatchOfTrees() {
    PatchOfTrees patchOfTrees = PatchOfTreesParser.parse(TestInput.TEST_INPUT);

    assertThat(patchOfTrees).isEqualTo(TestInput.TEST_PATCH_OF_TREES);
  }
}
