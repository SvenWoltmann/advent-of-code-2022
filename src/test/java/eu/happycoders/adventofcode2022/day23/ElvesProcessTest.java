package eu.happycoders.adventofcode2022.day23;

import static eu.happycoders.adventofcode2022.day23.Direction.NORTH;
import static eu.happycoders.adventofcode2022.day23.Direction.SOUTH;
import static eu.happycoders.adventofcode2022.day23.TestInputs.ELVES_POSITIONS_SMALL_EXAMPLE;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ElvesProcessTest {

  @Test
  void
      givenTheSmallExample_playFirstHalf_firstTwoAndLastTwoElvesProposeToMoveNorth_and_middleElveProposesToMoveSouth() {
    ElvesProcess elvesProcess = new ElvesProcess(ELVES_POSITIONS_SMALL_EXAMPLE);

    elvesProcess.playFirstHalf();

    List<Elf> elves = elvesProcess.getElves();

    assertThat(elves.get(0).proposedStep()).isEqualTo(NORTH);
    assertThat(elves.get(1).proposedStep()).isEqualTo(NORTH);
    assertThat(elves.get(2).proposedStep()).isEqualTo(SOUTH);
    assertThat(elves.get(3).proposedStep()).isEqualTo(NORTH);
    assertThat(elves.get(4).proposedStep()).isEqualTo(NORTH);
  }

  @Test
  void givenTheSmallExample_playOneRound_firstTwoAndLastElveMoves() {
    ElvesProcess elvesProcess = new ElvesProcess(ELVES_POSITIONS_SMALL_EXAMPLE);

    boolean anyoneMoved = elvesProcess.playOneRound();

    assertThat(anyoneMoved).isTrue();

    List<Elf> elves = elvesProcess.getElves();

    assertThat(elves.get(0).position()).isEqualTo(new Position(2, 0));
    assertThat(elves.get(1).position()).isEqualTo(new Position(3, 0));
    assertThat(elves.get(2).position()).isEqualTo(new Position(2, 2));
    assertThat(elves.get(3).position()).isEqualTo(new Position(2, 4));
    assertThat(elves.get(4).position()).isEqualTo(new Position(3, 3));
  }

  @Test
  void givenTheSmallExample_playSecondRound_allElvesMove() {
    ElvesProcess elvesProcess = new ElvesProcess(ELVES_POSITIONS_SMALL_EXAMPLE);

    elvesProcess.playOneRound();
    boolean anyoneMoved = elvesProcess.playOneRound();

    assertThat(anyoneMoved).isTrue();

    List<Elf> elves = elvesProcess.getElves();

    assertThat(elves.get(0).position()).isEqualTo(new Position(2, 1));
    assertThat(elves.get(1).position()).isEqualTo(new Position(3, 1));
    assertThat(elves.get(2).position()).isEqualTo(new Position(1, 2));
    assertThat(elves.get(3).position()).isEqualTo(new Position(2, 5));
    assertThat(elves.get(4).position()).isEqualTo(new Position(4, 3));
  }

  @Test
  void givenTheSmallExample_playThirdRound_threeElvesMove() {
    ElvesProcess elvesProcess = new ElvesProcess(ELVES_POSITIONS_SMALL_EXAMPLE);

    elvesProcess.playOneRound();
    elvesProcess.playOneRound();
    boolean anyoneMoved = elvesProcess.playOneRound();

    assertThat(anyoneMoved).isTrue();

    List<Elf> elves = elvesProcess.getElves();

    assertThat(elves.get(0).position()).isEqualTo(new Position(2, 0));
    assertThat(elves.get(1).position()).isEqualTo(new Position(4, 1));
    assertThat(elves.get(2).position()).isEqualTo(new Position(0, 2));
    assertThat(elves.get(3).position()).isEqualTo(new Position(2, 5));
    assertThat(elves.get(4).position()).isEqualTo(new Position(4, 3));
  }

  @Test
  void givenTheSmallExample_playForthRound_returnsFalseAndNoElvesHaveMoved() {
    ElvesProcess elvesProcess = new ElvesProcess(ELVES_POSITIONS_SMALL_EXAMPLE);

    elvesProcess.playOneRound();
    elvesProcess.playOneRound();
    elvesProcess.playOneRound();
    boolean anyoneMoved = elvesProcess.playOneRound();

    assertThat(anyoneMoved).isFalse();

    List<Elf> elves = elvesProcess.getElves();

    assertThat(elves.get(0).position()).isEqualTo(new Position(2, 0));
    assertThat(elves.get(1).position()).isEqualTo(new Position(4, 1));
    assertThat(elves.get(2).position()).isEqualTo(new Position(0, 2));
    assertThat(elves.get(3).position()).isEqualTo(new Position(2, 5));
    assertThat(elves.get(4).position()).isEqualTo(new Position(4, 3));
  }
}
