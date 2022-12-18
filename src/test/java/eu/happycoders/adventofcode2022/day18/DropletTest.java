package eu.happycoders.adventofcode2022.day18;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class DropletTest {

  @Test
  void givenADropletWithTwoCubes_getSurfaceArea_returns10() {
    Cube cube1 = new Cube(1, 1, 1);
    Cube cube2 = new Cube(2, 1, 1);
    Droplet droplet = new Droplet(List.of(cube1, cube2));

    int surfaceArea = droplet.getSurfaceArea();

    assertThat(surfaceArea).isEqualTo(10);
  }

  @Test
  void givenADropletWithTestCubes_getSurfaceArea_returns64() {
    Droplet droplet = new Droplet(TestInputs.TEST_CUBES);

    int surfaceArea = droplet.getSurfaceArea();

    assertThat(surfaceArea).isEqualTo(64);
  }
}
