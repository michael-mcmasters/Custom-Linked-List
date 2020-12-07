package com.company;

import com.company.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Word");
        linkedList.add("Word2");
        linkedList.add("Word3");
        String value = linkedList.get(0);
        String value1 = linkedList.get(1);
        String value2 = linkedList.get(2);
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
    }
}
