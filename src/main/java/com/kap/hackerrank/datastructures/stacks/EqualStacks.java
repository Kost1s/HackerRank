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
        System.out.println(findHeight(stacks));
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

    public static int findHeight(List<Stack<StackNode>> stacks) {
        if (checkEmpty(stacks)) {
            return 0;
        } else if (checkEqualHeight(stacks)) {
            return stacks.get(0).peek().currentHeight;
        }
        popFromHigherStack(stacks);
        return findHeight(stacks);
    }

    private static boolean checkEqualHeight(List<Stack<StackNode>> stacks) {
        return (stacks.get(0).peek().currentHeight == stacks.get(1).peek().currentHeight) &&
                (stacks.get(1).peek().currentHeight == stacks.get(2).peek().currentHeight);
    }

    private static boolean checkEmpty(List<Stack<StackNode>> stacks) {
        for (Stack<StackNode> stack : stacks) {
            if (stack.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private static void popFromHigherStack(List<Stack<StackNode>> stacks) {
        for (int i = 0; i < stacks.size(); i++) {
            for(int j = 0; j < stacks.size(); j++) {
                if(stacks.get(i).peek().currentHeight > stacks.get(j).peek().currentHeight) {
                    stacks.get(i).pop();
                    j = stacks.size();
                    i = stacks.size();
                }
            }
        }
    }

    protected static class StackNode {
        int nodeValue;
        int currentHeight;

        protected StackNode(int nodeValue, int currentHeight) {
            this.nodeValue = nodeValue;
            this.currentHeight = currentHeight;
        }
    }

}
