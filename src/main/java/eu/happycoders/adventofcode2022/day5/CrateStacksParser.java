package eu.happycoders.adventofcode2022.day5;

import static eu.happycoders.adventofcode2022.day5.CrateParser.parseCrate;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input into a {@link CrateStacks}.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class CrateStacksParser {

  static CrateStacks parse(String input) {
    String[] lines = input.split("\\n");

    int numberOfCrates = getNumberOfCrates(lines);
    CrateStacks result = new CrateStacks(numberOfCrates);

    for (int i = lines.length - 2; i >= 0; i--) {
      Crate[] crates = parseLine(lines[i]);

      for (int crateIndex = 0; crateIndex < crates.length; crateIndex++) {
        Crate crate = crates[crateIndex];
        if (crate != null) {
          result.stackAt(crateIndex + 1).push(crate);
        }
      }
    }

    return result;
  }

  private static int getNumberOfCrates(String[] lines) {
    String lastLine = lines[lines.length - 1].stripTrailing();
    if (!lastLine.startsWith(" 1")) {
      throw new IllegalArgumentException();
    }

    return (lastLine.stripTrailing().length() + 3) / 4;
  }

  static Crate[] parseLine(String line) {
    line = line.stripTrailing();
    int numCrates = (line.length() + 1) / 4;
    Crate[] crates = new Crate[numCrates];
    for (int i = 0; i < numCrates; i++) {
      int crateStartPosInString = i * 4;
      String crateString = line.substring(crateStartPosInString, crateStartPosInString + 3);
      crates[i] = parseCrate(crateString);
    }
    return crates;
  }
}
