package eu.happycoders.adventofcode2022.day16;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Main application for day 16.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Main16 {

  private static final String INPUT =
      """
          Valve OA has flow rate=0; tunnels lead to valves VP, VM
          Valve GA has flow rate=13; tunnel leads to valve KV
          Valve WD has flow rate=0; tunnels lead to valves SH, XQ
          Valve TE has flow rate=0; tunnels lead to valves OY, DO
          Valve JR has flow rate=0; tunnels lead to valves TR, LY
          Valve JQ has flow rate=0; tunnels lead to valves TD, DZ
          Valve VH has flow rate=6; tunnels lead to valves WY, YQ, NU
          Valve NX has flow rate=0; tunnels lead to valves XQ, MN
          Valve XL has flow rate=0; tunnels lead to valves AA, FA
          Valve QY has flow rate=0; tunnels lead to valves NU, DO
          Valve KV has flow rate=0; tunnels lead to valves GA, XQ
          Valve NK has flow rate=0; tunnels lead to valves XW, XQ
          Valve JU has flow rate=0; tunnels lead to valves QH, TB
          Valve XZ has flow rate=0; tunnels lead to valves AA, SH
          Valve XQ has flow rate=18; tunnels lead to valves GK, NX, WD, KV, NK
          Valve VM has flow rate=19; tunnels lead to valves LY, OA, OY, AE
          Valve LE has flow rate=0; tunnels lead to valves MN, NS
          Valve HO has flow rate=0; tunnels lead to valves GO, QH
          Valve PX has flow rate=0; tunnels lead to valves MN, VP
          Valve MN has flow rate=4; tunnels lead to valves LE, UX, TB, NX, PX
          Valve VB has flow rate=0; tunnels lead to valves XM, AA
          Valve VP has flow rate=21; tunnels lead to valves XM, WT, BG, PX, OA
          Valve KI has flow rate=15; tunnels lead to valves XU, MT
          Valve NU has flow rate=0; tunnels lead to valves QY, VH
          Valve WT has flow rate=0; tunnels lead to valves SH, VP
          Valve OY has flow rate=0; tunnels lead to valves VM, TE
          Valve VS has flow rate=0; tunnels lead to valves QH, SH
          Valve XM has flow rate=0; tunnels lead to valves VB, VP
          Valve HI has flow rate=17; tunnel leads to valve TD
          Valve TB has flow rate=0; tunnels lead to valves JU, MN
          Valve BG has flow rate=0; tunnels lead to valves VP, GK
          Valve HN has flow rate=16; tunnel leads to valve BO
          Valve MT has flow rate=0; tunnels lead to valves KI, BO
          Valve OX has flow rate=0; tunnels lead to valves DZ, ZF
          Valve QH has flow rate=5; tunnels lead to valves FA, DW, VS, JU, HO
          Valve YQ has flow rate=0; tunnels lead to valves VH, AE
          Valve DW has flow rate=0; tunnels lead to valves ML, QH
          Valve WY has flow rate=0; tunnels lead to valves HS, VH
          Valve GO has flow rate=0; tunnels lead to valves HO, DO
          Valve UX has flow rate=0; tunnels lead to valves AA, MN
          Valve AE has flow rate=0; tunnels lead to valves YQ, VM
          Valve DZ has flow rate=9; tunnels lead to valves HS, OX, JQ
          Valve NS has flow rate=0; tunnels lead to valves SH, LE
          Valve LY has flow rate=0; tunnels lead to valves JR, VM
          Valve BO has flow rate=0; tunnels lead to valves HN, MT
          Valve HS has flow rate=0; tunnels lead to valves WY, DZ
          Valve XW has flow rate=0; tunnels lead to valves NK, AA
          Valve DO has flow rate=11; tunnels lead to valves TE, XU, ZF, QY, GO
          Valve FA has flow rate=0; tunnels lead to valves XL, QH
          Valve AA has flow rate=0; tunnels lead to valves VB, XL, XZ, XW, UX
          Valve VW has flow rate=14; tunnel leads to valve ML
          Valve SH has flow rate=8; tunnels lead to valves NS, WT, XZ, VS, WD
          Valve XU has flow rate=0; tunnels lead to valves DO, KI
          Valve ZF has flow rate=0; tunnels lead to valves OX, DO
          Valve GK has flow rate=0; tunnels lead to valves XQ, BG
          Valve ML has flow rate=0; tunnels lead to valves VW, DW
          Valve TD has flow rate=0; tunnels lead to valves HI, JQ
          Valve TR has flow rate=25; tunnel leads to valve JR""";

  public static void main(String[] args) {
    System.out.println(Day16Solver.solvePart1(INPUT));
    System.out.println(Day16Solver.solvePart2(INPUT));
  }
}
