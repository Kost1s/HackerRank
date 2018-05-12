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
        int height = findHeight(stacks, 0);
        System.out.println(height);
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
            if (stackElements.length != 0) {
                for (int j = stackElements.length - 1; j >= 0; j--) {
                    stackValue = Integer.parseInt(stackElements[j]);
                    currentSum += stackValue;
                    stack.push(new StackNode(stackValue, currentSum));
                }
            }
            stacks.add(stack);
        }
        return stacks;
    }

    private static int findHeight(List<Stack<StackNode>> stacks, int i) {
        if (checkEmpty(stacks)) {
            return 0;
        } else if (checkEqualHeight(stacks)) {
            return stacks.get(0).peek().currentSum;
        }

        if()
        if (i == 3) {
            i = 0;
        } else {
            i++;
        }
        stacks.get(i).pop();
        return findHeight(stacks, i);
    }

    private static boolean checkEqualHeight(List<Stack<StackNode>> stacks) {
        return (stacks.get(0).peek().currentSum == stacks.get(1).peek().currentSum) &&
                (stacks.get(1).peek().currentSum == stacks.get(2).peek().currentSum);
    }

    private static boolean checkEmpty(List<Stack<StackNode>> stacks) {
        for (Stack<StackNode> stack : stacks) {
            if (stack.isEmpty()) {
                return true;
            }
        }
        return false;
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
