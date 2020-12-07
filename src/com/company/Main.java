package com.company;

import com.company.linkedlist.LinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Word0");
        linkedList.add("Word1");
        linkedList.add("Word2");
        linkedList.add("Word3");
        linkedList.add("Word4");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));

        linkedList.remove(0);

        System.out.println(linkedList.size());



//        List<String> list = new java.util.LinkedList<>();
//        list.add("test");
//        list.

    }
}
