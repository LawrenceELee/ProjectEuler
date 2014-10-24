/** *************************************************
 * Junit tests for problem1.
 * ************************************************** */

package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem1Test{

    /** *************************************************
     * Simple test to ensure findMultiples() method works for simple cases.
     *
     * ************************************************** */
    @Test
    public void testFindMultiples() {
        String expected = "[3, 5, 6, 9]";
        String result = null;

        result = Problem1.findMultiples(Helper.BIGTEN).toString();

        assertEquals(expected, result);
    }

    public void testFind1000(){
        String expected = "233168";
        String result = Helper.sum(Problem1.findMultiples(Helper.BIGTHOU));

        assertEquals(expected, result);
    }
    

}
