package eu.happycoders.adventofcode2022.day16;

import java.util.HashMap;
import java.util.Map;

class GlobalSituations {

  private final Map<GlobalSituationKey, Integer> pastSituations = new HashMap<>();

  Integer get(GlobalSituationKey key) {
    return pastSituations.get(key);
  }

  void put(GlobalSituationKey key, int pressureReleased) {
    pastSituations.put(key, pressureReleased);
  }

  record GlobalSituationKey(int openValveBits, int position1, int position2, int numActions) {}
}
