package com.kap.hackerrank.algorithms.sorting;

import java.util.Arrays;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class FindTheMedian {

    public static void main(String[] args) {
        int[] inputAr = readSizeAndElementsOfIntArray();
        int result = findMedian(inputAr);
        System.out.println(result);
    }

    public static int findMedian(int[] ar) {
        Arrays.sort(ar);
        return ar[(ar.length/2)];
    }
}
