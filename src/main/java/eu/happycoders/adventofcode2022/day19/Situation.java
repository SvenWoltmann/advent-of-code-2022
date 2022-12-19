package eu.happycoders.adventofcode2022.day19;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A specific situation at a given point in time.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
record Situation(
    Robots robots,
    RobotTypeWithCost robotBoughtToCreateThisSituation,
    Resources resources,
    Situation parent) {

  static Situation initialSituation() {
    Robots initialRobots = new Robots().addOneRobot(ResourceType.ORE);
    Resources initialResources = new Resources();
    return new Situation(initialRobots, null, initialResources, null);
  }

  @Override
  public String toString() {
    // Don't include the parent!
    return "Situation[robots=" + robots + ", resources=" + resources + "]";
  }
}
