package com.kap.hackerrank.datastructures;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfInts = in.nextInt();

        int[] array = new int[numberOfInts];
        for (int i = 0; i < numberOfInts; i++) {
            array[i] = in.nextInt();
        }

        for(int i = numberOfInts - 1; i >= 0; i-=1) {
            System.out.print(array[i] + " ");
        }
    }
}
