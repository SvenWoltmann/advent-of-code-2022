package eu.happycoders.adventofcode2022.day5;

import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle input consisting of an initial list of stacks of crates and a given list of moves.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PuzzleInput(CrateStacks crateStacks, List<Move> moves) {}
