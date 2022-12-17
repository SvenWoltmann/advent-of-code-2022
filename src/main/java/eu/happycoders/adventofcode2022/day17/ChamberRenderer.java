package eu.happycoders.adventofcode2022.day17;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Renders a chamber (for debug output).
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ChamberRenderer {

  private final ChamberRows chamberRows;
  private final Rock currentRock;
  private final int highestRockRow;

  ChamberRenderer(ChamberRows chamberRows, Rock currentRock, int highestRockRow) {
    this.chamberRows = chamberRows;
    this.currentRock = currentRock;
    this.highestRockRow = highestRockRow;
  }

  String render() {
    StringBuilder result = new StringBuilder();

    int topRowToDraw = calculateHighestRowToDraw();
    for (int row = topRowToDraw; row >= 0; row--) {
      result.append(renderRow(row));
    }
    result.append("+-------+\n");

    return result.toString();
  }

  private String renderRow(int row) {
    byte chamberRowPattern = chamberRows.getRowPatternAt(row);
    byte currentRockRowPattern = getCurrentRockRowPattern(row);

    StringBuilder result = new StringBuilder();
    result.append('|');

    for (int column = 0; column < 7; column++) {
      char symbol = getSymbolAtColumn(chamberRowPattern, currentRockRowPattern, column);
      result.append(symbol);
    }

    result.append("|\n");
    return result.toString();
  }

  private byte getCurrentRockRowPattern(int row) {
    if (currentRock != null) {
      int rockRowIndex = currentRock.topRow() - row;
      if (rockRowIndex >= 0 && rockRowIndex < currentRock.shape().height()) {
        return currentRock.patternAtCurrentPosX()[rockRowIndex];
      }
    }
    return 0;
  }

  private static char getSymbolAtColumn(
      byte chamberRowPattern, byte currentRockRowPatterm, int column) {
    int columnPattern = 1 << (6 - column);
    if ((currentRockRowPatterm & columnPattern) == columnPattern) {
      return '@';
    } else if ((chamberRowPattern & columnPattern) == columnPattern) {
      return '#';
    } else {
      return '.';
    }
  }

  private int calculateHighestRowToDraw() {
    if (currentRock != null && currentRock.topRow() > highestRockRow) {
      return currentRock.topRow();
    } else {
      return highestRockRow;
    }
  }
}
