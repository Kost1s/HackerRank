package com.kap.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class AlgorithmRunningTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        int shifts = insertionSortPart2(ar);
        System.out.println(shifts);
    }

    public static int insertionSortPart2(int[] ar) {
        int temp;
        int i;
        int shifts = 0;
        for (int j = 1; j < ar.length; j++) {
            temp = ar[j];
            for (i = j; (i > 0) && (temp < ar[i - 1]); i--) {
                ar[i] = ar[i - 1];
                shifts += 1;
            }
            ar[i] = temp;
        }
        return shifts;
    }
}
