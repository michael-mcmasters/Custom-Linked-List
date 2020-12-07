package com.company.linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;

    public LinkedList() {

    }

    public void add(String newValue) {
        // List has no values. Create head.
        if (head == null) {
            head = new Node(newValue);
        // List only has 1 value. Create next value.
        } else if (tail == null) {
            tail = new Node(newValue);
            head.setNextNode(tail);
        // Head has at least 2 values. Point current tail to new tail.
        } else {
            Node newTail = new Node(newValue);
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

            // Index out of range.
            if (currentNode == null) {
                System.out.println("Index is out of range of list.");
                return null;
            }
        }
        return null;
    }

    public Node getHead() {
        if (head == null)
            System.out.println("It looks like the list doesn't have any values.");
        return head;
    }

    public Node getTail() {
        if (tail == null) {
            // If tail is null, there is only one item in the list which is the head. Return that.
            return getHead();
        }
        return tail;
    }
}
