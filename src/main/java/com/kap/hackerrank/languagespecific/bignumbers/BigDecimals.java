package com.kap.hackerrank.languagespecific.bignumbers;

import java.math.BigDecimal;
import java.util.*;

import static com.kap.hackerrank.util.ArrayUtils.showStringArray;
import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfStringArray;

/**
 * @author Konstantinos Antoniou
 */
public class BigDecimals {

    public static void main(String[] args) {
        String[] ar = readSizeAndElementsOfStringArray();
        String[] result = getSortedStrings(ar);
        showStringArray(result);
    }

    public static String[] getSortedStrings(String[] ar) {
        Map<BigDecimal, List<String>> decimalStrings = new HashMap<>();
        List<String> equalDecimals;

        for (String decimalString : ar) {
            BigDecimal bigDecimalString = BigDecimal.valueOf(Double.valueOf(decimalString));
            if (!decimalStrings.containsKey(bigDecimalString)) {
                decimalStrings.put(bigDecimalString, new ArrayList<>(Arrays.asList(decimalString)));
            } else {
                equalDecimals = decimalStrings.get(bigDecimalString);
                equalDecimals.add(decimalString);
                decimalStrings.put(bigDecimalString, equalDecimals);
            }
        }
        return sortDecimalStrings(decimalStrings);
    }

    private static String[] sortDecimalStrings(Map<BigDecimal, List<String>> decimalStrings) {
        Map<BigDecimal, List<String>> sortedDecimalStrings = new TreeMap<>(Collections.reverseOrder());
        sortedDecimalStrings.putAll(decimalStrings);

        return sortedDecimalStrings.entrySet()
                                   .stream()
                                   .map(Map.Entry::getValue)
                                   .flatMap(Collection::stream).toArray(String[]::new);

    }

}
