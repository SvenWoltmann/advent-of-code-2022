package eu.happycoders.adventofcode2022.day21;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A "yell a specific number" job.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
final class NumberJob extends Job {

  private final long number;

  NumberJob(String monkeyName, long number) {
    super(monkeyName);
    this.number = number;
  }

  @Override
  Long result() {
    return number;
  }
}
