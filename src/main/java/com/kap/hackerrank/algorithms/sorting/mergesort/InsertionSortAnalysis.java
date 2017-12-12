package com.kap.hackerrank.algorithms.sorting.mergesort;

public class InsertionSortAnalysis {

    private static int inversions;

    public static void main(String[] args) {
        Comparable[] a = {6, 3, 2, 5, 7, 4, 8, 1};
        sort(a);
        System.out.println(inversions);
    }

    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static int merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // precondition: a[lo .. mid] and a[mid+1 .. hi] are sorted subarrays
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int s = 0;
        int inv = 0;
        // merge back to a[]
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

        // postcondition: a[lo .. hi] is sorted
        assert isSorted(a, lo, hi);
        return inv;
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + ((hi - lo) / 2);

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        inversions += merge(a, aux, lo, mid, hi);
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
        assert isSorted(a);
    }


    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /***************************************************************************
     *  Check if array is sorted - useful for debugging.
     ***************************************************************************/
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
