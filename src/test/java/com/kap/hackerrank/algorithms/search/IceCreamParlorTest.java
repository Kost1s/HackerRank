package com.kap.hackerrank.algorithms.search;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class IceCreamParlorTest {

    @Test
    public void flavorsNumbersAreOneAndFour() {
        int[] flavorsCosts = {1, 4, 5, 3, 2};
        int moneyPooled = 4;

        int[] result = IceCreamParlor.getFlavorNumbers(moneyPooled, flavorsCosts);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == 4);
    }

    @Test
    public void flavorsNumbersAreOneAndTwo() {
        int[] flavorsCosts = {2, 2, 4, 3};
        int moneyPooled = 4;

        int[] result = IceCreamParlor.getFlavorNumbers(moneyPooled, flavorsCosts);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == 4);
    }
}
