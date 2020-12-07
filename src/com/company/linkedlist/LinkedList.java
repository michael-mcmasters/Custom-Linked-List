package com.company.linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;

    public LinkedList() {

    }

    // Adds new item to list.
    public void add(String newValue) {
        // List has no values. Create head.
        if (head == null) {
            head = new Node(newValue);
            // List only has 1 value. Create tail.
        } else if (tail == null) {
            tail = new Node(newValue);
            head.setNextNode(tail);
            // List has at least 2 values. Point current tail to new tail.
        } else {
            Node newTail = new Node(newValue);
            tail.setNextNode(newTail);
            tail = newTail;
        }
    }

    // Gets value at index.
    public String get(Integer index) {
        return getNodeAtIndex(index).value;
    }

    // Removes node from list and returns it.
    public Node remove(Integer index) {
        if (index == 0) {
            Node currentHeadNode = head;
            Node newHeadNode = head.getNextNode();
            head = newHeadNode;
            return currentHeadNode;
        }
        Node prevNode = getNodeAtIndex(index - 1);
        Node nodeToRemove = prevNode.getNextNode();
        Node nextNode = nodeToRemove.getNextNode();
        if (nextNode != null) {
            prevNode.setNextNode(nextNode);
        } else {
            // If removed node didn't have a node after it, it was the tail. Set prevNode to be the tail.
            tail = prevNode;
            prevNode = null;
        }
        return nodeToRemove;
    }

    private Node getNodeAtIndex(Integer index) {
        if (head == null) {
            System.out.println("There are no items in list.");
        }
        Node currentNode = head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return currentNode;
            }
            currentNode = currentNode.getNextNode();

            if (currentNode == null) {
                System.out.println("Index is out of range of list.");
                return null;
            }
        }
        return null;
    }

    // Returns number of items in list.
    public Integer size() {
        if (head == null) {
            return 0;
        }
        // Start at 1 because we know there is a head node.
        int nodeCount = 1;
        Node currentNode = head;
        boolean nextNodeIsNull = false;
        while (!nextNodeIsNull) {
            Node nextNode = currentNode.getNextNode();
            if (nextNode == null) {
                nextNodeIsNull = true;
                break;
            }
            currentNode = nextNode;
            nodeCount++;
        }
        return nodeCount;
    }

    private Node checkNextNode(Node currentNode) {
        Node nextNode = currentNode.getNextNode();
        if (nextNode != null)
            return nextNode;
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
