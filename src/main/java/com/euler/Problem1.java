/** *************************************************
 * Project Euler problem 1: multiples of 3 and 5.
 *
 * Description:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * ************************************************** */
package com.euler;

import java.util.ArrayList;
import java.math.BigInteger;

public class Problem1{

    /** *************************************************
     * Checks if a number is a multiple using the modulus operator.
     *
     * @param max is the upper limit.
     * @return a list of the multiples of 3 or 5 less than max limit.
     *
     * ************************************************** */
    public static ArrayList<BigInteger> findMultiples(BigInteger max){
        ArrayList<BigInteger> results = new ArrayList<>();

        //start at 1 instead of 0 b/c 0 % anything is always 0
        BigInteger count = BigInteger.ONE;

        while( count.compareTo(max) < 0 ){
            if( count.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO)==0
                ||
                count.mod(BigInteger.valueOf(5)).compareTo(BigInteger.ZERO)==0
            ){
                results.add(count);
            }
            count = count.add(BigInteger.ONE);
        }
        return results;
    }

    public static void main(String args[]){
        String ans = null;

        ans = Helper.sum(findMultiples(Helper.BIGTEN));
        System.out.println(ans);

        ans = Helper.sum(findMultiples(Helper.BIGTHOU));
        //answer should be 233168
        System.out.println(ans);
    }
}
