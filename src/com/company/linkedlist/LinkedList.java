package com.company.linkedlist;

public class LinkedList<T> {

    private Node head;
    private Node tail;

    public LinkedList() {

    }

    public LinkedList(T... newValues) {
        add(newValues);
    }

    // O(n) Linear Time.
    // Prints every value in list.
    // Useful for debugging. Will show every value in the list next to the stepping point.
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

    // O(1) Constant Time when adding a single value.
    // O(n) Linear Time when adding multiple values, where n is the length of items being added in constant time.
    // Add item(s) to list.
    // (T... is called the varargs element.)
    public void add(T... newValues) {
        for (T value : newValues) {
            if (head == null) {
                // List has no values. Create head.
                head = new Node(value);
            } else if (tail == null) {
                // List only has 1 value. Create tail.
                tail = new Node(value);
                head.setNextNode(tail);
            } else {
                // List has at least 2 values. Point current tail to new tail.
                Node newTail = new Node(value);
                tail.setNextNode(newTail);
                tail = newTail;
            }
        }
    }

    // O(n) Linear Time.
    // Removes node from list and returns it.
    public T remove(Integer index) {
        if (index == 0) return removeFirst();

        Node prevNode = getNodeAtIndex(index - 1);
        Node nodeToRemove = prevNode.getNextNode();
        Node nextNode = nodeToRemove.getNextNode();
        if (nextNode == null) {
            // If removed node didn't have a node after it, it was the tail. Set prevNode to be the tail.
            tail = prevNode;
            prevNode.setNextNode(null);
        } else {
            prevNode.setNextNode(nextNode);
        }

        return (T) nodeToRemove.value;
    }

    // O(1) Constant Time.
    // Removes first element.
    public T removeFirst() {
        // Sets second node in list to be the new head
        Node currentHeadNode = head;
        Node newHeadNode = head.getNextNode();
        head = newHeadNode;
        return (T) currentHeadNode.value;
    }

    // O(n) Linear Time. Need to loop through every node to get the node right before the tail.
    // (since this is a singly linked list, and elements are added to the tail rather than the head.)
    // Removes last element.
    public T removeLast() {
        if (head == null) return null;

        // List only has 1 item. Tell list to stop pointing at head.
        else if (head != null && tail == null) {
            Node prevHead = head;
            head = null;
            return (T) prevHead.value;
        }

        Node prevNode = head;
        Node currentNode = head.getNextNode();
        // If node is pointing to a null node, it is the tail. prevNode is the node before the tail.
        while (currentNode.getNextNode() != null) {
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        tail = prevNode;
        tail.setNextNode(null);
        return (T) currentNode.value;
    }

    // O(n) Linear Time.
    // Gets value at index.
    public T get(Integer index) {
        return (T) getNodeAtIndex(index).value;
    }

    // O(1) Constant Time.
    public T getFirst() {
        return (T) head.value;
    }

    // O(1) Constant Time.
    public T getLast() {
        return (T) tail.value;
    }

    // O(n) Linear Time.
    // Returns the index of the value passed.
    public Integer indexOf(T value) {
        if (head == null) return -1;
        if (head.value == value) return 0;

        int index = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value)
                return index;

            index++;
            currentNode = currentNode.getNextNode();
        }

        return -1;
    }

    // O(n) Linear Time.
    // Returns true if list contains pass value, false if not.
    public Boolean contains(T value) {
        if (indexOf(value) != -1)
            return true;

        return false;
    }

    // O(n) Linear Time.
    // Returns the number of items in the list.
    public Integer size() {
        if (head == null) {
            return 0;
        }
        int nodeCount = 0;
        Node currentNode = head;
        while (currentNode != null) {
            nodeCount++;
            currentNode = currentNode.getNextNode();
        }
        return nodeCount;
    }

    // O(n) Linear Time
    // Points each node in the list to the node before it to reverse it.
    // 1 -> 2 -> 3 -> 4 -> 5 becomes 5 -> 4 > 3 -> 2 -> 1
    public void reverse() {
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(prevNode);
            prevNode = currentNode;
            currentNode = nextNode;

        }
        head = prevNode;
    }

    // O(n) Linear Time.
    // Helper method that returns the node at the given index.
    private Node getNodeAtIndex(Integer givenIndex) {
        if (head == null || givenIndex < 0) {
            System.out.println("Index " + givenIndex + " is out of range");
            return null;
        }
        int index = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (index == givenIndex)
                return currentNode;

            index++;
            currentNode = currentNode.getNextNode();
        }

        System.out.println("Index " + index + " is out of range");
        return null;
    }
}
