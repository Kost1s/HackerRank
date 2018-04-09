package com.kap.hackerrank.languagespecific.datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class CharStackTest {

    @Test
    public void evenSequenceIsTrueOne() {
        String charSequence = "{}()";
        assertTrue(CharStack.checkIfValid(charSequence));
    }

    @Test
    public void evenSequenceIsTrueTwo() {
        String charSequence = "({()})";
        assertTrue(CharStack.checkIfValid(charSequence));
    }

    @Test
    public void evenSequenceIsTrueThree() {
        String charSequence = "[]";
        assertTrue(CharStack.checkIfValid(charSequence));
    }

    @Test
    public void oddSequenceIsFalse() {
        String charSequence = "{}(";
        assertTrue(CharStack.checkIfValid(charSequence));
    }


}
