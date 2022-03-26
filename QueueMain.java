package com.bridgeLabz.queue;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to Add element into Queue");
        switch (scanner.nextInt()) {
            case 1:
                queue.enqueue();
                break;
            default:
                System.out.println("Enter the 1 or 2");
        }

    }
}