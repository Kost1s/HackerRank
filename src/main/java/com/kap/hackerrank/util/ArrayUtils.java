package com.kap.hackerrank.util;

/**
 * @author Konstantinos Antoniou
 */
public class ArrayUtils {

    private ArrayUtils() {
        // Intentionally Blank
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

    public static void showComparableArray(Comparable[] ar) {
        for (Comparable n : ar) {
            System.out.println(n);
        }
    }

    public static void printComparableArray(Comparable[] ar) {
        for (Comparable n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void showIntegerArray(int[] ar) {
        for (int n : ar) {
            System.out.println(n);
        }
    }

    public static void printIntegerArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void printLongArray(long[] ar) {
        for (long n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void showStringArray(String[] ar) {
        for (String n : ar) {
            System.out.println(n);
        }
    }

    public static void printStringArray(String[] ar) {
        for (String n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }


}
