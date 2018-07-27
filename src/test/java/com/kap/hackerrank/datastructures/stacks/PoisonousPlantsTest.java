package com.kap.hackerrank.datastructures.stacks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Konstantinos Antoniou
 */
public class PoisonousPlantsTest {

    @Test
    public void noPlantsDieAfterDayTwo() {
        int[] ar = {6, 5, 8, 4, 7, 10, 9};
        int days = PoisonousPlants.countDays(ar);
        assertEquals(2, days);
    }

    @Test
    public void noPlantsDieAfterDayThree() {
        int[] ar = {3, 1, 10, 7, 3, 5, 6, 6};
        int days = PoisonousPlants.countDays(ar);
        assertEquals(3, days);
    }

    @Test
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
    }
}
