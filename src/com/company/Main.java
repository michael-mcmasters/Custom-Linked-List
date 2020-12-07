package com.company;

import com.company.linkedlist.LinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //LinkedList linkedList = new LinkedList();
//        linkedList.add("Word0");
//        linkedList.add("Word1");
//        linkedList.add("Word2");
//        linkedList.add("Word3");
//        linkedList.add("Word4");
//        linkedList.add("Word4");
//        linkedList.add("Word4");
//        linkedList.add("Word10");

        //LinkedList ll = new LinkedList("This is a test");
        //System.out.println(ll);
//
//        LinkedList ll2 = new LinkedList("first value", "second value", "third value");
//        System.out.println(ll2);
//
//        String[] values = new String[3];
//        values[0] = "whoa";
//        values[1] = "okay";
//        values[2] = "yes";
//        LinkedList ll3 = new LinkedList(values);
//        System.out.println(ll3);
//
//        LinkedList ll4 = new LinkedList("test");
//        System.out.println(ll4);


        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(0);
        myList.add(10);
        myList.add(20);
        System.out.println("index 1 is " + myList.get(1));
        //System.out.println(myList.remove(1));
        System.out.println("Size is " + myList.size());
        System.out.println("returned index is " + myList.indexOf(10));
        System.out.println(myList);


//        List<Integer> list = new java.util.LinkedList<>();
//        list.add(0);
//        list.add(10);
//        list.add(20);
//        list.add(30);
        //list.contains() // boolean
        //list.indexOf()
    }
}
