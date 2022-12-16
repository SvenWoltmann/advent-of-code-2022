package eu.happycoders.adventofcode2022.day16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The puzzle input consisting of a list of parsed lines.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record PuzzleInput(List<ParsedLine> parsedLines) {

  public static final int MAX_OPEN_VALVES = 31;

  @Override
  public String toString() {
    return parsedLines.stream().map(ParsedLine::toString).collect(Collectors.joining("\n"));
  }

  Valves toValves() {
    int openableValveCounter = 0;
    Map<String, Valve> map = new HashMap<>();
    for (int i = 0; i < parsedLines.size(); i++) {
      ParsedLine parsedLine = parsedLines.get(i);
      int bitmaskForOpenValve = 0;
      if (parsedLine.flowRate() > 0) {
        if (openableValveCounter == MAX_OPEN_VALVES) {
          throw new IllegalStateException("Too many openable valves");
        }
        bitmaskForOpenValve = 1 << openableValveCounter;
        openableValveCounter++;
      }

      Valve valve =
          new Valve(i, parsedLine.valveName(), parsedLine.flowRate(), bitmaskForOpenValve);
      map.put(valve.name(), valve);
    }

    for (ParsedLine parsedLine : parsedLines) {
      Valve valve = map.get(parsedLine.valveName());
      for (String s : parsedLine.leadingTo()) {
        valve.addLeadingTo(map.get(s));
      }
    }

    return new Valves(List.copyOf(map.values()), map.get("AA"));
  }
}
