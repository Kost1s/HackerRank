package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

import static com.kap.hackerrank.util.IOUtils.readSizeAndElementsOfIntArray;

/**
 * @author Konstantinos Antoniou
 */
public class PoisonousPlants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int size = sc.nextInt();
        for(int i =0; i< size; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println(countDays(stack));
    }

    public static int countDays(Stack<Integer> baseStack) {
        Stack<Integer> auxStack = new Stack<>();

        int dMax = 0;
        int days = 0;
        while(!baseStack.isEmpty()) {
            if(!auxStack.isEmpty()) {
                if(baseStack.peek() >= auxStack.peek()) {
                    dMax = getMaxDays(days, dMax);
                    days = 0;
                } else {
                    while(!baseStack.isEmpty() && !auxStack.isEmpty() && (baseStack.peek() < auxStack.peek())) {
                        days++;
                        auxStack.pop();
                    }
                }
            }
            auxStack.push(baseStack.pop());
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
