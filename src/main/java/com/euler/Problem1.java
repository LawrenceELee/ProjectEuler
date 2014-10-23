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

public class Problem1{

    /** *************************************************
     * Checks if a number is a multiple using the modulus operator.
     *
     * @param max is the upper limit.
     * @return a list of the multiples of 3 or 5 less than max limit.
     *
     * ************************************************** */
    public static ArrayList<Integer> findMultiples(int max){
        ArrayList<Integer> results = new ArrayList<>();

        //start at 1 instead of 0 b/c 0 % anything is always 0
        int count = 1;  

        while( count < max ){
            if( (count % 3)==0 || (count % 5)==0 ){
                results.add(count);
            }
            count++;
        }
        return results;
    }

    public static void main(String args[]){
        int ans = 0;

        ans = sum(findMultiples(10));
        System.out.println(ans);

        ans = sum(findMultiples(1000));
        System.out.println(ans);
    }
}
