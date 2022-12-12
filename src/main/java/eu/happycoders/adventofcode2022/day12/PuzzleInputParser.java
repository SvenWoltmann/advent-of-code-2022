package eu.happycoders.adventofcode2022.day12;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the puzzle input string into a {@link PuzzleInput} object.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  private static final char START_MARK = 'S';
  private static final char END_MARK = 'E';

  static PuzzleInput parse(String input) {
    String[] lines = input.split("\\n");

    Size size = new Size(lines[0].length(), lines.length);
    HeightMap map = new HeightMap(size);
    Position start = null;
    Position end = null;

    for (int y = 0; y < size.height(); y++) {
      String line = lines[y];
      for (int x = 0; x < size.width(); x++) {
        char mark = line.charAt(x);
        if (mark == START_MARK) {
          start = new Position(x, y);
          mark = HeightMap.MIN_HEIGHT;
        } else if (mark == END_MARK) {
          end = new Position(x, y);
          mark = HeightMap.MAX_HEIGHT;
        }
        map.setHeight(new Position(x, y), mark);
      }
    }

    return new PuzzleInput(map, start, end);
  }
}
