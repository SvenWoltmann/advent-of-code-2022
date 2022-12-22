package eu.happycoders.adventofcode2022.day22;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The puzzle input consisting of the board map and the instructions to follow the path.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PuzzleInput(BoardMap boardMap, List<Instruction> instructions) {}
