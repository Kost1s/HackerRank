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

        int[] results = getMissingNumbers(arA, arB);

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + (i != results.length - 1 ? " " : ""));
        }
        System.out.println("");
    }

    public static int[] getMissingNumbers(int[] arA, int[] arB) {
        List<Integer> initialList = new ArrayList<>();

        int countA=0;
        for(int element : arA) {
            if(element == 3685) {
                countA = countA + 1;
            }
            initialList.add(element);
        }

        int countB = 0;
        for(int element : arB) {
            if(element == 3685) {
                countB = countB + 1;
            }
            initialList.add(element);
        }

        int count=0;
        for(Integer element : initialList) {
            if(element == 3685) {
                count = count + 1;
            }
        }

        Map<Integer, Integer> numbersFrequencies = new HashMap<>();
        for (Integer element : initialList) {
            if (!numbersFrequencies.containsKey(element)) {
                numbersFrequencies.put(element, 1);
            } else {
                numbersFrequencies.put(element, numbersFrequencies.get(element) + 1);
            }
        }
        return result(numbersFrequencies);
    }


    private static int[] result(Map<Integer, Integer> numbersFrequencies) {
        List<Integer> result = new ArrayList<>();

        for (Integer element : numbersFrequencies.keySet()) {
            if ((numbersFrequencies.get(element) % 2) != 0) {
                result.add(element);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

}
