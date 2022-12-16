package eu.happycoders.adventofcode2022.day16;

import eu.happycoders.adventofcode2022.day16.GlobalSituations.GlobalSituationKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Simulates actions of one or two actors until all valves are opened or the time is over.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class ActionsSimulator {

  private final Valves valves;

  private final int numActors;
  private final int maxMinutes;

  private final Actions actions = new Actions();
  private final GlobalSituations globalSituations = new GlobalSituations();

  private int mostPressureReleased;

  ActionsSimulator(Valves valves, int numActors, int maxMinutes) {
    this.valves = valves;
    this.numActors = numActors;
    this.maxMinutes = maxMinutes;
  }

  int getMostPressurePossible() {
    goIntoRecursionTwoActors(valves.start(), valves.start());
    return mostPressureReleased;
  }

  private void goIntoRecursionTwoActors(Valve valve1, Valve valve2) {
    if (isGoalReached()) {
      checkIfNewBestActionsFound(actions);
      return;
    }

    if (existsNoWayToReachTheGoal(numActors)) {
      return;
    }

    // Optimization #1:
    // Check if we were in the same situation (combination of open valves, actor positions, number
    // of previous actions) before. If yes, and in that situation we had the same or more pressure
    // released, it wouldn't be possible to find a better solution if we explored the current
    // situation further.
    // --> reduces total time by factor 9.9
    GlobalSituationKey globalSituation = getGlobalSituationKey(valve1, valve2);
    Integer pressureReleasedWhenInThatSituation = globalSituations.get(globalSituation);
    if (pressureReleasedWhenInThatSituation != null
        && pressureReleasedWhenInThatSituation >= actions.getPressureReleased()) {
      return;
    }
    globalSituations.put(globalSituation, actions.getPressureReleased());

    // Another optimization I tried here was to check if the same situation occurred *earlier* with
    // more pressure released. While this happened 16,324 times with my puzzle input, it *increased*
    // the total time to find a solution by about 50%.

    List<Action> actionsActor1 = getPossibleActions(valve1, 1);
    List<Action> actionsActor2 = getPossibleActions(valve2, 2);

    for (Action action1 : actionsActor1) {
      for (Action action2 : actionsActor2) {
        executeActionsAndGoIntoRecursion(action1, action2);
      }
    }
  }

  private boolean isGoalReached() {
    return actions.getNumberOfOpenValves() == valves.numberOfValvesToOpen()
        || actions.size() == maxMinutes;
  }

  private void checkIfNewBestActionsFound(Actions actions) {
    int pressureReleasedAfterMaxMinutes = actions.getPressureReleasedAfterMaxMinutes(maxMinutes);
    if (pressureReleasedAfterMaxMinutes > mostPressureReleased) {
      mostPressureReleased = pressureReleasedAfterMaxMinutes;
    }
  }

  private boolean existsNoWayToReachTheGoal(int numberOfActors) {
    int maxPossiblePressureReleased = calculateMaxPossiblePressureReleased(numberOfActors);
    return maxPossiblePressureReleased < mostPressureReleased;
  }

  private int calculateMaxPossiblePressureReleased(int numberOfActors) {
    // Optimization #2:
    // Calculate how much pressure can be released in the remaining time by opening the valves in
    // descending order of their flow rate ... instead of simply assuming the maximum possible flow
    // rate for the remaining time.
    // --> reduces total time by factor 8.5
    int remainingMinutes = maxMinutes - actions.size();

    int maxPossiblePressureReleased = actions.getPressureReleased();
    int currentFlowRate = actions.getFlowRate();

    List<Valve> allClosedSortedByFlowRate = valves.getAllClosedValvesSortedByFlowRate();
    int allClosedIndex = allClosedSortedByFlowRate.size() - 1;

    // In the remaining minutes, every two minutes, open the valve(s) with the highest flow rate
    for (int minute = 0; minute < remainingMinutes; minute++) {
      maxPossiblePressureReleased += currentFlowRate;
      if (minute % 2 == 0) {
        for (int i = 0; i < numberOfActors; i++) {
          if (allClosedIndex >= 0) {
            currentFlowRate += allClosedSortedByFlowRate.get(allClosedIndex).flowRate();
            allClosedIndex--;
          }
        }
      }
    }

    return maxPossiblePressureReleased;
  }

  private GlobalSituationKey getGlobalSituationKey(Valve valve1, Valve valve2) {
    int openValveBits = actions.getOpenValvesBits();

    int position1 = valve1.index();
    int position2 = valve2.index();

    // Optimization #3:
    // It doesn't matter who stands where -> always put smaller index first.
    // --> reduces total time by factor 1.7
    if (position2 < position1) {
      int help = position1;
      position1 = position2;
      position2 = help;
    }

    return new GlobalSituationKey(openValveBits, position1, position2, actions.size());
  }

  private List<Action> getPossibleActions(Valve valve, int actorNo) {
    if (numActors == 1 && actorNo == 2) {
      return List.of(new NoOpAction(valve));
    }

    List<Action> result = new ArrayList<>();

    // Open
    if (valve.flowRate() > 0 && valve.isClosed()) {
      result.add(new OpenAction(valve));
    }

    // Walk
    for (Valve next : valve.leadingTo()) {
      // Optimization #4:
      // Make sure the actor doesn't walk in circles without opening a valve.
      // --> reduces total time by factor 5.8
      if (!actions.actorComingFromValveWithoutOpenAction(next, actorNo)) {
        result.add(new GoToAction(valve, next));
      }
    }

    if (result.isEmpty()) {
      result.add(new NoOpAction(valve));
    }

    return result;
  }

  private void executeActionsAndGoIntoRecursion(Action action1, Action action2) {
    // Don't let both do nothing
    if (action1 instanceof NoOpAction && action2 instanceof NoOpAction) {
      return;
    }

    // Don't let both open the same valve
    if (action1 instanceof OpenAction openAction1
        && action2 instanceof OpenAction openAction2
        && openAction1.valve() == openAction2.valve()) {
      return;
    }

    executeOpenActions(action1, action2);

    actions.add(action1, action2);
    goIntoRecursionTwoActors(action1.getNext(), action2.getNext());
    actions.undoLastAction();

    undoOpenActions(action1, action2);
  }

  private void executeOpenActions(Action action1, Action action2) {
    if (action1 instanceof OpenAction openAction) {
      openAction.valve().open();
      valves.invalidateAllClosedValvesSortedByFlowRate();
    }

    if (action2 instanceof OpenAction openAction) {
      openAction.valve().open();
      valves.invalidateAllClosedValvesSortedByFlowRate();
    }
  }

  private void undoOpenActions(Action action1, Action action2) {
    if (action1 instanceof OpenAction openAction) {
      openAction.valve().close();
      valves.invalidateAllClosedValvesSortedByFlowRate();
    }

    if (action2 instanceof OpenAction openAction) {
      openAction.valve().close();
      valves.invalidateAllClosedValvesSortedByFlowRate();
    }
  }
}
