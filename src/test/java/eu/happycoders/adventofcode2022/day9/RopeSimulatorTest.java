package eu.happycoders.adventofcode2022.day9;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RopeSimulatorTest {

  @Test
  void givenASimulatorForRopeLength2_andGivenTestMotions_getNumberOfTailPositions_returns13() {
    RopeSimulator simulator = new RopeSimulator(2);
    simulator.move(TestInput.TEST_MOTIONS);

    int numberOfTailPositions = simulator.getNumberOfTailPositions();

    assertThat(numberOfTailPositions).isEqualTo(13);
  }

  @Test
  void givenASimulatorForRopeLength10_andGivenTestMotions_getNumberOfTailPositions_returns1() {
    RopeSimulator simulator = new RopeSimulator(10);
    simulator.move(TestInput.TEST_MOTIONS);

    int numberOfTailPositions = simulator.getNumberOfTailPositions();

    assertThat(numberOfTailPositions).isEqualTo(1);
  }

  @Test
  void
      givenASimulatorForRopeLength10_andGivenLargerSetOfTestMotions_getNumberOfTailPositions_returns36() {
    RopeSimulator simulator = new RopeSimulator(10);
    simulator.move(MotionsParser.parse(TestInput.LARGER_TEST_INPUT));

    int numberOfTailPositions = simulator.getNumberOfTailPositions();

    assertThat(numberOfTailPositions).isEqualTo(36);
  }
}
