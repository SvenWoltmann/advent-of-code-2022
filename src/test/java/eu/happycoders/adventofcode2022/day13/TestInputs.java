package eu.happycoders.adventofcode2022.day13;

class TestInputs {

  static final String TEST_INPUT =
      """
            [1,1,3,1,1]
            [1,1,5,1,1]

            [[1],[2,3,4]]
            [[1],4]

            [9]
            [[8,7,6]]

            [[4,4],4,4]
            [[4,4],4,4,4]

            [7,7,7,7]
            [7,7,7]

            []
            [3]

            [[[]]]
            [[]]

            [1,[2,[3,[4,[5,6,7]]]],8,9]
            [1,[2,[3,[4,[5,6,0]]]],8,9]""";

  static final Puzzle TEST_PUZZLE = createTestPuzzle();

  private static Puzzle createTestPuzzle() {
    Puzzle puzzle = new Puzzle();

    puzzle.add(createPair1());
    puzzle.add(createPair2());
    puzzle.add(createPair3());
    puzzle.add(createPair4());
    puzzle.add(createPair5());
    puzzle.add(createPair6());
    puzzle.add(createPair7());
    puzzle.add(createPair8());

    return puzzle;
  }

  private static PacketListPair createPair1() {
    PacketList list1 = new PacketList(1, 1, 3, 1, 1);
    PacketList list2 = new PacketList(1, 1, 5, 1, 1);

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair2() {
    PacketList list1 = new PacketList(new PacketList(1), new PacketList(2, 3, 4));
    PacketList list2 = new PacketList(new PacketList(1), 4);

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair3() {
    PacketList list1 = new PacketList(9);
    PacketList list2 = new PacketList(new PacketList(8, 7, 6));

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair4() {
    PacketList list1 = new PacketList(new PacketList(4, 4), 4, 4);
    PacketList list2 = new PacketList(new PacketList(4, 4), 4, 4, 4);

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair5() {
    PacketList list1 = new PacketList(7, 7, 7, 7);
    PacketList list2 = new PacketList(7, 7, 7);

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair6() {
    PacketList list1 = new PacketList();
    PacketList list2 = new PacketList(3);

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair7() {
    PacketList list1 = new PacketList(new PacketList(new PacketList()));
    PacketList list2 = new PacketList(new PacketList());

    return new PacketListPair(list1, list2);
  }

  private static PacketListPair createPair8() {
    PacketList list1 =
        new PacketList(
            1,
            new PacketList(2, new PacketList(3, new PacketList(4, new PacketList(5, 6, 7)))),
            8,
            9);

    PacketList list2 =
        new PacketList(
            1,
            new PacketList(2, new PacketList(3, new PacketList(4, new PacketList(5, 6, 0)))),
            8,
            9);

    return new PacketListPair(list1, list2);
  }
}
