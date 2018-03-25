package com.kap.hackerrank.algorithms.bitmanipulation;

import org.junit.Test;

import java.util.Set;

/**
 * @author Konstantinos Antoniou
 */
public class LonelyIntegerTest {

    @Test
    public void arraySizeIsThreeAndResultIsTwo() {
        int[] ar = {1, 1, 2};

        Set<Integer> result = LonelyInteger.getLonelyInteger(ar);

        for (Integer element : result) {
            System.out.print(element + " ");
        }
    }

    @Test
    public void arraySizeIsFiveAndResultIsTwo() {
        int[] ar = {0, 0, 1, 2, 1};

        Set<Integer> result = LonelyInteger.getLonelyInteger(ar);

        for (Integer element : result) {
            System.out.print(element + " ");
        }
    }
}
