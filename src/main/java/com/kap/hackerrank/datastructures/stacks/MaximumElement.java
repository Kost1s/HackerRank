package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<StackNode> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        int nodeValue;

        int queriesNo = sc.nextInt();
        for (int i = 0; i < queriesNo; i++) {
            int instruction = sc.nextInt();
            if (instruction == 1) {
                nodeValue = sc.nextInt();
                if (nodeValue > max) {
                    max = nodeValue;
                }
                stack.push(new StackNode(nodeValue, max));
            } else if ((instruction == 2) && !stack.empty()) {
                stack.pop();
                if (stack.empty()) {
                    max = Integer.MIN_VALUE;
                } else {
                    max = stack.peek().currentMaxValue;
                }
            } else if ((instruction == 3) && !stack.empty()) {
                System.out.println(max);
            }
        }
        sc.close();
    }

    private static class StackNode {
        int value;
        int currentMaxValue;

        private StackNode(int value, int currentMaxValue) {
            this.value = value;
            this.currentMaxValue = currentMaxValue;
        }
    }

}

