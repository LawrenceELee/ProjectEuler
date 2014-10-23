package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelperTest{
    /** *************************************************
     * Simple test to ensure sum() method works for simple cases.
     *
     * ************************************************** */
    @Test
    public void testSum() {
        int expected = 23;
        int result = 0;

        result = Helper.sum(Problem1.findMultiples(10));
        assertEquals(result, expected);
    }
}
