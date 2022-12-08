package eu.happycoders.adventofcode2022.day8;

class TestInput {
  static final String TEST_INPUT =
      """
              30373
              25512
              65332
              33549
              35390""";

  static final PatchOfTrees TEST_PATCH_OF_TREES = createPatchOfTrees();

  private static PatchOfTrees createPatchOfTrees() {
    PatchOfTrees trees = new PatchOfTrees(new Size(5, 5));

    setHeightsInRow(trees, 0, 3, 0, 3, 7, 3);
    setHeightsInRow(trees, 1, 2, 5, 5, 1, 2);
    setHeightsInRow(trees, 2, 6, 5, 3, 3, 2);
    setHeightsInRow(trees, 3, 3, 3, 5, 4, 9);
    setHeightsInRow(trees, 4, 3, 5, 3, 9, 0);

    return trees;
  }

  private static void setHeightsInRow(PatchOfTrees trees, int row, int... heights) {
    for (int column = 0; column < heights.length; column++) {
      trees.setTree(new Position(column, row), new Tree(heights[column]));
    }
  }
}
