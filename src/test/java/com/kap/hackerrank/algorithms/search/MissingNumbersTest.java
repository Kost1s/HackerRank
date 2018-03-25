package com.kap.hackerrank.algorithms.search;

import org.junit.Test;

import java.util.Set;

/**
 * @author Konstantinos Antoniou
 */
public class MissingNumbersTest {

    @Test
    public void missingNumbersAreThreeArrayBLargerThanA() {
        int[] arA = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] arB = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        Set<Integer> results = MissingNumbers.getMissingNumbers(arA, arB);
        for (Integer result : results) {
            System.out.print(result + " ");
        }
    }

    @Test
    public void missingNumbersAreThreeArrayALargerThanB() {
        int[] arB = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] arA = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        Set<Integer> results = MissingNumbers.getMissingNumbers(arA, arB);
        for (Integer result : results) {
            System.out.print(result + " ");
        }
    }
}
