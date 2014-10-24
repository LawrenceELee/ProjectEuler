/** *************************************************
 * Junit tests for prj euler problem 2.
 * ************************************************** */

package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.math.BigInteger;

public class Problem2Test{

    /** *************************************************
     * Simple test to ensure generateFib() method works for simple cases.
     *
     * <p>
     * First 10 fib nums.
     * ************************************************** */
    @Test
    public void testGenerateFib10() {

        String expected = "[1, 2, 3, 5, 8, 13, 21, 34, 55, 89]";
        String result = Problem2.generateFib(BigInteger.valueOf(89)).toString();

        assertEquals(expected, result);
    }

    /** *************************************************
     * Simple test to ensure getEvens() method works for simple cases.
     *
     * ************************************************** */
    @Test
    public void testGetEvens() {
        String expected = "[2, 8, 34]";
        String result = Problem2.getEvens(Problem2.generateFib(BigInteger.valueOf(89))).toString();
        assertEquals(expected, result);
    }

    /** *************************************************
     * Test to ensure getting the right answer.
     *
     * Answer should be 4613732.
     * ************************************************** */
    @Test
    public void testAnswer() {
        String expected = "4613732";
        String result = Helper.sum(Problem2.getEvens(Problem2.generateFib(BigInteger.valueOf(4000000))));
        assertEquals(expected, result);
    }

}

