/** *************************************************
 * Junit tests for prj euler problem 2.
 * ************************************************** */

package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class Problem2Test{

    /** *************************************************
     * Simple test to ensure generateFib() method works for simple cases.
     *
     * <p>
     * First 10 fib nums.
     * ************************************************** */
    @Test
    public void testgenerateFib10() {

        String expected = "[1, 2, 3, 5, 8, 13, 21, 34, 55, 89]";
        String result = Problem2.generateFib(Helper.BIGTEN).toString();

        assertEquals(expected, result);
    }

    /** *************************************************
     * Simple test to ensure getEvens() method works for simple cases.
     *
     * ************************************************** */
    @Test
    public void testgetEvens() {
        String expected = "[2, 8, 34]";
        String result = Problem2.getEvens(Problem2.generateFib(Helper.BIGTEN)).toString();
        assertEquals(expected, result);
    }

}

