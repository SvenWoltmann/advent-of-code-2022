package eu.happycoders.adventofcode2022.day21;

import java.util.Map;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Puzzle solver for day 21.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Day21Solver {

  static long solveTask1(String input) {
    Map<String, Job> jobMap = JobsParser.parse(input);
    Jobs jobs = new Jobs(jobMap);
    return jobs.solve();
  }

  static long solveTask2(String input) {
    Map<String, Job> jobMap = JobsParser.parse(input);
    Jobs jobs = new Jobs(jobMap);
    return jobs.findNumberForHumanIfRootOperandsMustBeEqual();
  }
}
