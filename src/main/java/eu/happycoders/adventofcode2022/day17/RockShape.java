package eu.happycoders.adventofcode2022.day17;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A specific shape of rock.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
enum RockShape {
  MINUS((byte) 0b00011110),

  PLUS((byte) 0b00001000, (byte) 0b00011100, (byte) 0b00001000),

  L((byte) 0b00000100, (byte) 0b00000100, (byte) 0b00011100),

  I((byte) 0b00010000, (byte) 0b00010000, (byte) 0b00010000, (byte) 0b00010000),

  SQUARE((byte) 0b00011000, (byte) 0b00011000);

  private final byte[] pattern;
  private final int height;
  private final int initialSpaceLeft;
  private final int initialSpaceRight;

  RockShape(byte... pattern) {
    this.pattern = pattern;
    this.height = pattern.length;

    int spaceLeft = 7;
    int spaceRight = 7;

    for (byte patternRow : pattern) {
      int numberOfLeadingZeros = Integer.numberOfLeadingZeros(patternRow) - (32 - 7);
      int numberOfTrailingZeros = Integer.numberOfTrailingZeros(patternRow);
      spaceLeft = Math.min(spaceLeft, numberOfLeadingZeros);
      spaceRight = Math.min(spaceRight, numberOfTrailingZeros);
    }

    this.initialSpaceLeft = spaceLeft;
    this.initialSpaceRight = spaceRight;
  }

  int initialSpaceLeft() {
    return initialSpaceLeft;
  }

  int initialSpaceRight() {
    return initialSpaceRight;
  }

  byte[] patternAt(int deltaX) {
    if (deltaX == 0) {
      return this.pattern;
    }

    byte[] pushedPattern = new byte[height];

    if (deltaX < 0) {
      for (int i = 0; i < height; i++) {
        pushedPattern[i] = (byte) (pattern[i] << (-deltaX));
      }
    } else {
      for (int i = 0; i < height; i++) {
        pushedPattern[i] = (byte) (pattern[i] >> deltaX);
      }
    }

    return pushedPattern;
  }

  int height() {
    return height;
  }
}
