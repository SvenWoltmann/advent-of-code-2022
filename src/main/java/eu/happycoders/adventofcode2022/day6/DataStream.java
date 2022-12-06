package eu.happycoders.adventofcode2022.day6;

import java.util.HashSet;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A data stream.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class DataStream {
  private final String data;

  DataStream(String data) {
    this.data = data;
  }

  int detectMarker(int markerLength) {
    for (int i = markerLength; i < data.length(); i++) {
      if (isDifferentCharactersBefore(i, markerLength)) {
        return i;
      }
    }
    throw new IllegalStateException();
  }

  private boolean isDifferentCharactersBefore(int position, int numberOfDistinctCharacters) {
    Set<Character> usedCharacters = new HashSet<>();
    for (int i = position - numberOfDistinctCharacters; i < position; i++) {
      char character = data.charAt(i);
      if (usedCharacters.contains(character)) {
        return false;
      }
      usedCharacters.add(character);
    }
    return true;
  }
}
