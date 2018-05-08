package com.kap.hackerrank.datastructures.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class EqualStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Stack<StackNode>> stacks = new ArrayList<>();

        int[] stacksCapacity = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        int stackValue;

        for (int stackCapacity : stacksCapacity) {
            Stack<StackNode> stack = new Stack<>();
            int currentSum = 0;
            for (int i = 0; i < stackCapacity; i++) {
                stackValue = sc.nextInt();
                currentSum += stackValue;
                stack.push(new StackNode(stackValue, currentSum));
            }
            stacks.add(stack);
        }
    }

    private static class StackNode {
        int nodeValue;
        int currentSum;

        private StackNode(int nodeValue, int currentSum) {
            this.nodeValue = nodeValue;
            this.currentSum = currentSum;
        }
    }

}
