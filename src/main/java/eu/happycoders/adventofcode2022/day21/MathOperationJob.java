package eu.happycoders.adventofcode2022.day21;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Abstract base class for a "yell the result of a math operation" job.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
abstract sealed class MathOperationJob extends Job
    permits MathOperationJobAddition,
        MathOperationJobSubtraction,
        MathOperationJobMultiplication,
        MathOperationJobDivision {

  private final String operand1MonkeyName;
  private final String operand2MonkeyName;

  private Job operand1Job;
  private Job operand2Job;

  private Long cachedResult;

  MathOperationJob(String nodeName, String operand1MonkeyName, String operand2MonkeyName) {
    super(nodeName);
    this.operand1MonkeyName = operand1MonkeyName;
    this.operand2MonkeyName = operand2MonkeyName;
  }

  String operand1MonkeyName() {
    return operand1MonkeyName;
  }

  String operand2MonkeyName() {
    return operand2MonkeyName;
  }

  Job operand1Job() {
    return operand1Job;
  }

  void setOperand1Job(Job operand1Job) {
    this.operand1Job = operand1Job;
  }

  Job operand2Job() {
    return operand2Job;
  }

  void setOperand2Job(Job operand2Job) {
    this.operand2Job = operand2Job;
  }

  abstract long apply(long solution1, long solution2);

  abstract long applyReverseToFindOperand1(long result, long operand2);

  abstract long applyReverseToFindOperand2(long result, long operand1);

  void setCachedResult(Long value) {
    this.cachedResult = value;
  }

  @Override
  Long result() {
    return cachedResult;
  }
}
