package com.kap.hackerrank.algorithms.sorting.insertionsortchallenges;

import java.util.Scanner;

public class InsertionSortPartOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void insertIntoSorted(int[] ar) {
        int temp = ar[ar.length - 1];
        for(int i = ar.length - 1; i > 0; i--) {
            if (temp < ar[i-1]) {
                ar[i] = ar[i-1];
            } else {
                ar[i] = temp;
                break;
            }
            printArray(ar);
        }

        if(temp < ar[0]) {
            ar[0] = temp;
        }
        printArray(ar);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
