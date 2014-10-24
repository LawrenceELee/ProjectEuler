/** *************************************************
 * Library of helper functions to solve project euler problems.
 *
 * ************************************************** */

package com.euler;

import java.util.ArrayList;
import java.math.BigInteger;

public class Helper{

    final static BigInteger BIGTEN = BigInteger.valueOf(10);
    final static BigInteger BIGHUN = BigInteger.valueOf(100);
    final static BigInteger BIGTHOU = BigInteger.valueOf(1000);

    /** *************************************************
     * Calculates sum of a list of numbers.
     *
     * @param nums list of long numbers to be totalled.
     * @return total value of nums.
     * ************************************************** */
    public static String sum(ArrayList<BigInteger> nums){
        BigInteger total = BigInteger.valueOf(0);
        //need big integer to handle very large nums

        for( BigInteger num: nums ){
            //BigInteger is immutable, so have to do += the way below:
            //reference: http://stackoverflow.com/questions/1783912/java-how-to-use-biginteger
            total = total.add(num);
        }
        return total.toString();
    }

    /*
    //method signatures with different Generics are considered the same
    //and will cause an ERASURE error.
    //this limitation is part of the language syntax and is intended to avoid
    //conflicts in legacy code that still use raw types.
    //reference: http://stackoverflow.com/questions/1998544/method-has-the-same-erasure-as-another-method-in-type
    public static long sum(ArrayList<Long> nums){
        int total = 0;
        for( int num: nums ){
            total += num;
        }
        return total;
    }
    */

    /** *************************************************
     * Determins if a number is even or not.
     *
     * @param num Even numbers are divisible by 2.
     * @return True if number is even.
     * ************************************************** */
    public static boolean isEven(BigInteger num){
        return num.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0;
    }
}
