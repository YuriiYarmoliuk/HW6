package com.cursor;

import java.util.Stack;

public class SinglyLinkedList {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();

        myStack.push("push1");
        myStack.push("push2");
        myStack.push("push3");
        myStack.push("push4");
        myStack.push("push5");

        System.out.println("myStack with added elements: " + myStack);

        System.out.println("myStack is Empty?  " + myStack.empty());

        System.out.println("Stack size: " + myStack.size());

        System.out.println("myStack Last In First Out (LIFO): ");

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop() + " ");
        }
    }
}