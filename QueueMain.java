package com.bridgeLabz.queue;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to Add element into Queue");
        System.out.println("Enter 2 to Delete elements from the queue");
        switch (scanner.nextInt()) {
            case 1:
                queue.enqueue();
                break;
            case 2:
                queue.dequeue();
                break;
            default:
                System.out.println("Enter the 1 or 2");
        }

    }
}