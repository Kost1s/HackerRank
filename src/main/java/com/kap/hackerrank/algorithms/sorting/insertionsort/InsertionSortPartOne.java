package com.kap.hackerrank.algorithms.sorting.insertionsort;

import static com.kap.hackerrank.Utils.readSizeAndElementsOfIntArray;

public class InsertionSortPartOne {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();
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
