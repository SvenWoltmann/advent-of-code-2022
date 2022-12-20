package eu.happycoders.adventofcode2022.day20;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>A node in the doulbly-linked list.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Node {

  private final long value;

  private Node previous;
  private Node next;

  Node(long value) {
    this.value = value;
  }

  long value() {
    return value;
  }

  Node previous() {
    return previous;
  }

  void setPrevious(Node previous) {
    this.previous = previous;
  }

  Node next() {
    return next;
  }

  void setNext(Node next) {
    this.next = next;
  }
}
