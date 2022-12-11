package eu.happycoders.adventofcode2022.day11;

import static java.lang.Integer.parseInt;

import java.util.Arrays;
import java.util.List;
import java.util.function.LongUnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parses the input into a list of {@link Monkey}s.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
public class MonkeysParser {

  private static final Pattern MONKEY_PATTERN =
      Pattern.compile(
          "Monkey (\\d+):\\s+"
              + "Starting items: (.+)\\s+"
              + "Operation: new = (.+)\\s+"
              + "Test: divisible by (\\d+)\\s+"
              + "If true: throw to monkey (.+)\\s+"
              + "If false: throw to monkey (.+)");

  static List<Monkey> parse(String input) {
    String[] monkeyStrings = input.split("\\n\\n");
    return Arrays.stream(monkeyStrings).map(MonkeysParser::parseMonkey).toList();
  }

  private static Monkey parseMonkey(String input) {
    Matcher matcher = MONKEY_PATTERN.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Can't parse:\n" + input);
    }

    int monkeyId = parseInt(matcher.group(1));
    List<Item> startingItems = parseItemList(matcher.group(2));
    LongUnaryOperator operation = parseOperation(matcher.group(3));
    int testDivisor = parseInt(matcher.group(4));
    int targetMonkeyIdTrue = parseInt(matcher.group(5));
    int targetMonkeyIdFalse = parseInt(matcher.group(6));

    return new Monkey(
        monkeyId, startingItems, operation, testDivisor, targetMonkeyIdTrue, targetMonkeyIdFalse);
  }

  private static List<Item> parseItemList(String group) {
    String[] split = group.split(",\\s*");
    return Arrays.stream(split).map(Long::valueOf).map(Item::new).toList();
  }

  private static LongUnaryOperator parseOperation(String operationString) {
    if (operationString.equals("old * old")) {
      return old -> old * old;
    }

    if (operationString.startsWith("old + ")) {
      return old -> old + parseInt(operationString.substring(6));
    }

    if (operationString.startsWith("old * ")) {
      return old -> old * parseInt(operationString.substring(6));
    }

    throw new IllegalArgumentException("Cannot parse operation: " + operationString);
  }
}
