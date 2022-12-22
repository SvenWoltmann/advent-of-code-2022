package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Interface for instructions.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
sealed interface Instruction permits GoForward, TurnClockwise, TurnCounterClockwise {}
