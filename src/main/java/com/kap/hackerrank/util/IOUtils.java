package com.kap.hackerrank.util;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class IOUtils {

    private IOUtils() {
        // Intentionally Blank
    }

    public static int[] readSizeAndElementsOfIntArray() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        in.close();
        return ar;
    }

    public static Comparable[] readSizeAndElementsOfIntArrayToComparable() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        Comparable[] ar = new Comparable[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        in.close();
        return ar;
    }

    public static void readSizeAndElementsOfIntArraysToComparable() {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();

        for(int q=0; q < queries; q++) {
            int s = sc.nextInt();
            Comparable[] ar = new Comparable[s];
            for (int i = 0; i < s; i++) {
                ar[i] = sc.nextInt();
            }
        }
    }

    public static Comparable[] readSizeAndElementsOfStringArrayToComparable() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Comparable[] ar = new Comparable[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.next();
        }
        in.close();
        return ar;
    }

    public static int[] readLineOfStringsAndConvertToIntArrayOfGivenSize(int arraySize) {
        Scanner in = new Scanner(System.in);

        String[] arItems = in.nextLine().split(" ");

        int[] ar = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int arrItem = Integer.parseInt(arItems[i].trim());
            ar[i] = arrItem;
        }

        in.close();
        return ar;
    }

    public static String[] readSizeAndElementsOfStringArray() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] ar = new String[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.next();
        }
        in.close();
        return ar;
    }

}
