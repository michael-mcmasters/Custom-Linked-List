package com.company;

import com.company.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }
}
