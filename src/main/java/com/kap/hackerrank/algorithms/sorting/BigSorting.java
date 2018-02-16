package com.kap.hackerrank.algorithms.sorting;

import java.math.BigInteger;
import java.util.*;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfStringArray;

public class BigSorting {

    public static void main(String[] args) {
        String[] unsorted = readSizeAndElementsOfStringArray();

        Comparator<String> numericStringComparator = (String a, String b) -> {
            int compareLength = a.length() - b.length();
            if(compareLength == 0) {
                BigInteger bia = new BigInteger(a);
                BigInteger bib = new BigInteger(b);
                return bia.compareTo(bib);
            }
            return compareLength;
        };

        Arrays.stream(unsorted).sorted(numericStringComparator).forEach(System.out::println);
    }

}
