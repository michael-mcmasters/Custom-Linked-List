package com.company.linkedlist;

public class Node {
    private Node nextNode;
    public String value;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        nextNode = node;
    }
}

