package com.kap.hackerrank.datastructures.linkedlists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class InsertNodeAtTail {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

                llist.head = llist_head;
            }

            printSinglyLinkedList(llist.head, "\n", bufferedWriter);
            bufferedWriter.newLine();
        }

        scanner.close();
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode tail = new SinglyLinkedListNode(data);
        SinglyLinkedListNode interimNode;

        if (head != null) {
            if (head.next == null) {
                head.next = tail;
            }
        } else {
            head = tail;
        }

        interimNode = head.next;
        while (interimNode != null && !interimNode.equals(tail)) {
            if (interimNode.next == null) {
                interimNode.next = tail;
            }
            interimNode = interimNode.next;
        }

        return head;
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node,
                                             String sep,
                                             BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

}
