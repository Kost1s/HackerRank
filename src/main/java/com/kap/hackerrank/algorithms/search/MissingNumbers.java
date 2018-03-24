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
        Arrays.sort(arA);
        Arrays.sort(arB);
        Set<Integer> results = new HashSet<>();

        int j = 0;
        if (arA.length >= arB.length) {
            for (int i = 0; i < arA.length; i++) {
                if ((j < arB.length) && (arA[i] == arB[j])) {
                    j++;
                } else {
                    results.add(arA[i]);
                }
                if ((j >= arB.length) && (arA[i] != arB[arB.length - 1])) {
                    results.add(arA[i]);
                }
            }
        } else {
            for (int i = 0; i < arB.length; i++) {
                if ((j < arA.length) && (arB[i] == arA[j])) {
                    j++;
                } else {
                    results.add(arB[i]);
                }
                if ((j >= arA.length) && (arB[i] != arA[arA.length - 1])) {
                    results.add(arB[i]);
                }
            }
        }

        return new TreeSet<>(results);
    }

}
