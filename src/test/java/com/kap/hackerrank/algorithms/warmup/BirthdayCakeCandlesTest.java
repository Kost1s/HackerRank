package com.kap.hackerrank.algorithms.warmup;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class BirthdayCakeCandlesTest {

    @Test
    public void candlesAreTwo() {
        int[] ar = {3, 2, 1, 3};
        int result = BirthdayCakeCandles.getBirthdayCakeCandles(ar);
        assertTrue(result == 2);
    }

}
