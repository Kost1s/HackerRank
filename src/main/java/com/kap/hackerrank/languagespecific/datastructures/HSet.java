package com.kap.hackerrank.languagespecific.datastructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Konstantinos Antoniou
 */
public class HSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pairLeft = new String[t];
        String [] pairRight = new String[t];

        for (int i = 0; i < t; i++) {
            pairLeft[i] = s.next();
            pairRight[i] = s.next();
        }

        System.out.println(getUniquePairsNumber(pairLeft, pairRight));
    }


    public static int getUniquePairsNumber(String[] pairLeft, String[] pairRight) {
        Set<String> uniquePairsNumber = new HashSet<>();

        for(int i = 0; i < pairLeft.length; i++) {
            uniquePairsNumber.add(pairLeft[i] + " " + pairRight[i]);
            System.out.println(uniquePairsNumber.size());
        }

        return uniquePairsNumber.size();
    }
}
