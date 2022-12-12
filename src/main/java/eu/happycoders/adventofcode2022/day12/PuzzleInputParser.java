package eu.happycoders.adventofcode2022.day12;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the puzzle input string into a {@link PuzzleInput} object.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {
  static PuzzleInput parse(String input) {
    String[] lines = input.split("\\n");

    Size size = new Size(lines[0].length(), lines.length);
    HeightMap map = new HeightMap(size);
    Position start = null;
    Position end = null;

    for (int y = 0; y < size.height(); y++) {
      String line = lines[y];
      for (int x = 0; x < size.width(); x++) {
        char c = line.charAt(x);
        if (c == 'S') {
          start = new Position(x, y);
          c = 'a';
        } else if (c == 'E') {
          end = new Position(x, y);
          c = 'z';
        }
        map.setHeight(new Position(x, y), c);
      }
    }

    return new PuzzleInput(map, start, end);
  }
}
