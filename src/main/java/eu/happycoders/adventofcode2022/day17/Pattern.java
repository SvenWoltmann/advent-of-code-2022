package eu.happycoders.adventofcode2022.day17;

import java.util.Arrays;
import java.util.Objects;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A pattern consisting of jet index, rock shape, and the top rows of rock in the chamber.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class Pattern {

  private final int jetIndex;
  private final RockShape currentRockShape;
  private final byte[] topRows;

  Pattern(int jetIndex, RockShape currentRockShape, byte[] topRows) {
    this.jetIndex = jetIndex;
    this.currentRockShape = currentRockShape;
    this.topRows = topRows;
  }

  @Override
  public boolean equals(Object objext) {
    if (objext == this) {
      return true;
    }
    if (objext == null || objext.getClass() != this.getClass()) {
      return false;
    }

    var that = (Pattern) objext;
    return this.jetIndex == that.jetIndex
        && this.currentRockShape == that.currentRockShape
        && Arrays.equals(this.topRows, that.topRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jetIndex, currentRockShape, Arrays.hashCode(topRows));
  }

  @Override
  public String toString() {
    return "PatternKey{"
        + "index="
        + jetIndex
        + ", currentRock="
        + currentRockShape
        + ", topRows="
        + Arrays.toString(topRows)
        + '}';
  }
}
