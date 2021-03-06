package com.kap.hackerrank.algorithms.sorting.insertionsort;

import java.util.Scanner;

import static com.kap.hackerrank.util.ArrayUtils.less;

public class InsertionSortAdvancedAnalysis {

    private static long inversions;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();

        for(int q=0; q < queries; q++) {
            inversions = 0;
            int s = sc.nextInt();
            Comparable[] ar = new Comparable[s];
            for (int i = 0; i < s; i++) {
                ar[i] = sc.nextInt();
            }
            sort(ar);
            System.out.println(inversions);
        }
    }

    // test only method
    public static long sortTest(Comparable[] ar) {
        inversions = 0;
        Comparable[] aux = new Comparable[ar.length];
        sort(ar, aux, 0, ar.length-1);
        return inversions;
    }

    public static void sort(Comparable[] ar) {
        Comparable[] aux = new Comparable[ar.length];
        sort(ar, aux, 0, ar.length-1);
    }

    private static void sort(Comparable[] ar, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + ((hi - lo) / 2);

        sort(ar, aux, lo, mid);
        sort(ar, aux, mid + 1, hi);
        inversions += merge(ar, aux, lo, mid, hi);
    }

    private static long merge(Comparable[] ar, Comparable[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = ar[k];
        }

        // merge back to a[] and count inversions during merge
        int s = 0;
        long inv = 0;
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid) {
                ar[k] = aux[j++];
                s++;
            } else if (j > hi) {
                ar[k] = aux[i++];
                inv += s;
            }  else if (less(aux[j], aux[i])) {
                ar[k] = aux[j++];
                s++;
            } else {
                ar[k] = aux[i++];
                inv += s;
            }
        }

        return inv;
    }

}
