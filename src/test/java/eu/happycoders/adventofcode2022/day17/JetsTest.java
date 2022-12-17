package eu.happycoders.adventofcode2022.day17;

import static eu.happycoders.adventofcode2022.day17.TestInputs.TEST_INPUT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JetsTest {

  @Test
  void givenJetsWithTestInput_next_returnsTheDirectionOfTheNextJet() {
    Jets jets = new Jets(TEST_INPUT);

    for (int i = 0; i < 5; i++) {
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.LEFT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
      assertThat(jets.next()).isEqualTo(Direction.RIGHT);
    }
  }
}
