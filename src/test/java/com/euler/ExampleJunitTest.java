package com.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleJunitTest{

    @Test
    public void testPasses() {
        String expected = "Hello, JUnit!";
        String result = "Hello, JUnit!";

        //exptected output is arg1, result from function testing is arg2.
        //otherwise junit output will be confusing.
        assertEquals(expected, result);
    }

    @Test
    public void testFails() {
        // The worlds most obvious bug as an example:
        //assertTrue(false);

        //fixed
        assertTrue(true);
    }

    @Test
    public void testArray() {
        int [] array1 = new int[] {1, 2, 3};
        int [] array2 = new int[] {1, 2, 3};
        assertArrayEquals(array1, array2);
    }
}
