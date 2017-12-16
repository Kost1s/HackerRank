package com.kap.hackerrank.algorithms.sorting.mergesort;

import org.junit.Test;

import static org.apache.commons.lang3.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {

    @Test
    public void arrayIsSorted() {
        Comparable[] ar = {6, 3, 2, 5, 7, 4, 8, 1};
        MergeSort.sort(ar);
        assertTrue(isSorted(ar));
    }

}
