package eu.happycoders.adventofcode2022.day9;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A motion consisting of a {@link Direction} and the number of times the rope's head is pulled
 * into that direction.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Motion(Direction direction, int steps) {}
