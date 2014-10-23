package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem1Test{

    @Test
    public void testFindMultiples() {
        String expected = "[3, 5, 6, 9]";
        String result = null;

        result = Problem1.findMultiples(10).toString();

        assertEquals(result, expected);
    }

    @Test
    public void testSum() {
        int expected = 23;
        int result = 0;

        result = Problem1.sum(Problem1.findMultiples(10));
        assertEquals(result, expected);

    }
}
