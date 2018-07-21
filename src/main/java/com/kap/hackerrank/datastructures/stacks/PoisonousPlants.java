package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class PoisonousPlants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<>();
        int stackSize = sc.nextInt();
        for (int i = 0; i < stackSize; i++) {
            s1.push(sc.nextInt());
        }

        Stack<Integer> s2 = new Stack<>();
        int d = 0;
        int days = countDays(s1, s2, d);

        System.out.println(days);
    }

    public static int countDays(Stack<Integer> s1, Stack<Integer> s2, int days) {
        boolean plantsDied = false;

        while (!s1.isEmpty()) {
            if (!s2.isEmpty() && (s1.peek() < s2.peek())) {
                plantsDied = true;
                s2.pop();
            }
            s2.push(s1.pop());
        }

        if (!plantsDied) {
            return days;
        }

        rechargeStackOne(s1, s2);
        days++;

        return countDays(s1, s2, days);
    }

    private static void rechargeStackOne(Stack<Integer> s1, Stack<Integer> s2) {
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
}
