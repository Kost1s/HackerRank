package com.kap.hackerrank.datastructures.stacks;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class GameOfTwoStacks {

    public static void main(String[] args) {
        readStacks();
    }

    private static Map<Integer, List<Stack<Integer>>> readStacks() {
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<Stack<Integer>>> stacksMap = new HashMap<>();
        List<Stack<Integer>> stacks = new ArrayList<>();

        int games = sc.nextInt();
        for (int g = 0; g < games; g++) {
            sc.nextInt();
            sc.nextInt();
            int sumLimit = sc.nextInt();
            sc.nextLine();
            stacks.clear();
            for (int i = 0; i < 2; i++) {
                Stack<Integer> stack = new Stack<>();
                String[] stackElements = sc.nextLine().split(" ");
                if (stackElements.length != 0) {
                    for (int j = stackElements.length - 1; j >= 0; j--) {
                        stack.push(Integer.parseInt(stackElements[j]));
                    }
                    stacks.add(stack);
                }
            }
            stacksMap.put(sumLimit, stacks);
            System.out.println(findMaxNoOfMoves(stacksMap));
            stacksMap.clear();
        }
        return stacksMap;
    }

    private static int findMaxNoOfMoves(Map<Integer, List<Stack<Integer>>> stacksMap) {
        int limit = 0;
        Stack<Integer> stackOne = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();

        for (Map.Entry<Integer, List<Stack<Integer>>> entry : stacksMap.entrySet()) {
            limit = entry.getKey();
            stackOne = entry.getValue().get(0);
            stackTwo = entry.getValue().get(1);
        }

        return maxNoOfMoves(stackOne, stackTwo, limit);
    }


    private static int maxNoOfMoves(Stack<Integer> stackOne, Stack<Integer> stackTwo, int limit) {
        Stack<Integer> stackOneHelper = new Stack<>();

        int stackOneMoves = 0;
        int runningSum = 0;
        int stackOneElement;
        while (!stackOne.isEmpty() && ((runningSum + stackOne.peek()) <= limit)) {
            stackOneElement = stackOne.pop();
            stackOneHelper.push(stackOneElement);
            runningSum += stackOneElement;
            stackOneMoves++;
        }

        int maxMoves = stackOneMoves;

        int stackTwoMoves = 0;
        while (!stackTwo.isEmpty()) {
            runningSum += stackTwo.pop();
            stackTwoMoves++;

            while ((runningSum > limit) && !stackOneHelper.isEmpty()) {
                runningSum -= stackOneHelper.pop();
                stackOneMoves--;
            }

            if (((stackOneMoves + stackTwoMoves) > maxMoves) && (runningSum <= limit)) {
                maxMoves = stackOneMoves + stackTwoMoves;
            }

        }

        return maxMoves;
    }

}
