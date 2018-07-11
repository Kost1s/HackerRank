package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class LargestRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int buildingsNo = sc.nextInt();

        int maxArea = Integer.MIN_VALUE;
        int minPushHeight = Integer.MAX_VALUE;
        int minPopHeight = Integer.MAX_VALUE;
        int positionPush = 0;
        int positionPop = 0;
        int currentHeight;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < buildingsNo; i++) {
            currentHeight = sc.nextInt();

            // incoming is bigger than top or stack empty
            if (s.empty() || (!s.empty() && (currentHeight >= s.peek()))) {
                s.push(currentHeight);
                positionPush++;
                if (currentHeight < minPushHeight) {
                    minPushHeight = currentHeight;
                }
                maxArea = getMaxArea(minPushHeight, positionPush, currentHeight, maxArea);
            }

            // incoming is less than top
            if(!s.isEmpty() && (currentHeight < s.peek())) {
                minPopHeight = Integer.MAX_VALUE;
                while (!s.isEmpty() && (currentHeight < s.peek())) {
                    if (s.peek() <= minPopHeight) {
                        minPopHeight = s.peek();
                        positionPop++;
                        maxArea = getMaxArea(minPopHeight, positionPop, s.pop(), maxArea);
                    }
                }
                s.push(currentHeight);
            }
        }

        while (!s.isEmpty()) {
            if (s.peek() <= minPopHeight) {
                minPopHeight = s.peek();
                positionPop++;
                maxArea = getMaxArea(minPopHeight, positionPop, s.pop(), maxArea);
            }
        }

        System.out.println(maxArea);
    }

    private static int getMaxArea(int minHeight, int position, int buildingArea, int maxArea) {
        int currentOverallArea = minHeight * position;
        if ((buildingArea >= currentOverallArea) && (buildingArea > maxArea)) {
            return buildingArea;
        }
        if ((currentOverallArea >= buildingArea) && (currentOverallArea > maxArea)) {
            return currentOverallArea;
        }
        return maxArea;
    }

}




