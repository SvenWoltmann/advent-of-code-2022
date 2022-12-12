package eu.happycoders.adventofcode2022.day12;

class TestInputs {
  static final String INPUT =
      """
            Sabqponm
            abcryxxl
            accszExk
            acctuvwj
            abdefghi""";

  static final HeightMap HEIGHT_MAP = createTestHeightMap();

  private static HeightMap createTestHeightMap() {
    HeightMap result = new HeightMap(new Size(8, 5));

    result.setHeight(new Position(0, 0), 'a');
    result.setHeight(new Position(1, 0), 'a');
    result.setHeight(new Position(2, 0), 'b');
    result.setHeight(new Position(3, 0), 'q');
    result.setHeight(new Position(4, 0), 'p');
    result.setHeight(new Position(5, 0), 'o');
    result.setHeight(new Position(6, 0), 'n');
    result.setHeight(new Position(7, 0), 'm');

    result.setHeight(new Position(0, 1), 'a');
    result.setHeight(new Position(1, 1), 'b');
    result.setHeight(new Position(2, 1), 'c');
    result.setHeight(new Position(3, 1), 'r');
    result.setHeight(new Position(4, 1), 'y');
    result.setHeight(new Position(5, 1), 'x');
    result.setHeight(new Position(6, 1), 'x');
    result.setHeight(new Position(7, 1), 'l');

    result.setHeight(new Position(0, 2), 'a');
    result.setHeight(new Position(1, 2), 'c');
    result.setHeight(new Position(2, 2), 'c');
    result.setHeight(new Position(3, 2), 's');
    result.setHeight(new Position(4, 2), 'z');
    result.setHeight(new Position(5, 2), 'z');
    result.setHeight(new Position(6, 2), 'x');
    result.setHeight(new Position(7, 2), 'k');

    result.setHeight(new Position(0, 3), 'a');
    result.setHeight(new Position(1, 3), 'c');
    result.setHeight(new Position(2, 3), 'c');
    result.setHeight(new Position(3, 3), 't');
    result.setHeight(new Position(4, 3), 'u');
    result.setHeight(new Position(5, 3), 'v');
    result.setHeight(new Position(6, 3), 'w');
    result.setHeight(new Position(7, 3), 'j');

    result.setHeight(new Position(0, 4), 'a');
    result.setHeight(new Position(1, 4), 'b');
    result.setHeight(new Position(2, 4), 'd');
    result.setHeight(new Position(3, 4), 'e');
    result.setHeight(new Position(4, 4), 'f');
    result.setHeight(new Position(5, 4), 'g');
    result.setHeight(new Position(6, 4), 'h');
    result.setHeight(new Position(7, 4), 'i');

    return result;
  }

  static final Position START = new Position(0, 0);
  static final Position END = new Position(5, 2);
}
