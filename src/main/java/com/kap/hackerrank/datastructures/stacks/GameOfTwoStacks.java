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
        }
        return stacksMap;
    }

    private static int findMaxNoOfMoves(Map<Integer, List<Stack<Integer>>> stacksMap) {
        int intLimit = 0;
        int runningSum = 0;
        int maxNoOfMoves = 0;

        Stack<Integer> stackOne = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();

        for (Map.Entry<Integer, List<Stack<Integer>>> entry : stacksMap.entrySet()) {
            intLimit = entry.getKey();
            stackOne = entry.getValue().get(0);
            stackTwo = entry.getValue().get(1);
        }

        return maxNoOfMoves(stackOne, stackTwo, runningSum, intLimit, maxNoOfMoves);
    }

    private static int maxNoOfMoves(Stack<Integer> stackOne, Stack<Integer> stackTwo, int runningSum, int intLimit,
                                    int maxNoOfMoves) {

        if ((stackOne.peek() < stackTwo.peek()) && ((runningSum + stackOne.peek()) < intLimit)) {
            runningSum += stackOne.pop();
            maxNoOfMoves++;
            return maxNoOfMoves(stackOne, stackTwo, runningSum, intLimit, maxNoOfMoves);
        } else if ((stackOne.peek() > stackTwo.peek()) && ((runningSum + stackTwo.peek()) < intLimit)) {
            runningSum += stackTwo.pop();
            maxNoOfMoves++;
            return maxNoOfMoves(stackOne, stackTwo, runningSum, intLimit, maxNoOfMoves);
        } else {
            return maxNoOfMoves;
        }
    }
}
