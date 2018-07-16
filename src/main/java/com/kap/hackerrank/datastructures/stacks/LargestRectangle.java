package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class LargestRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxHeight = Integer.MIN_VALUE;
        int height;
        int position = 0;
        int lastPosition = 0;

        Stack<Integer> pStack = new Stack<>();
        Stack<Integer> hStack = new Stack<>();

        int currentHeight;
        int buildingsNo = sc.nextInt();
        for (int i = 0; i < buildingsNo; i++) {
            currentHeight = sc.nextInt();

            if ((hStack.isEmpty()) || (!hStack.isEmpty() && (currentHeight >= hStack.peek()))) {
                pushToStacks(pStack, hStack, position, currentHeight);
                position++;
            }

            if (!hStack.isEmpty() && (currentHeight < hStack.peek())) {
                while (!hStack.isEmpty() && (currentHeight < hStack.peek())) {
                    lastPosition = pStack.pop();
                    height = hStack.pop() * (position - lastPosition);
                    maxHeight = getMaxHeight(height, maxHeight);
                }
                pushToStacks(pStack, hStack, lastPosition, currentHeight);
                position++;
            }

        }

        while(!hStack.isEmpty()) {
            height = hStack.pop() * (position - pStack.pop());
            maxHeight = getMaxHeight(height, maxHeight);
        }

        System.out.println(maxHeight);
    }

    private static int getMaxHeight(int height, int maxHeight) {
        if (height > maxHeight) {
            return height;
        }
        return maxHeight;
    }

    private static void pushToStacks(Stack<Integer> pStack, Stack<Integer> hStack, int position, int currentHeight) {
        hStack.push(currentHeight);
        pStack.push(position);
    }

}




