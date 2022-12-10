package eu.happycoders.adventofcode2022.day10;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Interface for a single operation of the screen.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
sealed interface Operation permits NoOp, AddX {

  int getCycles();
}
