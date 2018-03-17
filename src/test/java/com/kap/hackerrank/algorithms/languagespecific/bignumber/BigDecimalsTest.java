package com.kap.hackerrank.algorithms.languagespecific.bignumber;

import com.kap.hackerrank.languagespecific.bignumbers.BigDecimals;
import org.junit.Test;

import static com.kap.hackerrank.util.ArrayUtils.showStringArray;

/**
 * @author Konstantinos Antoniou
 */
public class BigDecimalsTest {

    @Test
    public void resultContainsOrder() {
        String[] ar = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        String[] result = BigDecimals.getSortedStrings(ar);
        showStringArray(result);
    }

}
