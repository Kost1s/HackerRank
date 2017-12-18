package com.kap.hackerrank.algorithms.sorting.insertionsort;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InsertionSortAdvancedAnalysisExperimentTest {

    @Test
    public void printShiftsOfInsertionSortNoShifts() {
        Comparable[] ar = {1, 1, 1, 2, 2};
        assertTrue(InsertionSortAdvancedAnalysisExperiment.sortTest(ar) == 0);
    }

    @Test
    public void printShiftsOfInsertionSortFourShifts() {
        Comparable[] ar = {2, 1, 3, 1, 2};
        assertTrue(InsertionSortAdvancedAnalysisExperiment.sortTest(ar) == 4);
    }

    @Test
    public void printShiftsOfInsertionSortFourteenShifts() {
        Comparable[] ar = {6, 3, 2, 5, 7, 4, 8, 1};
        assertTrue(InsertionSortAdvancedAnalysisExperiment.sortTest(ar) == 14);
    }
}
