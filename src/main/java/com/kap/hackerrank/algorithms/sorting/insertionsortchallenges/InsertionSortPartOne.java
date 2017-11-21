package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import java.util.Scanner;

public class InsertionSortPartOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    //hackerrank implementation
    public static void insertIntoSorted(int[] ar) {
        int temp = ar[ar.length - 1];
        int i;
        for (i = ar.length - 1; (i > 0) && (temp < ar[i - 1]); i--) {
            ar[i] = ar[i - 1];
            printArray(ar);
        }
        ar[i] = temp;
        printArray(ar);
    }

    //direct swap of elements implementation
    public static void insertIntoSortedDirect(int[] ar) {
        int temp = ar[ar.length - 1];
        int i;
        for (i = ar.length - 1; (i > 0) && (temp < ar[i - 1]); i--) {
            ar[i] = ar[i - 1];
            ar[i - 1] = temp;
            printArray(ar);
        }
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
