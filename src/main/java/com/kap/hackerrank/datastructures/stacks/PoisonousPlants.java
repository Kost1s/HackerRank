package com.kap.hackerrank.datastructures.stacks;

import java.util.Stack;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class PoisonousPlants {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();
        System.out.println(countDays(ar));
    }

    public static int countDays(int[] ar) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        int days = 0;
        int dMax = 0;
        boolean firstTime = true;
        for (int i = 0; i < ar.length; i++) {
            if (!s1.isEmpty() && (ar[i] > s1.peek())) {
                if(s2.isEmpty() && firstTime) {
                    days++;
                    firstTime = false;
                }
                if(!s2.isEmpty() && (ar[i] <= s2.peek())) {
                    days++;
                }
                s2.push(ar[i]);
                dMax = getMaxDays(days, dMax);
            }

            if(!s1.isEmpty() && (ar[i] <= s1.peek())) {
                dMax = getMaxDays(days, dMax);
                days = 0;
                s1.push(ar[i]);
            }

            if(s1.isEmpty()) {
                s1.push(ar[i]);
            }
        }

        return dMax;
    }

    private static int getMaxDays(int days, int max) {
        if (days > max) {
            return days;
        }
        return max;
    }
}
