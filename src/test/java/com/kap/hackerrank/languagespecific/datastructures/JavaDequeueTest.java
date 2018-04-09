package com.kap.hackerrank.languagespecific.datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Konstantinos Antoniou
 */
public class JavaDequeueTest {

   @Test
   public void uniqueNumberIsThree() {
       int[] ar = {5, 3, 5, 2, 3, 2};
       int subArSize = 3;

       assertTrue(JavaDequeue.getMaxUniqueIntegers(ar, subArSize) == 3);
   }

}
