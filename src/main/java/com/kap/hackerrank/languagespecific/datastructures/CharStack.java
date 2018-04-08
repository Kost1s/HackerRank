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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String charSequence = sc.next();

            Boolean isSequenceValid = false;
            if ((charSequence.length() % 2) == 0) {
                isSequenceValid = checkIfValid(charSequence);
            }
            System.out.println(isSequenceValid);
        }
    }

    public static Boolean checkIfValid(String charSequence) {
        Stack<Character> charStack = new Stack();

        for (int i = 0; i < charSequence.length(); i++) {
            if ((charSequence.charAt(i) == L_PAREN) || (charSequence.charAt(i) == L_BRACE) ||
                    (charSequence.charAt(i) == L_BRACKET)) {
                charStack.push(charSequence.charAt(i));
            }

            if (!charStack.empty()) {
                if ((charSequence.charAt(i) == R_PAREN) && !charStack.pop().equals(L_PAREN)) {
                    return false;
                }

                if ((charSequence.charAt(i) == R_BRACE) && !charStack.pop().equals(L_BRACE)) {
                    return false;
                }

                if ((charSequence.charAt(i) == R_BRACKET) && !charStack.pop().equals(L_BRACKET)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

}
