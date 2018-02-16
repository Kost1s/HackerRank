package com.kap.hackerrank.algorithms.sorting.insertionsort;

import static com.kap.hackerrank.util.ArrayUtils.less;
import static com.kap.hackerrank.util.ArrayUtils.printArray;
import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArrayToComparable;

public class InsertionSortPartOne {

    public static void main(String[] args) {
        Comparable[] ar = readSizeAndElementsOfIntArrayToComparable();
        insertIntoSortedPartOneTwoStepsSwap(ar);
    }

    public static void insertIntoSortedPartOneTwoStepsSwap(Comparable[] ar) {
        Comparable temp = ar[ar.length - 1];
        int i;
        for (i = ar.length - 1; (i > 0) && less(temp, ar[i - 1]); i--) {
            ar[i] = ar[i - 1];
            printArray(ar);
        }
        ar[i] = temp;
        printArray(ar);
    }

    public static void insertIntoSortedPartOneDirectSwap(Comparable[] ar) {
        Comparable temp = ar[ar.length - 1];
        int i;
        for (i = ar.length - 1; (i > 0) && less(temp, ar[i - 1]); i--) {
            ar[i] = ar[i - 1];
            ar[i - 1] = temp;
            printArray(ar);
        }
    }

}
