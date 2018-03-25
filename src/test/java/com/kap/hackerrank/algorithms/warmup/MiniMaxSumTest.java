package com.kap.hackerrank.algorithms.warmup;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class MiniMaxSumTest {

    @Test
    public void miniMaxSumIsTenAndFourteen() {
        int[] ar = {1, 2, 3, 4, 5};

        long[] results = MiniMaxSum.getMiniMaxSum(ar);
        assertTrue(results[0] == 10);
        assertTrue(results[1] == 14);
    }

}
