package eu.happycoders.adventofcode2022.day18;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A box in which to put the droplet and flood-fill the outside.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Box {

  private final Droplet droplet;
  private final int sizeX;
  private final int sizeY;
  private final int sizeZ;
  private final boolean[][][] grid;

  private int externalSurfaceArea;

  Box(Droplet droplet) {
    this.droplet = droplet;

    int maxX = 0;
    int maxY = 0;
    int maxZ = 0;

    List<Cube> allCubes = droplet.getAllCubes();
    for (Cube cube : allCubes) {
      if (cube.x() < 0 || cube.y() < 0 || cube.z() < 0) {
        throw new IllegalArgumentException(
            "Each cube's x, y, z coordinates must be >= 0; cube = " + cube);
      }
      maxX = Math.max(maxX, cube.x());
      maxY = Math.max(maxY, cube.y());
      maxZ = Math.max(maxZ, cube.z());
    }

    // x, y, z is 0-based, therefore add 1.
    // Add two more, so we have at least one area of free cubes on each side.
    this.sizeX = maxX + 3;
    this.sizeY = maxY + 3;
    this.sizeZ = maxZ + 3;

    this.grid = new boolean[sizeX][sizeY][sizeZ];
  }

  void floodFill() {
    // As the cubes may have 0 as X, Y, Z coordinates, our grid starts at (-1, -1, -1).
    Cube startCube = new Cube(-1, -1, -1);
    fillGridAt(startCube);

    Queue<Cube> queue = new ArrayDeque<>();
    queue.add(startCube);

    // Now we take one from the queue, fill all empty neighbors and add them to the queue.
    // Empty means there's no steam and no lava.
    // And whenever there's lava, we increase the externalSurfaceArea by 1.
    while (!queue.isEmpty()) {
      Cube cube = queue.poll();
      fillIfEmpty(cube.left(), queue);
      fillIfEmpty(cube.right(), queue);
      fillIfEmpty(cube.top(), queue);
      fillIfEmpty(cube.bottom(), queue);
      fillIfEmpty(cube.front(), queue);
      fillIfEmpty(cube.back(), queue);
    }
  }

  private void fillIfEmpty(Cube cube, Queue<Cube> queue) {
    if (!isInGrid(cube) || gridFilledAt(cube)) {
      return;
    }

    if (droplet.contains(cube)) {
      externalSurfaceArea++;
    } else {
      fillGridAt(cube);
      queue.add(cube);
    }
  }

  private boolean isInGrid(Cube cube) {
    return cube.x() + 1 >= 0
        && cube.x() + 1 < sizeX
        && cube.y() + 1 >= 0
        && cube.y() + 1 < sizeY
        && cube.z() + 1 >= 0
        && cube.z() + 1 < sizeZ;
  }

  private boolean gridFilledAt(Cube cube) {
    return grid[cube.x() + 1][cube.y() + 1][cube.z() + 1];
  }

  private void fillGridAt(Cube cube) {
    grid[cube.x() + 1][cube.y() + 1][cube.z() + 1] = true;
  }

  public int getExternalSurfaceArea() {
    return externalSurfaceArea;
  }
}
