package com.company.linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;

    // Head and tail point to the same node because there are no values added.
    public LinkedList() {
//        this.head = new Node();
//        this.tail = head;
    }

    public void add(String newValue) {
        // If head is null, list has no values. Create head with new value.
        if (head == null) {
            head = new Node(null, newValue);
        // If tail is null, there is only one value in list. Create tail.
        } else if (tail == null) {
            tail = new Node(null, newValue);
            head.setNextNode(tail);
        // Else, point the current tail to a new tail
        } else {
            Node newTail = new Node(null, newValue);
            tail.setNextNode(newTail);
        }
    }

    public String get(Integer index) {
        Node currentNode = head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return currentNode.value;
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    public Node getHead() {
        return null;
    }

    // Loop through every node and check node.getNext().
    // If getNext() is null, it is the last node in the list.
    public Node getTail() {
        return null;
    }
}
