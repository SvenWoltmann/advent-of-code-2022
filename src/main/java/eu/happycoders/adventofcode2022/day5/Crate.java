package eu.happycoders.adventofcode2022.day5;

record Crate(char value) {

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
