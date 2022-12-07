package eu.happycoders.adventofcode2022.day7;

class TestInputs {

  static final String TEST_INPUT =
      """
              $ cd /
              $ ls
              dir a
              14848514 b.txt
              8504156 c.dat
              dir d
              $ cd a
              $ ls
              dir e
              29116 f
              2557 g
              62596 h.lst
              $ cd e
              $ ls
              584 i
              $ cd ..
              $ cd ..
              $ cd d
              $ ls
              4060174 j
              8033020 d.log
              5626152 d.ext
              7214296 k""";

  static final Directory TEST_DIRECTORY = createTestDirectory();

  private static Directory createTestDirectory() {
    Directory root = new Directory("/", null);

    Directory aDir = new Directory("a", root);

    Directory eDir = new Directory("e", aDir);
    eDir.add(new File("i", 584));

    aDir.add(eDir);
    aDir.add(new File("f", 29116));
    aDir.add(new File("g", 2557));
    aDir.add(new File("h.lst", 62596));

    root.add(aDir);
    root.add(new File("b.txt", 14848514));
    root.add(new File("c.dat", 8504156));

    Directory dDir = new Directory("d", root);
    dDir.add(new File("j", 4060174));
    dDir.add(new File("d.log", 8033020));
    dDir.add(new File("d.ext", 5626152));
    dDir.add(new File("k", 7214296));

    root.add(dDir);
    return root;
  }
}
