package eu.happycoders.adventofcode2022.day21;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Abstract base class for a job given to a monkey.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
abstract sealed class Job permits NumberJob, MathOperationJob {
  private final String monkeyName;

  Job(String monkeyName) {
    this.monkeyName = monkeyName;
  }

  String monkeyName() {
    return monkeyName;
  }

  abstract Long result();
}
