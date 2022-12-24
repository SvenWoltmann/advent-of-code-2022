package eu.happycoders.adventofcode2022.day24;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input text into the valley map of blizzards.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  static ValleyMap parse(String input) {
    String[] lines = input.split("\\n");
    int height = lines.length - 2;
    int width = lines[0].length() - 2;

    Tile[][] tiles = new Tile[height][width];

    for (int row = 0; row < height; row++) {
      String line = lines[row + 1];

      for (int column = 0; column < width; column++) {
        tiles[row][column] = Tile.of(line.charAt(column + 1));
      }
    }

    return new ValleyMap(tiles);
  }
}
