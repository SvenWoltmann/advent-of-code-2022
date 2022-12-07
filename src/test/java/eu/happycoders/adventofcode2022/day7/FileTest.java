package eu.happycoders.adventofcode2022.day7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FileTest {

  @Test
  void givenAFile_toString_returnsTheFilesNameAndSize() {
    File file = new File("a.asc", 987654);

    String string = file.toString();

    assertThat(string).isEqualTo("- a.asc (file, size=987654)");
  }
}
