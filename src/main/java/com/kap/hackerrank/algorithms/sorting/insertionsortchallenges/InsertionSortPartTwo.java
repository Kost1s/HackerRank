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

    private static void insertionSortPart2(int[] ar) {
        for (int j = 1; j <= (ar.length - 1); j++) {
            int temp = ar[j];
            for (int i = j; i > 0; i--) {
                if (temp < ar[i - 1]) {
                    ar[i] = ar[i - 1];
                } else {
                    ar[i] = temp;
                    break;
                }
            }

            if (temp < ar[0]) {
                ar[0] = temp;
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
