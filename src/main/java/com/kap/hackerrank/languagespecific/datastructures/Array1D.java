package com.kap.hackerrank.languagespecific.datastructures;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Array1D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int array[] = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
    }
}
