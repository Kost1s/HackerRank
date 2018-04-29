package com.kap.hackerrank.languagespecific.datastructures;

/**
 * @author Konstantinos Antoniou
 */
public class Generics {

    public static void main( String args[] ) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }

    public static void printArray(Object[] ar) {
        for (Object object : ar) {
            System.out.println(object);
        }
    }


}
