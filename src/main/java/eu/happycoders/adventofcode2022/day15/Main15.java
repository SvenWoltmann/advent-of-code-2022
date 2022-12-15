package eu.happycoders.adventofcode2022.day15;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Main application for day 15.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Main15 {

  private static final String INPUT =
      """
          Sensor at x=251234, y=759482: closest beacon is at x=-282270, y=572396
          Sensor at x=2866161, y=3374117: closest beacon is at x=2729330, y=3697325
          Sensor at x=3999996, y=3520742: closest beacon is at x=3980421, y=3524442
          Sensor at x=3988282, y=3516584: closest beacon is at x=3980421, y=3524442
          Sensor at x=3005586, y=3018139: closest beacon is at x=2727127, y=2959718
          Sensor at x=3413653, y=3519082: closest beacon is at x=3980421, y=3524442
          Sensor at x=2900403, y=187208: closest beacon is at x=2732772, y=2000000
          Sensor at x=1112429, y=3561166: closest beacon is at x=2729330, y=3697325
          Sensor at x=3789925, y=3283328: closest beacon is at x=3980421, y=3524442
          Sensor at x=3991533, y=3529053: closest beacon is at x=3980421, y=3524442
          Sensor at x=3368119, y=2189371: closest beacon is at x=2732772, y=2000000
          Sensor at x=2351157, y=2587083: closest beacon is at x=2727127, y=2959718
          Sensor at x=3326196, y=2929990: closest beacon is at x=3707954, y=2867627
          Sensor at x=3839244, y=1342691: closest beacon is at x=3707954, y=2867627
          Sensor at x=2880363, y=3875503: closest beacon is at x=2729330, y=3697325
          Sensor at x=1142859, y=1691416: closest beacon is at x=2732772, y=2000000
          Sensor at x=3052449, y=2711719: closest beacon is at x=2727127, y=2959718
          Sensor at x=629398, y=214610: closest beacon is at x=-282270, y=572396
          Sensor at x=3614706, y=3924106: closest beacon is at x=3980421, y=3524442
          Sensor at x=3999246, y=2876762: closest beacon is at x=3707954, y=2867627
          Sensor at x=3848935, y=3020496: closest beacon is at x=3707954, y=2867627
          Sensor at x=123637, y=2726215: closest beacon is at x=-886690, y=3416197
          Sensor at x=4000000, y=3544014: closest beacon is at x=3980421, y=3524442
          Sensor at x=2524955, y=3861248: closest beacon is at x=2729330, y=3697325
          Sensor at x=2605475, y=3152151: closest beacon is at x=2727127, y=2959718""";

  public static void main(String[] args) {
    System.out.println(Day15Solver.solvePart1(INPUT, 2_000_000));
    System.out.println(Day15Solver.solvePart2(INPUT, 4_000_000));
  }
}
