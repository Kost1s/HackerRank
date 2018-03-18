package com.kap.hackerrank.algorithms.search;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MissingNumbersTest {

    @Test
    public void missingNumbersAreThree() {
        int[] arA = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] arB = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int[] result = MissingNumbers.getMissingNumbers(arA, arB);
        assertTrue(result[0] == 204);
        assertTrue(result[1] == 205);
        assertTrue(result[2] == 206);
    }
}
