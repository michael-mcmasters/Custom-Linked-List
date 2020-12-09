package com.company;

import com.company.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("arg1", "arg2", "arg3");
        System.out.println(list.size());
    }
}
