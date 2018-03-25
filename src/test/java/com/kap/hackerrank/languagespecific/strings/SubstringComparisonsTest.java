package com.kap.hackerrank.languagespecific.strings;

import com.kap.hackerrank.languagespecific.strings.SubstringComparisons;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class SubstringComparisonsTest {

    @Test
    public void testSubstringLenghtThree() {
        String s = "welcometojava";
        int k = 3;

        List<String> result = SubstringComparisons.getSmallestAndLargest(s, k);
        assertTrue(result.get(0).equals("ava"));
        assertTrue(result.get(result.size() - 1).equals("wel"));
    }

}
