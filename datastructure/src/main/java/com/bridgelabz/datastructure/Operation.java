package com.bridgelabz.datastructure;

public class Operation {

    // created method to add data at start.
    public static void addDataAtStart() {
        Datastructure linkedList = new Datastructure();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }

    // Created a method to add data at end.
    public static void addDataAtEnd() {
        Datastructure linkedList = new Datastructure();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();

    }

    // created method for insert in between
    public static void insertInBetween() {
        Datastructure linkedList = new Datastructure();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println();
        System.out.println("After");
        linkedList.print();
    }
}