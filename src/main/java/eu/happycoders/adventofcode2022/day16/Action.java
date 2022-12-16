package eu.happycoders.adventofcode2022.day16;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Interface for an action (open a valve, go to another valve, do nothing).
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
sealed interface Action permits OpenAction, GoToAction, NoOpAction {

  Valve getNext();
}
