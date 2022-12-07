package eu.happycoders.adventofcode2022.day7;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Parser for the puzzle input.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class PuzzleInputParser {

  private Directory root;
  private Directory currentDir;
  private ParserState state = ParserState.INPUT;

  Directory parse(String input) {
    input.lines().forEach(this::process);
    return root;
  }

  private void process(String line) {
    if (line.startsWith("$ ")) {
      processInput(line.substring(2));
    } else {
      processListOutput(line);
    }
  }

  private void processInput(String command) {
    if (command.startsWith("cd")) {
      changeDir(command.substring(3).trim());
    } else if (command.equals("ls")) {
      list();
    } else {
      throw new IllegalArgumentException("Unknown command: " + command);
    }
  }

  void changeDir(String dir) {
    if (currentDir == null) {
      if (!dir.equals("/")) {
        throw new IllegalArgumentException("First cd command must be to '/'");
      }
      currentDir = root = new Directory("/", null);
    } else if (dir.equals("..")) {
      Directory parent = currentDir.getParent();
      if (parent == null) {
        throw new IllegalArgumentException(
            "Current dir '%s' has no parent".formatted(currentDir.getName()));
      }
      currentDir = parent;
    } else {
      Directory newDir = currentDir.findDirectory(dir);
      if (newDir == null) {
        throw new IllegalArgumentException(
            "Cannot find dir '%s' under dir '%s'".formatted(dir, currentDir.getName()));
      }
      currentDir = newDir;
    }

    state = ParserState.INPUT;
  }

  private void list() {
    state = ParserState.LIST_OUTPUT;
  }

  private void processListOutput(String line) {
    if (state != ParserState.LIST_OUTPUT) {
      throw new IllegalStateException("Not in list output state");
    }

    String[] parts = line.split(" ");
    if (parts.length != 2) {
      throw new IllegalArgumentException("Invalid list output line: " + line);
    }

    String left = parts[0];
    String name = parts[1];

    if (left.equals("dir")) {
      Directory directory = new Directory(name, currentDir);
      currentDir.add(directory);
    } else {
      long size = Long.parseLong(left);
      File file = new File(name, size);
      currentDir.add(file);
    }
  }

  private enum ParserState {
    INPUT,
    LIST_OUTPUT
  }
}
