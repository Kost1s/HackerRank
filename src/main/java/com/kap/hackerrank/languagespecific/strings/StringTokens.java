package com.kap.hackerrank.languagespecific.strings;

import java.util.Scanner;
import org.apache.commons.lang.ArrayUtils;

/**
 * @author Konstantinos Antoniou
 */
public class StringTokens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] tokens = input.trim().split("\\s*\\W[\\W\\s]*|\\s*_[_\\s]*");

        if(tokens.length == 1) {
            if(tokens[0].isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(tokens.length);
                System.out.println(tokens[0]);
            }
        } else {
            System.out.println(tokens.length);

            for (String token : tokens) {
                System.out.println(token);
            }
        }

    }

}
