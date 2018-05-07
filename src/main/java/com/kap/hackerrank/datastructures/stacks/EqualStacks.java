package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class EqualStacks {

    5 3 4
            3 2 1 1 1
            4 3 2
            1 1 4 1



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<StackNode> stackOne = new Stack<>();

        int stacksNo = 3;
        int stackOneCapacity = sc.nextInt();
        int stackTwoCapacity = sc.nextInt();
        int stackThreeCapacity = sc.nextInt();

        for(int i=0; i < stackOneCapacity; i++) {

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
