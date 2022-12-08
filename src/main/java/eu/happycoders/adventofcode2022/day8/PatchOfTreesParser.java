package eu.happycoders.adventofcode2022.day8;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input into a {@link PatchOfTrees}.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PatchOfTreesParser {

  static PatchOfTrees parse(String input) {
    String[] lines = input.split("\n");

    int rows = lines.length;
    int columns = lines[0].length();

    PatchOfTrees patchOfTrees = new PatchOfTrees(new Size(columns, rows));

    for (int row = 0; row < rows; row++) {
      String rowString = lines[row];

      if (rowString.length() != columns) {
        throw new IllegalArgumentException();
      }

      for (int column = 0; column < columns; column++) {
        int treeHeight = Integer.parseInt(rowString.substring(column, column + 1));
        patchOfTrees.setTree(new Position(column, row), new Tree(treeHeight));
      }
    }

    return patchOfTrees;
  }
}
