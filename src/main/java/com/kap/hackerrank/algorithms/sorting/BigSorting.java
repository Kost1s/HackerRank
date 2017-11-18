package com.kap.hackerrank.algorithms.sorting;

import java.math.BigInteger;
import java.util.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = in.next();
        }

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
