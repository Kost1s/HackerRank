package com.kap.hackerrank.datastructures.arrays;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class TwoDimensionalArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        scanner.close();
    }

    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i + 1][j + 1];
                for (int k = j; k < (j + 3); k++) {
                    sum += arr[i][j];
                    sum += arr[i+2][j];
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

}
