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
    private Stack<Integer> stackTestFive;
    private Stack<Integer> stackTestSix;
    private Stack<Integer> stackTestSeven;

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

        stackTestFive = new Stack<>();
        stackTestFive.push(1);
        stackTestFive.push(2);
        stackTestFive.push(3);
        stackTestFive.push(4);
        stackTestFive.push(5);

        stackTestSix = new Stack<>();
        stackTestSix.push(1);
        stackTestSix.push(6);
        stackTestSix.push(6);
        stackTestSix.push(6);
        stackTestSix.push(6);
        stackTestSix.push(6);

        stackTestSeven = new Stack<>();
        stackTestSeven.push(1);
        stackTestSeven.push(3);
        stackTestSeven.push(5);
        stackTestSeven.push(2);
        stackTestSeven.push(7);
        stackTestSeven.push(6);
        stackTestSeven.push(4);
        stackTestSeven.push(2);
        stackTestSeven.push(1);
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

    @Test
    public void noPlantsDieAfterDayFour() {
        int days = PoisonousPlants.countDays(stackTestThree);
        assertEquals(4, days);
    }

    @Test
    public void noPlantsDieAfterDayThreeAgain() {
        int days = PoisonousPlants.countDays(stackTestFour);
        assertEquals(3, days);
    }

    @Test
    public void noPlantDieAfterDayOne() {
        int days = PoisonousPlants.countDays(stackTestFive);
        assertEquals(1, days);
    }

    @Test
    public void noPlsntsDieAfterDayFive() {
        int days = PoisonousPlants.countDays(stackTestSix);
        assertEquals(5, days);
    }

    @Test
    public void noPlantsDieAfterDayFourAgain() {
        int days = PoisonousPlants.countDays(stackTestSeven);
        assertEquals(4, days);
    }
}
