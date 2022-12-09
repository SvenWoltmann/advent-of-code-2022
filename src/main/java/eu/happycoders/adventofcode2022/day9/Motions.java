package eu.happycoders.adventofcode2022.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A list of {@link Motion}s.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Motions {

  private final List<Motion> list = new ArrayList<>();

  void add(Direction direction, int steps) {
    add(new Motion(direction, steps));
  }

  void add(Motion motion) {
    list.add(motion);
  }

  void addAll(Motions motionsToAdd) {
    for (Motion motion : motionsToAdd.list) {
      this.add(motion);
    }
  }

  List<Motion> toList() {
    return List.copyOf(list);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Motions that = (Motions) object;
    return Objects.equals(list, that.list);
  }

  @Override
  public int hashCode() {
    return list.hashCode();
  }
}
