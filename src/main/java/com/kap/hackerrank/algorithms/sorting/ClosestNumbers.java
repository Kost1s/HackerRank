package com.kap.hackerrank.algorithms.sorting;

import java.util.*;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class ClosestNumbers {

    public static void main(String[] args) {
        int[] inputAr = readSizeAndElementsOfIntArray();
        int[] result = closestNumbers(inputAr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }

    public static int[] closestNumbers(int[] ar) {
        Arrays.sort(ar);
        return getMinDiffPairs(ar);
    }

    private static int[] getMinDiffPairs(int[] ar) {
        int j = 0;
        int newDiff;
        int prevDiff = Math.abs(ar[j] - ar[j + 1]);
        List<Integer> arrayPairs = new LinkedList<>();

        while (j < (ar.length - 1)) {
            newDiff = Math.abs(ar[j] - ar[j + 1]);

            if(newDiff <= prevDiff) {
                if(newDiff < prevDiff) {
                    arrayPairs.clear();
                }

                prevDiff = newDiff;
                arrayPairs.add(ar[j]);
                arrayPairs.add(ar[j + 1]);
            }
            j++;
        }

        return arrayPairs.stream().mapToInt(i-> i).toArray();
    }
}
