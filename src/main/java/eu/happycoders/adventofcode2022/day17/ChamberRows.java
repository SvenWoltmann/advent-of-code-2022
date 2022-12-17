package eu.happycoders.adventofcode2022.day17;

import java.util.Arrays;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The contents of the chamber in the form of rows. A row is represented as a byte with the bits
 * set indicating the positions of rocks in a row.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ChamberRows {

  private static final int CHAMBER_HEIGHT = 1 << 13;

  private final byte[] rows = new byte[CHAMBER_HEIGHT]; // index 0 is bottom

  void checkIfEnoughRows(int requiredHeight) {
    if (requiredHeight >= rows.length) {
      throw new IllegalStateException(
          "Cave not high enough (height = %d; required height = %d)"
              .formatted(rows.length, requiredHeight));
    }
  }

  boolean wouldFitAtItsCurrentPosition(Rock rock) {
    byte[] rockPattern = rock.patternAtCurrentPosX();

    for (int i = 0; i < rockPattern.length; i++) {
      int rowIndex = rock.topRow() - i;

      // Would rock at target position overlap with other rocks in chamber?
      if ((rows[rowIndex] & rockPattern[i]) != 0) {
        return false;
      }
    }

    // No overlap found -> rock would fit
    return true;
  }

  void manifest(Rock rock) {
    byte[] rockPattern = rock.patternAtCurrentPosX();
    for (int i = 0; i < rockPattern.length; i++) {
      int rowIndex = rock.topRow() - i;
      rows[rowIndex] |= rockPattern[i];
    }
  }

  byte[] getCopyOfRows(int from, int to) {
    return Arrays.copyOfRange(rows, from, to);
  }

  byte getRowPatternAt(int row) {
    return rows[row];
  }
}
