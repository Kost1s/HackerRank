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
    }

    @Test
    public void noPlantsDieAfterDayTwo() {
        Stack<Integer> s2 = new Stack<>();
        int days = PoisonousPlants.countDays(stackTestOne, s2, 0);
        assertEquals(2, days);
    }
}
