package com.kap.hackerrank.algorithms.search;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PairsTest {

    @Test
    public void pairsAreThree() {
        int[] ar = {1, 5, 3, 4, 2};

        int result = Pairs.getPairs(2, ar);
        assertTrue(result == 3);
    }

}
