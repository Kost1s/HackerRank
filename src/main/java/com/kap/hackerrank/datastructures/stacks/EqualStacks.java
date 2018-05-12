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
        List<Stack<StackNode>> stacks = readStacks();

    }

    private static List<Stack<StackNode>> readStacks() {
        Scanner sc = new Scanner(System.in);
        List<Stack<StackNode>> stacks = new ArrayList<>();

        sc.nextLine();
        int stackValue;
        for (int i = 0; i < 3; i++) {
            Stack<StackNode> stack = new Stack<>();
            String[] stackElements = sc.nextLine().split(" ");
            int currentSum = 0;
            for (int j = stackElements.length-1; j >= 0; j--) {
                stackValue = Integer.parseInt(stackElements[j]);
                currentSum += stackValue;
                stack.push(new StackNode(stackValue, currentSum));
            }
            stacks.add(stack);
        }
        return stacks;
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
