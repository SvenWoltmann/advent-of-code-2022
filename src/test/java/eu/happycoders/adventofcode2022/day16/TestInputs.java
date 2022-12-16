package eu.happycoders.adventofcode2022.day16;

import java.util.ArrayList;
import java.util.List;

class TestInputs {

  static final String TEST_INPUT =
      """
          Valve AA has flow rate=0; tunnels lead to valves DD, II, BB
          Valve BB has flow rate=13; tunnels lead to valves CC, AA
          Valve CC has flow rate=2; tunnels lead to valves DD, BB
          Valve DD has flow rate=20; tunnels lead to valves CC, AA, EE
          Valve EE has flow rate=3; tunnels lead to valves FF, DD
          Valve FF has flow rate=0; tunnels lead to valves EE, GG
          Valve GG has flow rate=0; tunnels lead to valves FF, HH
          Valve HH has flow rate=22; tunnel leads to valve GG
          Valve II has flow rate=0; tunnels lead to valves AA, JJ
          Valve JJ has flow rate=21; tunnel leads to valve II""";

  static final PuzzleInput TEST_PUZZLE_INPUT = createTestPuzzleInput();

  private static PuzzleInput createTestPuzzleInput() {
    List<ParsedLine> parsedLines = new ArrayList<>();

    parsedLines.add(new ParsedLine("AA", 0, List.of("DD", "II", "BB")));
    parsedLines.add(new ParsedLine("BB", 13, List.of("CC", "AA")));
    parsedLines.add(new ParsedLine("CC", 2, List.of("DD", "BB")));
    parsedLines.add(new ParsedLine("DD", 20, List.of("CC", "AA", "EE")));
    parsedLines.add(new ParsedLine("EE", 3, List.of("FF", "DD")));
    parsedLines.add(new ParsedLine("FF", 0, List.of("EE", "GG")));
    parsedLines.add(new ParsedLine("GG", 0, List.of("FF", "HH")));
    parsedLines.add(new ParsedLine("HH", 22, List.of("GG")));
    parsedLines.add(new ParsedLine("II", 0, List.of("AA", "JJ")));
    parsedLines.add(new ParsedLine("JJ", 21, List.of("II")));

    return new PuzzleInput(parsedLines);
  }
}
