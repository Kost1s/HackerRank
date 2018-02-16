package com.kap.hackerrank.algorithms.sorting.mergesort;

import static com.kap.hackerrank.util.ArrayUtils.less;
import static com.kap.hackerrank.util.ArrayUtils.showArray;
import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArrayToComparable;

public class MergeSort {

    public static void main(String[] args) {
        Comparable[] ar = readSizeAndElementsOfIntArrayToComparable();
        sort(ar);
        showArray(ar);
    }

    public static void sort(Comparable[] ar) {
        Comparable[] aux = new Comparable[ar.length];
        sort(ar, aux, 0, ar.length - 1);
    }

    private static void sort(Comparable[] ar, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = lo + ((hi - lo) / 2);

        sort(ar, aux, lo, mid);
        sort(ar, aux, mid + 1, hi);
        merge(ar, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] ar, Comparable[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = ar[k];
        }

        // merge back to a[]
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                ar[k] = aux[j++];
            } else if (j > hi) {
                ar[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                ar[k] = aux[j++];
            } else {
                ar[k] = aux[i++];
            }
        }
    }

}
