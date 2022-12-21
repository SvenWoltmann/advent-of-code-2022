package eu.happycoders.adventofcode2022.day21;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.jupiter.api.Test;

class JobsParserTest {

  @Test
  void givenTestInput_parse_returnsTheParsedJobs() {
    String input = TestInputs.TEST_INPUT;

    Map<String, Job> jobMap = JobsParser.parse(input);

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("root"), MathOperationJobAddition.class, "pppw", "sjmn");

    assertThatIsNumberJob(jobMap.get("dbpl"), 5);

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("cczh"), MathOperationJobAddition.class, "sllz", "lgvd");

    assertThatIsNumberJob(jobMap.get("zczc"), 2);

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("ptdq"), MathOperationJobSubtraction.class, "humn", "dvpt");

    assertThatIsNumberJob(jobMap.get("dvpt"), 3);
    assertThatIsNumberJob(jobMap.get("lfqf"), 4);
    assertThatIsNumberJob(jobMap.get("humn"), 5);
    assertThatIsNumberJob(jobMap.get("ljgn"), 2);

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("sjmn"), MathOperationJobMultiplication.class, "drzm", "dbpl");

    assertThatIsNumberJob(jobMap.get("sllz"), 4);

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("pppw"), MathOperationJobDivision.class, "cczh", "lfqf");

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("lgvd"), MathOperationJobMultiplication.class, "ljgn", "ptdq");

    assertThatIsMathOperationJobWithOperands(
        jobMap.get("drzm"), MathOperationJobSubtraction.class, "hmdt", "zczc");

    assertThatIsNumberJob(jobMap.get("hmdt"), 32);
  }

  private void assertThatIsMathOperationJobWithOperands(
      Job job,
      Class<? extends MathOperationJob> mathOperationJobClass,
      String operand1Name,
      String operand2Name) {
    assertThat(job).isInstanceOf(mathOperationJobClass);

    assertThat(((MathOperationJob) job).operand1MonkeyName()).isEqualTo(operand1Name);
    assertThat(((MathOperationJob) job).operand1Job().monkeyName()).isEqualTo(operand1Name);

    assertThat(((MathOperationJob) job).operand2MonkeyName()).isEqualTo(operand2Name);
    assertThat(((MathOperationJob) job).operand2Job().monkeyName()).isEqualTo(operand2Name);
  }

  private void assertThatIsNumberJob(Job job, int number) {
    assertThat(job).isInstanceOf(NumberJob.class);
    assertThat(job.result()).isEqualTo(number);
  }
}
