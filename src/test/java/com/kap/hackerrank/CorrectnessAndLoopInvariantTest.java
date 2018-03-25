package com.kap.hackerrank;

import com.kap.hackerrank.algorithms.sorting.CorrectnessAndLoopInvariant;
import org.junit.Test;

import static com.kap.hackerrank.util.ArrayUtils.isSorted;
import static org.junit.Assert.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class CorrectnessAndLoopInvariantTest {

    @Test
    public void arrayIsSorted() {
        Comparable[] ar = {4, 1, 3, 5, 6, 2};
        CorrectnessAndLoopInvariant.insertionSort(ar);
        assertTrue(isSorted(ar));
    }
}
