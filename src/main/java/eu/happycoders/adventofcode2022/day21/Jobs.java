package eu.happycoders.adventofcode2022.day21;

import java.util.List;
import java.util.Map;

class Jobs {

  private static final String ROOT = "root";
  private static final String HUMAN = "humn";

  private final List<Job> allJobs;
  private final Job rootJob;
  private final Job humanJob;

  Jobs(Map<String, Job> monkeyNameToJob) {
    this.allJobs = List.copyOf(monkeyNameToJob.values());
    this.rootJob = monkeyNameToJob.get(ROOT);
    this.humanJob = monkeyNameToJob.get(HUMAN);
  }

  long solve() {
    return solve(rootJob);
  }

  private long solve(Job job) {
    return switch (job) {
      case NumberJob numberJob -> numberJob.result();
      case MathOperationJob mathOperationJob -> solveMathOperationJob(mathOperationJob);
    };
  }

  private long solveMathOperationJob(MathOperationJob mathOperationJob) {
    Long cachedResult = mathOperationJob.result();
    if (cachedResult != null) {
      return cachedResult;
    }

    long operand1 = solve(mathOperationJob.operand1Job());
    long operand2 = solve(mathOperationJob.operand2Job());

    long result = mathOperationJob.apply(operand1, operand2);

    mathOperationJob.setCachedResult(result);

    return result;
  }

  long findNumberForHumanIfRootOperandsMustBeEqual() {
    solve();
    removeCachedResultsFromRootToHuman();
    return applyReverseOperationsFromRootToHuman();
  }

  private void removeCachedResultsFromRootToHuman() {
    while (true) {
      for (Job job : allJobs) {
        if (isOperationWithResultAndOneOperandHavingNoResultOrBeingHuman(job)) {
          ((MathOperationJob) job).setCachedResult(null);
          if (job == rootJob) {
            return;
          }
        }
      }
    }
  }

  private boolean isOperationWithResultAndOneOperandHavingNoResultOrBeingHuman(Job job) {
    return job.result() != null
        && job instanceof MathOperationJob operation
        && (getResultOrNullIfHuman(operation.operand1Job()) == null
            || getResultOrNullIfHuman(operation.operand2Job()) == null);
  }

  private Long getResultOrNullIfHuman(Job job) {
    return job == humanJob ? null : job.result();
  }

  private long applyReverseOperationsFromRootToHuman() {
    return applyReverseOperationsDownToHuman((MathOperationJob) rootJob, 0);
  }

  private long applyReverseOperationsDownToHuman(MathOperationJob job, long lastValue) {
    Long operand1 = getResultOrNullIfHuman(job.operand1Job());
    Long operand2 = getResultOrNullIfHuman(job.operand2Job());

    // Either go down the left path...
    if (operand1 == null && operand2 != null) {
      return applyReverseOperationsDownToHumanViaOperand1(job, lastValue, operand2);
    }

    // ... or the right path
    if (operand1 != null && operand2 == null) {
      return applyReverseOperationsDownToHumanViaOperand2(job, lastValue, operand1);
    }

    throw new IllegalStateException();
  }

  private long applyReverseOperationsDownToHumanViaOperand1(
      MathOperationJob job, long lastValue, Long operand2) {
    Long operand1;
    if (job == rootJob) {
      operand1 = operand2;
    } else {
      operand1 = job.applyReverseToFindOperand1(lastValue, operand2);
    }

    if (job.operand1Job() == humanJob) {
      return operand1;
    }

    return applyReverseOperationsDownToHuman((MathOperationJob) job.operand1Job(), operand1);
  }

  private long applyReverseOperationsDownToHumanViaOperand2(
      MathOperationJob job, long lastValue, Long operand1) {
    Long operand2;
    if (job == rootJob) {
      operand2 = operand1;
    } else {
      operand2 = job.applyReverseToFindOperand2(lastValue, operand1);
    }

    if (job.operand2Job() == humanJob) {
      return operand2;
    }

    return applyReverseOperationsDownToHuman((MathOperationJob) job.operand2Job(), operand2);
  }
}
