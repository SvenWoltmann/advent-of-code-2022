package eu.happycoders.adventofcode2022.day20;

import java.util.ArrayList;
import java.util.List;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>The file to be decrypted.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class File {

  private final List<Node> nodesInOriginalOrder = new ArrayList<>();
  private final int size;
  private final Node zeroNode;

  File(List<Long> numbers) {
    size = numbers.size();

    // Store all numbers in a doubly-linked list.
    // And remember the original order of the nodes and the zero node.
    Node tempZeroNode = null;
    for (int i = 0; i < size; i++) {
      Long number = numbers.get(i);
      Node node = new Node(number);

      nodesInOriginalOrder.add(node);

      if (number == 0) {
        tempZeroNode = node;
      }

      if (i > 0) {
        Node previousNode = nodesInOriginalOrder.get(i - 1);
        previousNode.setNext(node);
        node.setPrevious(previousNode);
      }
    }

    this.zeroNode = tempZeroNode;

    // Make the list circular
    Node firstNode = nodesInOriginalOrder.get(0);
    Node lastNode = nodesInOriginalOrder.get(size - 1);
    firstNode.setPrevious(lastNode);
    lastNode.setNext(firstNode);
  }

  void mix() {
    for (int i = 0; i < size; i++) {
      Node node = nodesInOriginalOrder.get(i);
      move(node);
    }
  }

  private void move(Node node) {
    long distance = node.value() % (size - 1);
    if (distance == 0) {
      return;
    }

    Node previous = node.previous();
    Node next = node.next();

    // Remove node from current position
    previous.setNext(next);
    next.setPrevious(previous);

    if (distance < 0) {
      for (long i = 0; i > distance; i--) {
        next = previous;
        previous = previous.previous();
      }
    } else {
      for (long i = 0; i < distance; i++) {
        previous = next;
        next = next.next();
      }
    }

    // Insert node at new position
    previous.setNext(node);
    node.setPrevious(previous);
    node.setNext(next);
    next.setPrevious(node);
  }

  long getGroveCoordinates() {
    Node node = zeroNode;

    long sum = 0;
    for (int i = 0; i < 3; i++) {
      node = skipNodes(node, 1000);
      sum += node.value();
    }

    return sum;
  }

  private Node skipNodes(Node node, int numberOfNodes) {
    int remainder = numberOfNodes % size;
    for (int i = 0; i < remainder; i++) {
      node = node.next();
    }
    return node;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    Node node = nodesInOriginalOrder.get(0);
    for (int i = 0; i < size; i++) {
      if (result.length() > 0) {
        result.append(", ");
      }
      result.append(node.value());
      node = node.next();
    }
    return result.toString();
  }
}
