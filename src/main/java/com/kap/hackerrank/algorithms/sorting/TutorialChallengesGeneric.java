package com.kap.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class TutorialChallengesGeneric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int element = sc.nextInt();
        int arraySize = sc.nextInt();

        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(sc.next());
            if(array[i] == element) {
                System.out.println(i);
                break;
            }
        }
    }
}
