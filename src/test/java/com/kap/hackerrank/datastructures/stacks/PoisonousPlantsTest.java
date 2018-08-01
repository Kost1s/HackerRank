package com.kap.hackerrank.datastructures.stacks;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * @author Konstantinos Antoniou
 */
public class PoisonousPlantsTest {

    Stack<Integer> stackTestOne;
    Stack<Integer> stackTestTwo;

    @Before
    public void setUp() {
        stackTestOne = new Stack<>();
        stackTestOne.push(6);
        stackTestOne.push(5);
        stackTestOne.push(8);
        stackTestOne.push(4);
        stackTestOne.push(7);
        stackTestOne.push(10);
        stackTestOne.push(9);

        stackTestTwo = new Stack<>();
        stackTestTwo.push(3);
        stackTestTwo.push(1);
        stackTestTwo.push(10);
        stackTestTwo.push(7);
        stackTestTwo.push(3);
        stackTestTwo.push(5);
        stackTestTwo.push(6);
        stackTestTwo.push(6);
    }


    @Test
    public void noPlantsDieAfterDayTwo() {
        int days = PoisonousPlants.countDays(stackTestOne);
        assertEquals(2, days);
    }

    @Test
    public void noPlantsDieAfterDayThree() {
        int days = PoisonousPlants.countDays(stackTestTwo);
        assertEquals(3, days);
    }

/*    @Test
    public void noPlantsDieAfterDayFour() {
        int[] ar = {20, 5, 6, 15, 2, 2, 17, 2, 11, 5, 14, 5, 10, 9, 19, 12, 5};
        int days = PoisonousPlants.countDays(ar);
        assertEquals(4, days);
    }

    @Test
    public void noPlantsDieAfterDayThreeAgain() {
        int[] ar = {2, 1, 3, 1, 4, 2, 1, 4, 3, 3};
        int days = PoisonousPlants.countDays(ar);
        assertEquals(3, days);
    }*/
}
