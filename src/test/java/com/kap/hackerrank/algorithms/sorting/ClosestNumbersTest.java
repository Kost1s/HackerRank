package com.kap.hackerrank.algorithms.sorting;

import org.junit.Test;

/**
 * @author Konstantinos Antoniou
 */
public class ClosestNumbersTest {

    @Test
    public void letSee() {
        int[] ar = {5, 4, 3, 2};
        int[] test = ClosestNumbers.closestNumbers(ar);
        for(int e : test){
            System.out.println(e);
        }
    }

    @Test
    public void letSeeTwo() {
        int[] ar = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};
        int[] test = ClosestNumbers.closestNumbers(ar);
        for(int e : test){
            System.out.println(e);
        }
    }

    @Test
    public void letSeeThree() {
        int[] ar = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470};
        int[] test = ClosestNumbers.closestNumbers(ar);
        for(int e : test){
            System.out.println(e);
        }
    }

}
