package eu.happycoders.adventofcode2022.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A directory, containing zero or more other directory entries.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Directory implements DirectoryEntry {

  private final String name;
  private final Directory parent;
  private final List<DirectoryEntry> entries;

  Directory(String name, Directory parent) {
    this.name = name;
    this.parent = parent;
    this.entries = new ArrayList<>();
  }

  void add(DirectoryEntry entry) {
    if (entry instanceof Directory dir && !dir.getParent().equals(this)) {
      throw new IllegalArgumentException("Directory doesn't have this directory as parent");
    }
    entries.add(entry);
  }

  Directory getParent() {
    return parent;
  }

  Directory findDirectory(String name) {
    for (DirectoryEntry entry : entries) {
      if (entry instanceof Directory dir && dir.getName().equals(name)) {
        return dir;
      }
    }
    return null;
  }

  List<Directory> listWithAllSubDirectories() {
    List<Directory> result = new ArrayList<>();
    addDirsRecursively(this, result);
    return result;
  }

  private static void addDirsRecursively(Directory root, List<Directory> result) {
    result.add(root);
    List<Directory> subDirectories = root.getSubDirectories();
    for (Directory subDirectory : subDirectories) {
      addDirsRecursively(subDirectory, result);
    }
  }

  List<Directory> getSubDirectories() {
    return entries.stream().filter(Directory.class::isInstance).map(Directory.class::cast).toList();
  }

  long totalSize() {
    long totalSize = 0;
    for (DirectoryEntry entry : entries) {
      if (entry instanceof Directory dir) {
        totalSize += dir.totalSize();
      } else if (entry instanceof File file) {
        totalSize += file.getSize();
      }
    }
    return totalSize;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Directory that = (Directory) object;
    return Objects.equals(name, that.name) && Objects.equals(entries, that.entries);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + entries.hashCode();
    return result;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    result.append("- %s (dir)%n".formatted(name));

    for (DirectoryEntry entry : entries) {
      result.append(entry.toString().indent(2)); // "indent" adds a line break at the end
    }

    // Remove trailing new line
    return result.toString().stripTrailing();
  }
}
