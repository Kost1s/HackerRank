package com.kap.hackerrank.languagespecific.datastructures;

import com.kap.hackerrank.languagespecific.datastructures.HSet;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class HSetTest {

    @Test
    public void uniquePairsAreThree() {
        String[] pairLeft = {"john", "john", "john", "mary", "mary"};
        String[] pairRight = {"tom", "mary", "tom", "anna", "anna"};

        int result = HSet.getUniquePairsNumber(pairLeft, pairRight);
        assertTrue(result == 3);
    }

}
