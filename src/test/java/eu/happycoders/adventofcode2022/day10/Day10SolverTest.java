package eu.happycoders.adventofcode2022.day10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Day10SolverTest {

  @Test
  void givenTestInput_getSumOfSelectedSignalStrengths_returns13140() {
    String input = TestInput.TEST_INPUT;

    int sum = Day10Solver.getSumOfSelectedSignalStrengths(input);

    assertThat(sum).isEqualTo(13140);
  }

  @Test
  void givenTestInput_render_returnsImageFromScreen() {
    String input = TestInput.TEST_INPUT;

    String image = Day10Solver.render(input);

    assertThat(image)
        .isEqualTo(
            """
            ##..##..##..##..##..##..##..##..##..##..
            ###...###...###...###...###...###...###.
            ####....####....####....####....####....
            #####.....#####.....#####.....#####.....
            ######......######......######......####
            #######.......#######.......#######.....""");
  }
}
