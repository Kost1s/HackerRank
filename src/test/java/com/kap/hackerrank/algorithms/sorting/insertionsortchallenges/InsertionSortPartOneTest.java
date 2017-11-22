package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import org.junit.Test;

import static org.apache.commons.lang3.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

public class InsertionSortPartOneTest {

    @Test
    public void arrayIsSortedElementOneBeforeTheEnd() throws Exception {
        int[] ar = {2, 4, 6, 8, 3};
        InsertionSortPartOne.insertIntoSorted(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedElementExactlyTheEnd() throws Exception {
        int[] ar = {2, 4, 6, 8, 1};
        InsertionSortPartOne.insertIntoSorted(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedElementOneBeforeTheEndDirectMethod() throws Exception {
        int[] ar = {2, 4, 6, 8, 3};
        InsertionSortPartOne.insertIntoSortedDirect(ar);
        assertTrue(isSorted(ar));
    }

    @Test
    public void arrayIsSortedElementExactlyTheEndDirectMethod() throws Exception {
        int[] ar = {2, 4, 6, 8, 1};
        InsertionSortPartOne.insertIntoSortedDirect(ar);
        assertTrue(isSorted(ar));
    }

}
