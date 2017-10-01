package com.kap.hackerrank.algorithms.sorting;

import javax.swing.text.Style;
import javax.xml.transform.stream.StreamSource;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] unsorted = new String[n];
        //BigInteger[] unsorted = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = in.next();
        }

        //Arrays.stream(unsorted).sorted(Comparator.comparing()).forEach(System.out.println());

        /*Arrays.sort(unsorted);
        for (int i = 0; i < n; i++) {
            System.out.println(unsorted[i]);
        }*/

    }

}
