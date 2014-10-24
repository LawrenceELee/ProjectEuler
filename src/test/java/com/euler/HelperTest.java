package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigInteger;

public class HelperTest{
    /** *************************************************
     * Simple test to ensure sum() method works for simple cases.
     *
     * ************************************************** */
    @Test
    public void testSum() {
        String expected = "23";
        String result = Helper.sum(Problem1.findMultiples(Helper.BIGTEN));
        assertEquals(expected, result);
    }

    /** *************************************************
     * Simple test to ensure getEvens() method returns false for odd nums.
     *
     * ************************************************** */
    @Test
    public void testGetEvensFalse() {
        boolean expected = false;
        boolean result = Helper.isEven(BigInteger.ONE);

        assertEquals(expected, result);
    }
    
    /** *************************************************
     * Simple test to ensure getEvens() method returns true for even nums.
     *
     * ************************************************** */
    @Test
    public void testGetEvensTrue() {
        boolean expected = true;
        boolean result = Helper.isEven(BigInteger.valueOf(2));

        assertEquals(expected, result);
    }
}
