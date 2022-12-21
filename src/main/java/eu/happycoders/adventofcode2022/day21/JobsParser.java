package eu.happycoders.adventofcode2022.day21;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class JobsParser {

  private static final Pattern PATTERN_NUMBER_JOB = Pattern.compile("([a-z]{4}): (\\d+)");
  private static final Pattern PATTERN_MATH_OPERATION_JOB =
      Pattern.compile("([a-z]{4}): ([a-z]{4}) ([+-/*]) ([a-z]{4})");

  static Map<String, Job> parse(String input) {
    Map<String, Job> monkeyNameToJob =
        input
            .lines()
            .map(JobsParser::parseJob)
            .collect(Collectors.toMap(Job::monkeyName, job -> job));

    for (Job value : monkeyNameToJob.values()) {
      if (value instanceof MathOperationJob op) {
        op.setOperand1Job(monkeyNameToJob.get(op.operand1MonkeyName()));
        op.setOperand2Job(monkeyNameToJob.get(op.operand2MonkeyName()));
      }
    }

    return monkeyNameToJob;
  }

  private static Job parseJob(String input) {
    Matcher matcher = PATTERN_NUMBER_JOB.matcher(input);
    if (matcher.matches()) {
      String monkeyName = matcher.group(1);
      int value = Integer.parseInt(matcher.group(2));
      return new NumberJob(monkeyName, value);
    }

    matcher = PATTERN_MATH_OPERATION_JOB.matcher(input);
    if (matcher.matches()) {
      String monkeyName = matcher.group(1);
      String operand1MonkeyName = matcher.group(2);
      String operationSymbol = matcher.group(3);
      String operand2MonkeyName = matcher.group(4);

      return switch (operationSymbol) {
        case "+" -> new MathOperationJobAddition(
            monkeyName, operand1MonkeyName, operand2MonkeyName);

        case "-" -> new MathOperationJobSubtraction(
            monkeyName, operand1MonkeyName, operand2MonkeyName);

        case "*" -> new MathOperationJobMultiplication(
            monkeyName, operand1MonkeyName, operand2MonkeyName);

        case "/" -> new MathOperationJobDivision(
            monkeyName, operand1MonkeyName, operand2MonkeyName);

        default -> throw new IllegalStateException("Unknown symbol: " + operationSymbol);
      };
    }

    throw new IllegalStateException("Don't know how to parse: " + input);
  }
}
