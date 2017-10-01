package com.kap.hackerrank.languagespecific.strings;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

}
