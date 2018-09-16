package com.kap.hackerrank.datastructures.queues;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class QueueTwoStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        int queriesNo = sc.nextInt();

        for(int i = 0; i < queriesNo; i++) {
            int command = sc.nextInt();
            if(command == 1) {
                queue.enqueue(sc.nextInt());
            } else if(command == 2) {
                queue.dequeue();
            } else if(command == 3) {
                queue.printElement();
            }
        }
    }

    private static class Queue {
        Stack<Integer> enqueueStack  = new Stack<>();
        Stack<Integer> dequeueStack = new Stack<>();

        public Queue() {
            // Intentionally Blank
        }

        public void enqueue(int element) {
            enqueueStack.push(element);
        }

        public int dequeue() {
            checkIfEmpty();
            return dequeueStack.pop();
        }

        public void printElement() {
            checkIfEmpty();
            System.out.println(dequeueStack.peek());
        }

        private void checkIfEmpty() {
            if (dequeueStack.isEmpty()) {
                while(!enqueueStack.isEmpty()) {
                    dequeueStack.push(enqueueStack.pop());
                }
            }
        }

    }

}
