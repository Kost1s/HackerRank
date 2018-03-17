package com.kap.hackerrank.algorithms.warmup;

import java.util.*;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();
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
