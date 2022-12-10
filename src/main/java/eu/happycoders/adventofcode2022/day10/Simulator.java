package eu.happycoders.adventofcode2022.day10;

import java.util.ArrayList;
import java.util.List;

class Simulator {

  private final List<Integer> signalStrengths = new ArrayList<>();
  private final Screen screen = new Screen();

  private int registerX = 1;
  private int cycle;

  void runOperations(List<Operation> operations) {

    for (Operation operation : operations) {
      int cyclesOfOperation = operation.getCycles();

      for (int j = 0; j < cyclesOfOperation; j++) {
        cycle++;
        int signalStrength = cycle * registerX;
        signalStrengths.add(signalStrength);

        int screenX = screen.getCurrentX();
        boolean screenOnSprite = screenX >= registerX - 1 && screenX <= registerX + 1;
        screen.draw(screenOnSprite);
      }

      if (operation instanceof AddX addX) {
        registerX += addX.value();
      }
    }
  }

  public List<Integer> getSignalStrengths() {
    return signalStrengths;
  }

  public Screen getScreen() {
    return screen;
  }
}
