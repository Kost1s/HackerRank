package com.kap.hackerrank.algorithms.sorting.insertionsort;

import static com.kap.hackerrank.ArrayUtils.less;
import static com.kap.hackerrank.ArrayUtils.printArray;
import static com.kap.hackerrank.IOUtils.readSizeAndElementsOfIntArrayToComparable;

public class InsertionSortPartTwo {

    public static void main(String[] args) {
        Comparable[] ar = readSizeAndElementsOfIntArrayToComparable();
        insertionSortPartTwoTwoStepsSwap(ar);
    }

    public static void insertionSortPartTwoTwoStepsSwap(Comparable[] ar) {
        Comparable temp;
        int i;
        for (int j = 1; j < ar.length; j++) {
            temp = ar[j];
            for (i = j; (i > 0) && less(temp, ar[i - 1]); i--) {
                ar[i] = ar[i - 1];
            }
            ar[i] = temp;
            printArray(ar);
        }
    }

    public static void insertionSortPartTwoDirectSwap(Comparable[] ar) {
        Comparable temp;
        int i;
        for (int j = 1; j < ar.length; j++) {
            temp = ar[j];
            for (i = j; (i > 0) && less(temp, ar[i - 1]); i--) {
                ar[i] = ar[i - 1];
                ar[i - 1] = temp;
            }
            printArray(ar);
        }
    }

}
