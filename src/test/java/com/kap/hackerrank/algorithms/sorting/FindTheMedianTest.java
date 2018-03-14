package com.kap.hackerrank.algorithms.sorting;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class FindTheMedianTest {

    @Test
    public void medianIsThree() {
        int[] ar = {0, 1, 2, 4, 6, 5, 3};
        int median = FindTheMedian.findMedian(ar);
        assertTrue(median == 3);
    }

}
