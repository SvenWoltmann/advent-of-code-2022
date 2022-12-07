package eu.happycoders.adventofcode2022.day7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DirectoryTest {

  @Test
  void givenARootDirectory_toString_returnsTheDirectoryName() {
    Directory root = new Directory("/", null);

    String string = root.toString();

    assertThat(string).isEqualTo("- / (dir)");
  }

  @Test
  void givenADirectoryWithThreeFiles_toString_returnsTheDirectoryNameAndTheFileNamesAndSizes() {
    Directory root = new Directory("/", null);
    root.add(new File("a.asc", 123));
    root.add(new File("b.bak", 456));
    root.add(new File("c.csv", 789));

    String string = root.toString();

    assertThat(string)
        .isEqualToNormalizingNewlines(
            """
        - / (dir)
          - a.asc (file, size=123)
          - b.bak (file, size=456)
          - c.csv (file, size=789)""");
  }

  @Test
  void
      givenADirectoryWithSeveralSubDirectoriesAndFiles_toString_returnsTheNameAndTheContentsRecursively() {
    Directory directory = TestInputs.TEST_DIRECTORY;

    String string = directory.toString();

    assertThat(string)
        .isEqualToNormalizingNewlines(
            """
              - / (dir)
                - a (dir)
                  - e (dir)
                    - i (file, size=584)
                  - f (file, size=29116)
                  - g (file, size=2557)
                  - h.lst (file, size=62596)
                - b.txt (file, size=14848514)
                - c.dat (file, size=8504156)
                - d (dir)
                  - j (file, size=4060174)
                  - d.log (file, size=8033020)
                  - d.ext (file, size=5626152)
                  - k (file, size=7214296)""");
  }
}
