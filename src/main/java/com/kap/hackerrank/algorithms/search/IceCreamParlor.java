package com.kap.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

/**
 * @author Konstantinos Antoniou
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int trips = in.nextInt();
        for(int t = 0; t < trips; t++){
            int moneyPooled = in.nextInt();
            int numberOfFlavors = in.nextInt();

            int[] inputAr = new int[numberOfFlavors];
            for(int i = 0; i < numberOfFlavors; i++){
                inputAr[i] = in.nextInt();
            }

            int[] result = getFlavorNumbers(moneyPooled, inputAr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }

    public static int[] getFlavorNumbers(int moneyPooled, int[] flavorsCosts) {
        int[] flavorsCostSorted = new int[flavorsCosts.length];
        int[] flavorsNumbers = new int[2];

        System.arraycopy( flavorsCosts, 0, flavorsCostSorted, 0, flavorsCosts.length );

        Arrays.sort(flavorsCostSorted);
        for(int i=0; i<flavorsCosts.length; i++) {
            int secondFlavorIndex = binarySearch(flavorsCostSorted, (moneyPooled-flavorsCostSorted[i]));
            if(secondFlavorIndex != -1) {
                flavorsNumbers[0] = (i+1);
                flavorsNumbers[1] = (secondFlavorIndex+1);
            }
        }
        return flavorsNumbers;
    }

}
