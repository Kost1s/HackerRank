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
                hStack.push(currentHeight);
                pStack.push(position);
                position++;
            }

            if (!hStack.isEmpty() && (currentHeight < hStack.peek())) {
                while (!hStack.isEmpty() && (currentHeight < hStack.peek())) {
                    lastPosition = pStack.pop();
                    height = hStack.pop() * (position - lastPosition);
                    if (height > maxHeight) {
                        maxHeight = height;
                    }
                }
                hStack.push(currentHeight);
                pStack.push(lastPosition);
                position++;
            }

        }

        while(!hStack.isEmpty()) {
            height = hStack.pop() * (position - pStack.pop());
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        System.out.println(maxHeight);
    }

}




