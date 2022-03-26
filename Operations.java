package com.bridgeLabz.linkedList;

public class Operations {
    public static LinkedList addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        return linkedList;
    }

    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("after:");
        linkedList.print();

    }

    public static void deleteFirstNode() {
        LinkedList linkedList = addDataAtStart();
        linkedList.pop();
        linkedList.print();
    }

    public static void deleteLastNode() {
        LinkedList linkedList = addDataAtStart();
        linkedList.popLast();
        linkedList.print();
    }

    public static void findNodeBasedOnValue() {
        LinkedList linkedList = addDataAtStart();
        linkedList.searchNode(30);
    }

    public static LinkedList insertAfterSearchNode() {
        LinkedList linkedList = addDataAtStart();
        Node newNode = new Node(40);
        Node previousNode = linkedList.searchNodeAt(30, newNode);
        linkedList.print();
        return linkedList;
    }

    public static void deleteAfterNodeAfterSearchNode() {
        System.out.println("Before");
        LinkedList linkedList = insertAfterSearchNode();
        System.out.println("after");
        linkedList.deleteANode(40);
        linkedList.print();
    }
}