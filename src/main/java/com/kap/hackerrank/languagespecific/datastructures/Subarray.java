package com.kap.hackerrank.languagespecific.datastructures;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Subarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int subarraysNo = 0;
        for(int i = 0; i < arraySize; i++) {
            int subArraySum = 0;
            for(int j = i; j < arraySize; j++) {
                subArraySum = subArraySum + array[j];
                if(subArraySum < 0) {
                    subarraysNo = subarraysNo + 1;
                }
            }
        }
        System.out.println(subarraysNo);
    }

}
