package com.kap.hackerrank.languagespecific.strings;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class StringCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String reverseString = new StringBuffer(originalString).reverse().toString();

        if (originalString.equals(reverseString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
