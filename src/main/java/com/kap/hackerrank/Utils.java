package com.kap.hackerrank;

import java.util.Scanner;

public class Utils {

    public static int[] readSizeAndElementsOfIntArray() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        return ar;
    }

    public static String[] readSizeAndElementsOfStringArray() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] ar = new String[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.next();
        }
        return ar;
    }

}
