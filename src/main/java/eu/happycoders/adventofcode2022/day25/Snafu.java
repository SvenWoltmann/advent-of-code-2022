package eu.happycoders.adventofcode2022.day25;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Converter from and to SNAFU strings.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Snafu {

  static String toSnafuString(long decimal) {
    StringBuilder result = new StringBuilder();

    do {
      long fives = (decimal + 2) / 5;
      int digit = (int) (decimal - 5 * fives);
      result.insert(0, convertDecimalToSnafuDigit(digit));
      decimal = fives;
    } while (decimal != 0);

    return result.toString();
  }

  private static char convertDecimalToSnafuDigit(int decimalDigit) {
    return switch (decimalDigit) {
      case 2 -> '2';
      case 1 -> '1';
      case 0 -> '0';
      case -1 -> '-';
      case -2 -> '=';
      default -> throw new IllegalArgumentException();
    };
  }

  static long parseSnafuString(String snafuString) {
    long decimal = 0;
    for (int i = 0; i < snafuString.length(); i++) {
      char snafuDigit = snafuString.charAt(i);
      decimal = decimal * 5 + convertSnafuToDecimalDigit(snafuDigit);
    }
    return decimal;
  }

  private static int convertSnafuToDecimalDigit(char snafuDigit) {
    return switch (snafuDigit) {
      case '2' -> 2;
      case '1' -> 1;
      case '0' -> 0;
      case '-' -> -1;
      case '=' -> -2;
      default -> throw new IllegalArgumentException();
    };
  }
}
