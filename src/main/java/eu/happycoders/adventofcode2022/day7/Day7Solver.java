package eu.happycoders.adventofcode2022.day7;

import java.util.Comparator;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 7.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day7Solver {
  static long findSumOfSizesOfDirectoriesWithMaximumTotalSize(String input, int maxTotalSize) {
    Directory root = new PuzzleInputParser().parse(input);

    List<Directory> directories = root.listWithAllSubDirectories();

    return directories.stream()
        .mapToLong(Directory::totalSize)
        .filter(totalSize -> totalSize <= maxTotalSize)
        .sum();
  }

  static long findSizeOfSmallestDirToDelete(String input, long totalSize, long unusedSpaceNeeded) {
    Directory root = new PuzzleInputParser().parse(input);

    long free = totalSize - root.totalSize();
    long needed = unusedSpaceNeeded - free;

    List<Directory> directories = root.listWithAllSubDirectories();

    Directory smallestDirectoryMatching =
        directories.stream()
            .filter(directory -> directory.totalSize() >= needed)
            .min(Comparator.comparing(Directory::totalSize))
            .orElseThrow();

    return smallestDirectoryMatching.totalSize();
  }
}
