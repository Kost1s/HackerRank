package com.kap.hackerrank;

import com.kap.hackerrank.algorithms.sorting.AlgorithmRunningTime;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class AlgorithmRunningTimeTest {

    @Test
    public void arrayIsSortedSameElements() {
        Comparable[] ar = {2, 1, 3, 1, 2};
        int shifts = AlgorithmRunningTime.insertionSortPart2(ar);
        assertTrue(shifts == 4);
    }

}
