package com.kap.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class CorrectnessAndLoopInvariant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
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
