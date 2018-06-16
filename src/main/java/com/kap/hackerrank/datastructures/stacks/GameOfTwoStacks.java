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

        Stack<Integer> stackOneHelper = new Stack<>();
        Stack<Integer> stackTwoHelper = new Stack<>();

        int stackOneMoves = 0;
        int stackOneRunningSum = 0;
        int stackOneElement;
        while (!stackOne.isEmpty() && ((stackOneRunningSum + stackOne.peek()) <= intLimit)) {
            stackOneElement = stackOne.pop();
            stackOneHelper.push(stackOneElement);
            stackOneRunningSum += stackOneElement;
            stackOneMoves++;
        }

        int stackTwoMoves = 0;
        int stackTwoRunningSum = 0;
        int stackTwoElement;
        while (!stackTwo.isEmpty() && ((stackTwoRunningSum + stackTwo.peek()) <= intLimit)) {
            stackTwoElement = stackTwo.pop();
            stackTwoHelper.push(stackTwoElement);
            stackTwoRunningSum += stackTwoElement;
            stackTwoMoves++;
        }

        while (!stackOneHelper.isEmpty()) {
            stackOne.push(stackOneHelper.pop());
        }

        while (!stackTwoHelper.isEmpty()) {
            stackTwo.push(stackTwoHelper.pop());
        }

        int stackAtoBMoves = 0;
        int stackAtoBRunningSum = 0;
        while (!stackOne.isEmpty() && ((stackAtoBRunningSum + stackOne.peek()) <= intLimit)) {
            stackOneElement = stackOne.pop();
            stackOneHelper.push(stackOneElement);
            stackAtoBRunningSum += stackOneElement;
            stackAtoBMoves++;
        }

        while (!stackTwo.isEmpty() && ((stackAtoBRunningSum + stackTwo.peek()) <= intLimit)) {
            stackTwoElement = stackTwo.pop();
            stackTwoHelper.push(stackTwoElement);
            stackAtoBRunningSum += stackTwoElement;
            stackAtoBMoves++;
        }


        while (!stackOneHelper.isEmpty()) {
            stackOne.push(stackOneHelper.pop());
        }

        while (!stackTwoHelper.isEmpty()) {
            stackTwo.push(stackTwoHelper.pop());
        }

        int stackBtoAMoves = 0;
        int stackBtoARunningSum = 0;
        while (!stackTwo.isEmpty() && ((stackBtoARunningSum + stackTwo.peek()) <= intLimit)) {
            stackTwoElement = stackTwo.pop();
            stackTwoHelper.push(stackTwoElement);
            stackBtoARunningSum += stackTwoElement;
            stackBtoAMoves++;
        }

        while (!stackOne.isEmpty() && ((stackBtoARunningSum + stackOne.peek()) <= intLimit)) {
            stackOneElement = stackOne.pop();
            stackOneHelper.push(stackOneElement);
            stackBtoARunningSum += stackOneElement;
            stackBtoAMoves++;
        }

        while (!stackOneHelper.isEmpty()) {
            stackOne.push(stackOneHelper.pop());
        }

        while (!stackTwoHelper.isEmpty()) {
            stackTwo.push(stackTwoHelper.pop());
        }

        // need to be written here
        int smallestElementMoves = smallestElementMethod(stackOne, stackTwo, intLimit, 0, 0);

        int[] maxMoves = {stackOneMoves, stackTwoMoves, stackAtoBMoves, stackBtoAMoves, smallestElementMoves};
        Arrays.sort(maxMoves);

        return maxMoves[maxMoves.length - 1];
    }

    private static int smallestElementMethod(Stack<Integer> stackOne, Stack<Integer> stackTwo, int intLimit,
                                             int runningSum, int maxNoOfMoves) {
        if(!stackOne.isEmpty() && !stackTwo.isEmpty()) {
            if ((stackOne.peek() < stackTwo.peek()) && ((runningSum + stackOne.peek()) <= intLimit)) {
                runningSum += stackOne.pop();
                maxNoOfMoves++;
                return smallestElementMethod(stackOne, stackTwo, intLimit, runningSum, maxNoOfMoves);
            } else if ((stackOne.peek() > stackTwo.peek()) && ((runningSum + stackTwo.peek()) <= intLimit)) {
                runningSum += stackTwo.pop();
                maxNoOfMoves++;
                return smallestElementMethod(stackOne, stackTwo, intLimit, runningSum, maxNoOfMoves);
            }
        }
        return maxNoOfMoves;
    }

}
