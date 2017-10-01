package com.kap.hackerrank.algorithms;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfInts = in.nextInt();

        Long sum = 0L;
        for (int i = 0; i < numberOfInts; i++) {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }

}
