package com.kap.hackerrank.algorithms.sorting;

import java.util.*;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class ClosestNumbers {

    public static void main(String[] args) {
        int[] inputAr = readSizeAndElementsOfIntArray();
        int[] result = closestNumbers(inputAr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }

    public static int[] closestNumbers(int[] ar) {
        Arrays.sort(ar);
        return mapDifferences(ar);
    }

    private static int[] mapDifferences(int[] ar) {
        int i = 0;
        Map<Integer, List<Integer>> absDifferences = new HashMap<>();

        while (i < (ar.length - 1)) {
            Integer diff = Math.abs(ar[i] - ar[i + 1]);
            absDifferences.put(diff, addPairs(absDifferences, diff, ar, i));
            i++;
        }

        return diffPairs(absDifferences);
    }

    private static List<Integer> addPairs(Map<Integer, List<Integer>> absDifferences, Integer diff, int[] ar, int i) {
        List<Integer> arrayPairs = new LinkedList<>();

        if(absDifferences.containsKey(diff)) {
            arrayPairs = absDifferences.get(diff);
            arrayPairs.add(ar[i]);
            arrayPairs.add(ar[i + 1]);
        } else {
            arrayPairs.clear();
            arrayPairs.add(ar[i]);
            arrayPairs.add(ar[i + 1]);
        }

        return arrayPairs;
    }

    private static int[] diffPairs(Map<Integer, List<Integer>> diffMap) {
        int minDiff = Collections.min(diffMap.keySet());
        List<Integer> test = diffMap.get(minDiff);
        return test.stream().mapToInt(i->i).toArray();
    }

}
