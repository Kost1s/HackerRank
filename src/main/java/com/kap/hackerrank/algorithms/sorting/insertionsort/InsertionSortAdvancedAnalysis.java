package com.kap.hackerrank.algorithms.sorting.insertionsort;

import java.util.Scanner;

import static com.kap.hackerrank.Utils.readSizeAndElementsOfIntArray;

public class InsertionSortAdvancedAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        for(int q=0; q < queries; q++) {
            int[] ar = readSizeAndElementsOfIntArray();
            int shifts = insertionSortPartTwoDirectShifts(ar);
            System.out.println(shifts);
        }
    }

    public static int insertionSortPartTwoDirectShifts(int[] ar) {
        int temp;
        int i;
        int shifts = 0;
        if(isSorted(ar)) {
            return shifts;
        } else {
            for (int j = 1; j < ar.length; j++) {
                temp = ar[j];
                for (i = j; (i > 0) && (temp < ar[i - 1]); i--) {
                    ar[i] = ar[i - 1];
                    ar[i - 1] = temp;
                    shifts += 1;
                }
            }
        }
        return shifts;
    }

    private static boolean isSorted(int[] ar) {
        for(int i=ar.length - 1; i>0; i--) {
            if(ar[i] < ar[i-1]) {
                return false;
            }
        }
        return true;
    }

}
