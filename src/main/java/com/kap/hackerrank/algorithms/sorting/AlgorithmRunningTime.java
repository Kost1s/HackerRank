package com.kap.hackerrank.algorithms.sorting;

import static com.kap.hackerrank.Utils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class AlgorithmRunningTime {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();
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
