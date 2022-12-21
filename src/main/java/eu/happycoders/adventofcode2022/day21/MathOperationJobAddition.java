package eu.happycoders.adventofcode2022.day21;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Addition job.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class MathOperationJobAddition extends MathOperationJob {

  MathOperationJobAddition(
      String monkeyName, String operand1MonkeyName, String operand2MonkeyName) {
    super(monkeyName, operand1MonkeyName, operand2MonkeyName);
  }

  @Override
  long apply(long operand1, long operand2) {
    return operand1 + operand2;
  }

  @Override
  long applyReverseToFindOperand1(long result, long operand2) {
    return result - operand2;
  }

  @Override
  long applyReverseToFindOperand2(long result, long operand1) {
    return result - operand1;
  }
}
