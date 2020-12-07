package com.company.linkedlist;

public class LinkedList<T> {

    private Node head;
    private Node tail;

    // Allows you to instantiate object with multiple values or with an array.
    // String[] myArray = { "value1", "value2", "value3" };
    // LinkedList list = new LinkedList(myArray);
    // Or
    // LinkedList list = new LinkedList("value1", "value2", "value3");
    // Or
    // LinkedList list = new LinkedList("value1");
    public LinkedList(T... newValues) {
        for (T value : newValues) {
            add(value);
        }
    }

    public LinkedList() {

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Integer listSize = size();
        if (listSize == 0)
            return "A custom implementation of a Linked List. This list currently holds no values.";

        if (listSize == 1)
            return String.format("[%s]", head.value);

        Node currentNode = head;
        for (int i = 0; i < listSize; i++) {
            if (i == 0) {
                sb.append(String.format("[%s, ", currentNode.value));
            } else if (i < listSize - 1) {
                sb.append(String.format("%s, ", currentNode.value));
            } else {
                sb.append(String.format("%s]", currentNode.value));
            }
            currentNode = currentNode.getNextNode();
        }
        return sb.toString();
    }

    // Adds new item to list.
    public void add(T newValue) {
        if (head == null) {
            // List has no values. Create head.
            head = new Node(newValue);
        } else if (tail == null) {
            // List only has 1 value. Create tail.
            tail = new Node(newValue);
            head.setNextNode(tail);
        } else {
            // List has at least 2 values. Point current tail to new tail.
            Node newTail = new Node(newValue);
            tail.setNextNode(newTail);
            tail = newTail;
        }
    }

    // Gets value at index.
    public T get(Integer index) {
        return (T) getNodeAtIndex(index).value;
    }

    // Removes node from list and returns it.
    public T remove(Integer index) {
        if (index == 0) {
            // Sets second node in list to be the new head
            Node currentHeadNode = head;
            Node newHeadNode = head.getNextNode();
            head = newHeadNode;
            return (T) currentHeadNode.value;
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
        return (T) nodeToRemove.value;
    }

    public Boolean contains(T value) {
        if (indexOf(value) != -1)
            return true;

        return false;
    }

    public Integer indexOf(T value) {
        if (head == null) return -1;
        if (head.value == value) return 0;

        Node currentNode = head.getNextNode();
        int index = 1;
        while (currentNode != null) {
            if (currentNode.value == value)
                return index;

            currentNode = currentNode.getNextNode();
            index++;
        }

        return -1;
    }

    private Node getNodeAtIndex(Integer index) {
        if (head == null || index < 0) {
            System.out.println("Index " + index + " is out of range");
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
}
