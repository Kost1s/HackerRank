package com.kap.hackerrank.algorithms.sorting;

import java.util.Scanner;

import static com.kap.hackerrank.Utils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class CorrectnessAndLoopInvariant {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();
        insertionSort(ar);
    }

    public static void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++){
            int value = a[i];
            int j = i;
            while((j > 0) && (a[j-1] > value)){
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = value;
        }
        printArray(a);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }

}
