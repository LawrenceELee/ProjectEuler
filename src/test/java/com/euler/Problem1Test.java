package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem1Test{

    @Test
    public void testOutput() {
        String expected = "[3, 5, 6, 9]";
        String result = null;

        result = Problem1.findMultiples(10).toString();

        assertEquals(result, expected);
    }
}
