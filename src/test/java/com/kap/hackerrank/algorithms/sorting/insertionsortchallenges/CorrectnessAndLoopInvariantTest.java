package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import org.junit.Test;

import static org.apache.commons.lang3.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class CorrectnessAndLoopInvariantTest {

    @Test
    public void arrayIsSorted() throws Exception {
        int[] ar = {4, 1, 3, 5, 6, 2};
        CorrectnessAndLoopInvariant.insertionSort(ar);
        assertTrue(isSorted(ar));
    }
}
