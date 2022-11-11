package com.cursor;

import java.util.LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");

        System.out.println("list with added elements: " + list);

        list.addFirst("element0");
        System.out.println("list with new first element: " + list);

        list.addLast("element6");
        System.out.println("list with new last element: " + list);

        list.add(2, "element_n");
        System.out.println("list with new index number 2 element: " + list);

        System.out.println("list is Empty?" + list.isEmpty());

        System.out.println("list size: " + list.size());
    }
}
