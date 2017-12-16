package com.kap.hackerrank.algorithms.sorting.insertionsort;

import org.junit.Test;

import static org.apache.commons.lang3.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

public class InsertionSortPartOneTest {

    @Test
    public void arrayIsSortedFirstElementAtTheStartTwoStepsSwapMethod() {
        Comparable[] ar = {2, 4, 6, 8, 3};
        InsertionSortPartOne.insertIntoSortedPartOneTwoStepsSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedFirstElementAtTheEndTwoStepsSwapMethod() {
        Comparable[] ar = {2, 4, 6, 8, 1};
        InsertionSortPartOne.insertIntoSortedPartOneTwoStepsSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedFirstElementAtTheStartDirectSwapMethod() {
        Comparable[] ar = {2, 4, 6, 8, 3};
        InsertionSortPartOne.insertIntoSortedPartOneDirectSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedFirstElementAtTheEndDirectSwapMethod() {
        Comparable[] ar = {2, 4, 6, 8, 1};
        InsertionSortPartOne.insertIntoSortedPartOneDirectSwap(ar);
        assertTrue(isSorted(ar));
    }

}
