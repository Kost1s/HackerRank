package com.kap.hackerrank.util;

public class ArrayUtils {

    private ArrayUtils() {
        // intentionally blank
    }

    public static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }

    public static boolean isSorted(Comparable[] ar) {
        return isSorted(ar, 0, ar.length - 1);
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void showArray(Comparable[] ar) {
        for (Comparable n : ar) {
            System.out.println(n);
        }
    }

    public static void printArray(Comparable[] ar) {
        for (Comparable n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
