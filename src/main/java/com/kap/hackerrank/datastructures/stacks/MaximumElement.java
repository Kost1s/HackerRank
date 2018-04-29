package com.kap.hackerrank.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Konstantinos Antoniou
 */
public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack intStack = new Stack();
        int max = 0;

        int queriesNo = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < queriesNo; i++) {
            String[] ar = sc.nextLine().split(" ");
            if (("1").equals(ar[0]) && (Integer.parseInt(ar[1]) > max)) {
                max = Integer.parseInt(ar[1]);
                intStack.push(max);
            } else if (("2").equals(ar[0]) && !intStack.empty()) {
                if(intStack.pop().equals(max)) {
                    max=0;
                }
            } else if (("3").equals(ar[0])) {
                System.out.println(max);
            }
        }
    }

}

