package com.company.linkedlist;

public class Node<T> {
    private Node nextNode;
    public T value;

    public Node(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        nextNode = node;
    }
}

