package com.kap.hackerrank.algorithms.warmup;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = getResult(getBirthdayCakeCandles(sc, n));
        System.out.println(result);
    }

    private static Map<Integer, Integer> getBirthdayCakeCandles(Scanner sc, int arraySize) {
        Map<Integer, Integer> heightsMap = new HashMap<>();

        for (int i = 0; i < arraySize; i++) {
            int height = sc.nextInt();
            if (!heightsMap.containsKey(height)) {
                heightsMap.put(height, 1);
            } else {
                int no = heightsMap.get(height);
                heightsMap.put(height, no + 1);
            }
        }
        return heightsMap;
    }

    private static int getResult(Map<Integer, Integer> heightsMap) {
        int max = Collections.max(heightsMap.keySet());
        return  heightsMap.get(max);
    }

}
