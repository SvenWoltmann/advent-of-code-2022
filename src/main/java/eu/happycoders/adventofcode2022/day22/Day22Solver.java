package eu.happycoders.adventofcode2022.day22;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 22.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day22Solver {

  static int solveTask1(String input) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);
    InstructionExecutor instructionExecutor = new InstructionExecutor(puzzleInput.boardMap(), null);
    instructionExecutor.execute(puzzleInput.instructions());
    return instructionExecutor.calculateFinalPassword();
  }

  static int solveTask2(String input, CubeLogic cubeLogic) {
    PuzzleInput puzzleInput = PuzzleInputParser.parse(input);
    InstructionExecutor instructionExecutor =
        new InstructionExecutor(puzzleInput.boardMap(), cubeLogic);
    instructionExecutor.execute(puzzleInput.instructions());
    return instructionExecutor.calculateFinalPassword();
  }
}
