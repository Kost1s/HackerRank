package com.kap.hackerrank.algorithms.search;

import java.util.*;

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

    public static int[] getFlavorNumbers(int moneyPooled, int[] flavors) {
        Map<Integer, List<Integer>> flavorsMap;
        int[] flavorsCosts;
        int[] flavorNumbers =  new int[2];


        flavorsMap = getFlavorsMap(flavors);
        flavorsCosts = getFlavorCosts(moneyPooled, flavors);

        if(flavorsCosts[0] != flavorsCosts[1]) {
            flavorNumbers[0] = flavorsMap.get(flavorsCosts[0]).get(0);
            flavorNumbers[1] = flavorsMap.get(flavorsCosts[1]).get(0);
        } else {
            flavorNumbers[0] = flavorsMap.get(flavorsCosts[0]).get(0);
            flavorNumbers[1] = flavorsMap.get(flavorsCosts[1]).get(1);
        }
        return flavorNumbers;
    }


    private static Map<Integer, List<Integer>> getFlavorsMap(int[] flavors) {
        Map<Integer, List<Integer>> flavorsMap = new HashMap<>();
        List<Integer> flavorsNumbers;

        for(int i=0; i<flavors.length; i++) {

            if(!flavorsMap.containsKey(flavors[i])) {
                flavorsMap.put(flavors[i], new ArrayList<>(Collections.singletonList(i+1)));
            } else {
                flavorsNumbers = flavorsMap.get(flavors[i]);
                flavorsNumbers.add(i+1);
                flavorsMap.put(flavors[i], flavorsNumbers);
            }
        }
        return flavorsMap;
    }

    private static int[] getFlavorCosts(int moneyPooled, int[] flavorsCosts) {
        int[] flavorsNumbers = new int[2];

        Arrays.sort(flavorsCosts);
        for(int i=0; i<flavorsCosts.length; i++) {
            int secondFlavorIndex = binarySearch(flavorsCosts, (moneyPooled-flavorsCosts[i]));
            if((secondFlavorIndex != -1) && (i != secondFlavorIndex) ) {
                flavorsNumbers[0] =  flavorsCosts[i];
                flavorsNumbers[1] =  flavorsCosts[secondFlavorIndex];
                break;
            }
        }
        return flavorsNumbers;
    }

}
