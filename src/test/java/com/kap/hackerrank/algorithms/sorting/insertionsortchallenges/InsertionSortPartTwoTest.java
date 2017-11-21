package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InsertionSortPartTwoTest {

    private boolean isSorted(int[] ar) {
        for(int i=1; i < ar.length; i++) {
            if(ar[i-1] > ar[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void arrayIsSorted() throws Exception {
        int[] ar = {1, 4, 3, 5, 6, 2};
        InsertionSortPartTwo.insertionSortPart2(ar);
        assertTrue(isSorted(ar));
    }

}
