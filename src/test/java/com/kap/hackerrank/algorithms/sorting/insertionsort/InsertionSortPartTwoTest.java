package com.kap.hackerrank.algorithms.sorting.insertionsort;

import org.junit.Test;

import static com.kap.hackerrank.util.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

public class InsertionSortPartTwoTest {

    @Test
    public void arrayIsSortedFirstElementAtTheStartTwoStepsSwapMethod() {
        Comparable[] ar = {1, 4, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPartTwoTwoStepsSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedFirstElementAtTheEndTwoStepsSwapMethod() {
        Comparable[] ar = {4, 2, 3, 5, 6, 1};
        InsertionSortPartTwo.insertionSortPartTwoTwoStepsSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedFirstElementAtTheStartDirectSwapMethod() {
        Comparable[] ar = {1, 4, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPartTwoDirectSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedFirstElementAtTheEndDirectSwapMethod() {
        Comparable[] ar = {4, 2, 3, 5, 6, 1};
        InsertionSortPartTwo.insertionSortPartTwoDirectSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedSameElementsTwoStepsSwapMethod() {
        Comparable[] ar = {2, 1, 3, 1, 2};
        InsertionSortPartTwo.insertionSortPartTwoTwoStepsSwap(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedSameElementsDirectSwapMethod() {
        Comparable[] ar = {2, 1, 3, 1, 2};
        InsertionSortPartTwo.insertionSortPartTwoDirectSwap(ar);
        assertTrue(isSorted(ar));
    }

}
