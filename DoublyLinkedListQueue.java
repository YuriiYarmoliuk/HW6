package com.cursor;

import java.util.LinkedList;
import java.util.Queue;

public class DoublyLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("myQueue1");
        myQueue.add("myQueue2");
        myQueue.add("myQueue3");
        myQueue.add("myQueue4");
        myQueue.add("myQueue5");

        System.out.println("myQueue with added elements: " + myQueue);

        System.out.println("myQueue is Empty?  " + myQueue.isEmpty());

        System.out.println("Size myQueue: " + myQueue.size());

        System.out.println("myQueue Firs In Firs Out (FIFO): ");

        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.remove() + " ");
        }
    }
}