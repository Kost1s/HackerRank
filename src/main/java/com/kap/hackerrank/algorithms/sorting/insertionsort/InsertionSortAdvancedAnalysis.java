package com.kap.hackerrank.algorithms.sorting.insertionsort;

import static com.kap.hackerrank.ArrayUtils.less;

public class InsertionSortAdvancedAnalysis {

    private static int inversions;

    public static void main(String[] args) {
        Comparable[] a = {6, 3, 2, 5, 7, 4, 8, 1};
        sort(a);
        System.out.println(inversions);
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + ((hi - lo) / 2);

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        inversions += merge(a, aux, lo, mid, hi);
    }

    private static int merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // merge back to a[] and count inversions during merge
        int s = 0;
        int inv = 0;
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid) {
                a[k] = aux[j++];
                s++;
            } else if (j > hi) {
                a[k] = aux[i++];
                inv += s;
            }  else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
                s++;
            } else {
                a[k] = aux[i++];
                inv += s;
            }
        }

        return inv;
    }

}
