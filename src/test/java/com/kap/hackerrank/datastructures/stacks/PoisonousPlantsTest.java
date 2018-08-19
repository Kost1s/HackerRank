package com.kap.hackerrank.datastructures.stacks;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * @author Konstantinos Antoniou
 */
public class PoisonousPlantsTest {

    private Stack<Integer> stackTestOne;
    private Stack<Integer> stackTestTwo;
    private Stack<Integer> stackTestThree;
    private Stack<Integer> stackTestFour;

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

        stackTestThree = new Stack<>();
        stackTestThree.push(20);
        stackTestThree.push(5);
        stackTestThree.push(6);
        stackTestThree.push(15);
        stackTestThree.push(2);
        stackTestThree.push(2);
        stackTestThree.push(17);
        stackTestThree.push(2);
        stackTestThree.push(11);
        stackTestThree.push(5);
        stackTestThree.push(14);
        stackTestThree.push(5);
        stackTestThree.push(10);
        stackTestThree.push(9);
        stackTestThree.push(19);
        stackTestThree.push(12);
        stackTestThree.push(5);

        stackTestFour = new Stack<>();
        stackTestFour.push(2);
        stackTestFour.push(1);
        stackTestFour.push(3);
        stackTestFour.push(1);
        stackTestFour.push(4);
        stackTestFour.push(2);
        stackTestFour.push(1);
        stackTestFour.push(4);
        stackTestFour.push(3);
        stackTestFour.push(3);
    }


    @Test
    public void noPlantsDieAfterDayTwo() {
        int days = PoisonousPlants.countDays(stackTestOne, 0);
        assertEquals(2, days);
    }

    @Test
    public void noPlantsDieAfterDayThree() {
        int days = PoisonousPlants.countDays(stackTestTwo, 0);
        assertEquals(3, days);
    }

    @Test
    public void noPlantsDieAfterDayFour() {
        int days = PoisonousPlants.countDays(stackTestThree, 0);
        assertEquals(4, days);
    }

    @Test
    public void noPlantsDieAfterDayThreeAgain() {
        int days = PoisonousPlants.countDays(stackTestFour, 0);
        assertEquals(3, days);
    }
}
