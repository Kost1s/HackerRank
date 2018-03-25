package com.kap.hackerrank.algorithms.warmup;

import java.util.Arrays;

import static com.kap.hackerrank.util.ArrayUtils.printLongArray;
import static com.kap.hackerrank.util.IOUtils.readLineOfStringsAndConvertToIntArrayOfGivenSize;

/**
 * @author Konstantinos Antoniou
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        int[] ar = readLineOfStringsAndConvertToIntArrayOfGivenSize(5);

        long[] results = getMiniMaxSum(ar);
        printLongArray(results);
    }

    public static long[] getMiniMaxSum(int[] ar) {
        long[] results = new long[2];

        Arrays.sort(ar);

        long miniSum=0;
        for(int i=0; i<=3; i++) {
            miniSum += ar[i];
        }

        long  maxSum=0;
        for(int i = ar.length-1; i>=1; i--){
            maxSum += ar[i];
        }

        results[0] = miniSum;
        results[1] = maxSum;

        return results;
    }

}
