package com.kap.hackerrank.languagespecific.datastructures;

import java.util.Scanner;
import java.util.Stack;
/**
 * @author Konstantinos Antoniou
 */
public class CharStack {

    private static final char L_PAREN = '(';
    private static final char L_BRACKET = '{';
    private static final char L_BRACE = '[';
    private static final char R_PAREN = ')';
    private static final char R_BRACKET = '}';
    private static final char R_BRACE = ']';



    public static void main(String []argh) {
        Stack charStack = new Stack();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == L_PAREN) {
                    charStack.push(input.charAt(i));
                } else if (input.charAt(i) == L_BRACKET) {
                    charStack.push(input.charAt(i));
                } else if (input.charAt(i) == L_BRACE) {
                    charStack.push(input.charAt(i));
                }

                if (input.charAt(i) == R_PAREN) {
                    if (charStack.isEmpty()) {
                        System.out.println("false");
                        break;
                    }

                    if (!(charStack.pop().equals(L_PAREN))) {
                        System.out.println("false");
                        break;
                    }
                }

                if (input.charAt(i) == R_BRACKET) {
                    if (charStack.isEmpty()) {
                        System.out.println("false");
                        break;
                    }

                    if (!(charStack.pop().equals(L_BRACKET))) {
                        System.out.println("false");
                        break;
                    }
                }

                if (input.charAt(i) == R_BRACE) {
                    if (charStack.isEmpty()) {
                        System.out.println("false");
                        break;
                    }

                    if (!(charStack.pop().equals(L_BRACE))) {
                        System.out.println("false");
                        break;
                    }
                }



            }

            System.out.println("true");

        }

    }


}
