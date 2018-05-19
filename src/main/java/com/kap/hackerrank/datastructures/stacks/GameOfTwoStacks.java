package com.kap.hackerrank.datastructures.stacks;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class GameOfTwoStacks {

    public static void main(String[] args) {
        Map<Integer, List<Stack<Integer>>> stacks = readStacks();
        //print number
    }

    private static  Map<Integer, List<Stack<Integer>>> readStacks() {
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
        }
        return stacksMap;
    }

}
