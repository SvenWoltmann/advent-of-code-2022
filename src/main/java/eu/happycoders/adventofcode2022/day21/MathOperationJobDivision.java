package eu.happycoders.adventofcode2022.day21;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Division job.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class MathOperationJobDivision extends MathOperationJob {

  MathOperationJobDivision(
      String monkeyName, String operand1MonkeyName, String operand2MonkeyName) {
    super(monkeyName, operand1MonkeyName, operand2MonkeyName);
  }

  @Override
  long apply(long operand1, long operand2) {
    return operand1 / operand2;
  }

  @Override
  long applyReverseToFindOperand1(long result, long operand2) {
    return operand2 * result;
  }

  @Override
  long applyReverseToFindOperand2(long result, long operand1) {
    return operand1 / result;
  }
}
