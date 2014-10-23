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
     * ************************************************** */
    public static ArrayList<Integer> findMultiples(int max){
        ArrayList<Integer> results = new ArrayList<>();

        int a = 3, b = 5;

        results.add(3);
        results.add(5);
        results.add(6);
        results.add(9);

        return results;
    }

    public static int sum(ArrayList<Integer> nums){
        int total = 0;

        for( int num: nums ){
            total += num;
        }

        return total;
    }

    public static void main(String args[]){
        int ans = 0;

        ans = sum(findMultiples(10));
        findMultiples(1000);

        System.out.println(ans);
    }
}
