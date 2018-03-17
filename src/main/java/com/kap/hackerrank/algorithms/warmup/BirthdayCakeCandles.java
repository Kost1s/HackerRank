package com.kap.hackerrank.algorithms.warmup;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }

        int result = getBirthdayCakeCandles(ar);
        System.out.println(result);
    }

    public static int getBirthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int candles=0;
        for(int i=ar.length-1; i>=0; i--) {
            if(ar[i] == ar[(ar.length - 1)]) {
                candles++;
            }
        }
        return candles;
    }

}
