package com.kap.hackerrank.algorithms.search;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int trips = in.nextInt();
        for (int t = 0; t < trips; t++) {
            int moneyPooled = in.nextInt();
            int numberOfFlavors = in.nextInt();

            int[] inputAr = new int[numberOfFlavors];
            for (int i = 0; i < numberOfFlavors; i++) {
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
        Map<Integer, List<Integer>> flavorsMap = getFlavorsMap(flavors);
        int[] flavorsNumbers = new int[2];

        Arrays.sort(flavors);
        for (final int flavor : flavors) {
            int diff = moneyPooled - flavor;
            if (flavorsMap.containsKey(diff)) {
                flavorsNumbers[0] = flavorsMap.get(flavor).get(0);
                flavorsNumbers[1] = flavorsMap.get(diff).get(0);
                if (flavorsMap.get(diff).size() > 1) {
                    flavorsNumbers[1] = flavorsMap.get(diff).get(1);
                }
                break;
            }
        }

        Arrays.sort(flavorsNumbers);
        return flavorsNumbers;
    }

    private static Map<Integer, List<Integer>> getFlavorsMap(int[] flavors) {
        Map<Integer, List<Integer>> flavorsMap = new HashMap<>();
        List<Integer> flavorsNumbers;

        for (int i = 0; i < flavors.length; i++) {
            if (!flavorsMap.containsKey(flavors[i])) {
                flavorsMap.put(flavors[i], new ArrayList<>(Collections.singletonList(i + 1)));
            } else {
                flavorsNumbers = flavorsMap.get(flavors[i]);
                flavorsNumbers.add(i + 1);
                flavorsMap.put(flavors[i], flavorsNumbers);
            }
        }
        return flavorsMap;
    }

}
