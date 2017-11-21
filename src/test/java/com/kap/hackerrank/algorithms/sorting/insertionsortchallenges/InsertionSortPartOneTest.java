package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InsertionSortPartOneTest {

    private boolean isSorted(int[] ar) {
        for(int i=1; i < ar.length; i++) {
            if(ar[i-1] > ar[i]) {
                return false;
            }
        }
        return true;
    }

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
