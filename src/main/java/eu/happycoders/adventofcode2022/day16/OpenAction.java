package eu.happycoders.adventofcode2022.day16;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>An action taken by an actor: opening a valve.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record OpenAction(Valve valve) implements Action {

  @Override
  public Valve getNext() {
    return valve;
  }
}
