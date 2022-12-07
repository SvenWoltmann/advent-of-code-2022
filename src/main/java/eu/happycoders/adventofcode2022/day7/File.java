package eu.happycoders.adventofcode2022.day7;

import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A file contained in a directory.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class File implements DirectoryEntry {
  private final String name;
  private final long size;

  File(String name, long size) {
    this.name = name;
    this.size = size;
  }

  long getSize() {
    return size;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }

    if (object == null || object.getClass() != this.getClass()) {
      return false;
    }

    var that = (File) object;
    return Objects.equals(this.name, that.name) && this.size == that.size;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size);
  }

  @Override
  public String toString() {
    return "- %s (file, size=%d)".formatted(name, size);
  }
}
