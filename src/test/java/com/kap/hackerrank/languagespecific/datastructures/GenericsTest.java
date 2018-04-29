package com.kap.hackerrank.languagespecific.datastructures;

import org.junit.Test;

/**
 * @author Konstantinos Antoniou
 */
public class GenericsTest {

    @Test
    public void methodPrintsIntObjects() {
        Integer[] ar = {1, 2, 3};
        Generics.printArray(ar);
    }

    @Test
    public void methodPrintsStringObjects() {
        String[] ar = {"Hello", "World"};
        Generics.printArray(ar);
    }

}
