package com.kap.hackerrank.algorithms.sorting.insertionsort;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InsertionSortAdvancedAnalysisTest {

    @Test
    public void printShiftsOfInsertionSortNoShifts() throws Exception {
        int[] ar = {1, 1, 1, 2, 2};
        int shifts = InsertionSortAdvancedAnalysis.insertionSortPartTwoDirectShifts(ar);
        assertTrue(shifts == 0);
    }

    @Test
    public void printShiftsOfInsertionSortFourShifts() throws Exception {
        int[] ar = {2, 1, 3, 1, 2};
        int shifts = InsertionSortAdvancedAnalysis.insertionSortPartTwoDirectShifts(ar);
        assertTrue(shifts == 4);
    }

}
