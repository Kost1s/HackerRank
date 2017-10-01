package com.kap.hackerrank.algorithms;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int rDimension = in.nextInt();
        int[][] array = new int[rDimension][rDimension];

        int posMedian = 0;
        if((rDimension % 2) != 0) {
            posMedian = (rDimension - 1) / 2;
        }

        int sumPrimary = 0;
        int sumSecondary = 0;
        for(int i = 0; i < rDimension; i++) {
            for(int j = 0; j < rDimension; j++) {
                array[i][j] = in.nextInt();

                if(i == j) {
                    sumPrimary = sumPrimary + array[i][j];
                }

                if (i == j && i == posMedian && posMedian != 0) {
                    sumSecondary = sumSecondary + array[i][j];
                }

                if(i < j && (rDimension - 1) - j == i) {
                    sumSecondary = sumSecondary + array[i][j];
                }

                if(i > j && (rDimension - 1) - i == j) {
                    sumSecondary = sumSecondary + array[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumPrimary - sumSecondary));
    }

}
