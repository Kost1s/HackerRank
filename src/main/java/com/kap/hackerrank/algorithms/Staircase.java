package com.kap.hackerrank.algorithms;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int staircaseSize = scanner.nextInt();

        for(int i = 1; i <= staircaseSize; i++) {
            for(int k = 0; k < staircaseSize - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
