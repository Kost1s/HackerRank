package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import org.junit.Test;

import static org.apache.commons.lang3.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

public class InsertionSortPartTwoTest {

    @Test
    public void arrayIsSorted() throws Exception {
        int[] ar = {1, 4, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPart2(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedNotOneFirst() throws Exception {
        int[] ar = {4, 1, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPart2(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedDirect() throws Exception {
        int[] ar = {1, 4, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPartTwoDirect(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedDirectNotOneFirst() throws Exception {
        int[] ar = {4, 1, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPartTwoDirect(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedSameElements() throws Exception {
        int[] ar = {2, 1, 3, 1, 2};
        InsertionSortPartTwo.insertionSortPart2(ar);
        assertTrue(isSorted(ar));
    }

}
