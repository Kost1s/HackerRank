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

    @Test
    public void printShiftsOfInsertionSortXShifts() throws Exception {
        int[] ar = {6, 3, 2, 5, 7, 4, 8, 1};
        int shifts = InsertionSortAdvancedAnalysis.insertionSortPartTwoDirectShifts(ar);
        assertTrue(shifts == 14);
    }

}
