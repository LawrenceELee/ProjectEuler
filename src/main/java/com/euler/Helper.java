/** *************************************************
 * Library of helper functions to solve project euler problems.
 *
 * ************************************************** */

package com.euler;

import java.util.ArrayList;

public class Helper{
    /** *************************************************
     * Calculates sum of a list of numbers.
     *
     * @param nums list of numbers to be totalled.
     * @return total value of nums.
     * ************************************************** */
    public static int sum(ArrayList<Integer> nums){
        int total = 0;
        for( int num: nums ){
            total += num;
        }
        return total;
    }
}
