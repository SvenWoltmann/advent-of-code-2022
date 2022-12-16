package eu.happycoders.adventofcode2022.day16;

import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The history of actions of one or two actors.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Actions {

  private final List<Action> actions1 = new ArrayList<>();
  private final List<Action> actions2 = new ArrayList<>();

  private int pressureReleased;
  private int flowRate;
  private int numberOfOpenValves;
  private int openValvesBits;

  void add(Action action1, Action action2) {
    actions1.add(action1);
    actions2.add(action2);

    pressureReleased += flowRate;

    if (action1 instanceof OpenAction openAction) {
      openValve(openAction.valve());
    }

    if (action2 instanceof OpenAction openAction) {
      openValve(openAction.valve());
    }
  }

  private void openValve(Valve valve) {
    flowRate += valve.flowRate();
    numberOfOpenValves++;
    openValvesBits |= valve.bitmaskForOpenValve();
  }

  void undoLastAction() {
    int lastIndex = actions1.size() - 1;

    Action last1 = actions1.get(lastIndex);
    Action last2 = actions2.get(lastIndex);

    if (last1 instanceof OpenAction openAction) {
      closeValve(openAction.valve());
    }

    if (last2 instanceof OpenAction openAction) {
      closeValve(openAction.valve());
    }

    pressureReleased -= flowRate;

    actions1.remove(lastIndex);
    actions2.remove(lastIndex);
  }

  private void closeValve(Valve valve) {
    flowRate -= valve.flowRate();
    numberOfOpenValves--;
    openValvesBits &= ~valve.bitmaskForOpenValve();
  }

  boolean actorComingFromValveWithoutOpenAction(Valve valve, int actorNumber) {
    return actorComingFromValveWithoutOpenAction(valve, actorNumber == 1 ? actions1 : actions2);
  }

  private boolean actorComingFromValveWithoutOpenAction(Valve valve, List<Action> actions) {
    for (int i = size() - 1; i >= 0; i--) {
      Action action = actions.get(i);
      if (action instanceof OpenAction) {
        return false;
      } else if (action instanceof GoToAction goToAction && goToAction.from() == valve) {
        return true;
      }
    }
    return false;
  }

  int size() {
    return actions1.size();
  }

  int getPressureReleased() {
    return pressureReleased;
  }

  int getPressureReleasedAfterMaxMinutes(int maxMinutes) {
    return pressureReleased + flowRate * (maxMinutes - size());
  }

  int getFlowRate() {
    return flowRate;
  }

  int getNumberOfOpenValves() {
    return numberOfOpenValves;
  }

  int getOpenValvesBits() {
    return openValvesBits;
  }
}
