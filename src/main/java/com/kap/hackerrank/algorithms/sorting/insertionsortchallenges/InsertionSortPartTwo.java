package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import java.util.Scanner;

public class InsertionSortPartTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);
    }

    public static void insertionSortPart2(int[] ar) {
        int temp;
        int i;
        for (int j = 1; j < ar.length; j++) {
            temp = ar[j];
            for (i = j; (i > 0) && (temp < ar[i - 1]); i--) {
                ar[i] = ar[i - 1];
            }
            ar[i] = temp;
            printArray(ar);
        }
    }

    public static void insertionSortPartTwoDirect(int[] ar) {
        int temp;
        int i;
        for (int j = 1; j < ar.length; j++) {
            temp = ar[j];
            for (i = j; (i > 0) && (temp < ar[i - 1]); i--) {
                ar[i] = ar[i - 1];
                ar[i - 1] = temp;
            }
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
