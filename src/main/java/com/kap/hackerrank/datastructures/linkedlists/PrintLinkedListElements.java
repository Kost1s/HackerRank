package com.kap.hackerrank.datastructures.linkedlists;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class PrintLinkedListElements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        int linkedListCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < linkedListCount; i++) {
            int linkedListItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            linkedList.insertNode(linkedListItem);
        }

        printLinkedList(linkedList.head);

        scanner.close();
    }

    static class SinglyLinkedList {
        SinglyLinkedListNode head;
        SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head.next;

        if(head != null) {
            System.out.println(head.data);
        }

        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

}
