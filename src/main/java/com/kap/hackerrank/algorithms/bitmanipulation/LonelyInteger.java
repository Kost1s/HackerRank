package com.kap.hackerrank.algorithms.bitmanipulation;

import java.util.HashSet;
import java.util.Set;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class LonelyInteger {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();

        Set<Integer> result = getLonelyInteger(ar);

        for (Integer element : result) {
            System.out.print(element + " ");
        }
    }

    public static Set<Integer> getLonelyInteger(int[] ar) {
        Set<Integer> result = new HashSet<>();

        for(int element : ar) {
            if(result.contains(element)) {
                result.remove(element);
            } else {
                result.add(element);
            }
        }

        return result;
    }

}
