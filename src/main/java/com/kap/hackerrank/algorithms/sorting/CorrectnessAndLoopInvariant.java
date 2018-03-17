package com.kap.hackerrank.algorithms.sorting;

import static com.kap.hackerrank.util.ArrayUtils.less;
import static com.kap.hackerrank.util.ArrayUtils.printComparableArray;
import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArrayToComparable;

/**
 * @author Konstantinos Antoniou
 */
public class CorrectnessAndLoopInvariant {

    public static void main(String[] args) {
        Comparable[] ar = readSizeAndElementsOfIntArrayToComparable();
        insertionSort(ar);
    }

    public static void insertionSort(Comparable[] a){
        for(int i = 1; i < a.length; i++){
            Comparable value = a[i];
            int j = i;
            while((j > 0) && less(value, a[j-1])  ){
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = value;
        }
        printComparableArray(a);
    }

}
