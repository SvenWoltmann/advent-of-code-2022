package eu.happycoders.adventofcode2022.day19;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SimulatorTest {

  @Test
  void givenASimulationForTestBlueprint1And24MinutesTime_runSimulation_returns_9() {
    RobotFactory factory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Simulator simulator = new Simulator(factory, 24);

    int largestNumberOfGeodes = simulator.runSimulation();

    assertThat(largestNumberOfGeodes).isEqualTo(9);
  }

  @Test
  void givenASimulationForTestBlueprint2And24MinutesTime_runSimulation_returns_12() {
    RobotFactory factory = new RobotFactory(TestInputs.TEST_BLUEPRINT_2);
    Simulator simulator = new Simulator(factory, 24);

    int largestNumberOfGeodes = simulator.runSimulation();

    assertThat(largestNumberOfGeodes).isEqualTo(12);
  }

  @Test
  void givenASimulationForTestBlueprint1And32MinutesTime_runSimulation_returns_56() {
    RobotFactory factory = new RobotFactory(TestInputs.TEST_BLUEPRINT_1);
    Simulator simulator = new Simulator(factory, 32);

    int largestNumberOfGeodes = simulator.runSimulation();

    assertThat(largestNumberOfGeodes).isEqualTo(56);
  }

  @Test
  void givenASimulationForTestBlueprint2And32MinutesTime_runSimulation_returns_62() {
    RobotFactory factory = new RobotFactory(TestInputs.TEST_BLUEPRINT_2);
    Simulator simulator = new Simulator(factory, 32);

    int largestNumberOfGeodes = simulator.runSimulation();

    assertThat(largestNumberOfGeodes).isEqualTo(62);
  }
}
