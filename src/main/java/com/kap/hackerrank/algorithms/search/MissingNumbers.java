package com.kap.hackerrank.algorithms.search;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class MissingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sizeA = in.nextInt();
        int[] arA = new int[sizeA];
        for (int i = 0; i < sizeA; i++) {
            arA[i] = in.nextInt();
        }

        int sizeB = in.nextInt();
        int[] arB = new int[sizeB];
        for (int i = 0; i < sizeB; i++) {
            arB[i] = in.nextInt();
        }
        in.close();

        Set<Integer> results = getMissingNumbers(arA, arB);

        for (Integer result : results) {
            System.out.print(result + " ");
        }
        System.out.println("");


    }

    public static Set<Integer> getMissingNumbers(int[] arA, int[] arB) {
        if (arA.length >= arB.length) {
            return getResults(arA, arB);
        } else {
            return getResults(arB, arA);
        }
    }

    private static Set<Integer> getResults(int[] lArray, int[] sArray) {
        Set<Integer> results = new HashSet<>();

        Arrays.sort(lArray);
        Arrays.sort(sArray);

        int j = 0;
        if (lArray.length >= sArray.length) {
            for (int i = 0; i < lArray.length; i++) {
                if ((j < sArray.length) && (lArray[i] == sArray[j])) {
                    j++;
                } else {
                    results.add(lArray[i]);
                }
                if ((j >= sArray.length) && (lArray[i] != sArray[sArray.length - 1])) {
                    results.add(lArray[i]);
                }
            }

        }
        return new TreeSet<>(results);
    }

}
