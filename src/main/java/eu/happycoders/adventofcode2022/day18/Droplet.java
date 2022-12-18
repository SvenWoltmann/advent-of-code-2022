package eu.happycoders.adventofcode2022.day18;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A lava droplet consisting of cubes.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Droplet {

  private final Set<Cube> cubes;

  Droplet(List<Cube> cubes) {
    this.cubes = new HashSet<>(cubes);
  }

  List<Cube> getAllCubes() {
    return List.copyOf(cubes);
  }

  boolean contains(Cube cube) {
    return cubes.contains(cube);
  }

  int getSurfaceArea() {
    int result = 0;
    for (Cube coordinate : cubes) {
      result += countNonConnectedSides(coordinate);
    }
    return result;
  }

  private int countNonConnectedSides(Cube coordinate) {
    int connected = 0;
    if (cubes.contains(coordinate.left())) {
      connected++;
    }
    if (cubes.contains(coordinate.right())) {
      connected++;
    }
    if (cubes.contains(coordinate.front())) {
      connected++;
    }
    if (cubes.contains(coordinate.back())) {
      connected++;
    }
    if (cubes.contains(coordinate.top())) {
      connected++;
    }
    if (cubes.contains(coordinate.bottom())) {
      connected++;
    }
    return 6 - connected;
  }
}
