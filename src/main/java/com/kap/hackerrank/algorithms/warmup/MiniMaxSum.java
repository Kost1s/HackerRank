package com.kap.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

import static com.kap.hackerrank.util.ArrayUtils.printLongArray;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arItems = scan.nextLine().split(" ");

        int[] ar = new int[5];
        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arItems[i].trim());
            ar[i] = arrItem;
        }

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
