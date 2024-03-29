package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/1/21 10:00 PM
 * Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * arr[] = {1, 5, 3, 2}
 * Output: 1
 * Explanation:
 * Sum of first 2 elements is 1 + 5  = 6,
 * Sum of last 2 elements is 3 + 2  = 5,
 * To make the array balanced you can add 1.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 6
 * arr[] = { 1, 2, 1, 2, 1, 3 }
 * Output: 2
 * Explanation:
 * Sum of first 3 elements is 1 + 2 + 1 = 4,
 * Sum of last three elements is 2 + 1 + 3 = 6,
 * To make the array balanced you can add 2.
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function minValueToBalance() which takes the array a[] and N as inputs and returns the desired result.
 * <p>
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 2<=N<=107
 * N%2==0
 */
public class BalancedArray {
    long minValueToBalance(long a[], int n) {
        int i, first = 0, second = 0, res1, res2;

        for (i = 0; i < (n / 2); i++) {
            first += a[i];
        }
        for (i = (n / 2); i < n; i++) {
            second += a[i];
        }
        if (first > second) {
            res1 = first - second;
            return res1;
        } else if (second > first) {
            res2 = second - first;
            return res2;
        } else {
            return 0;
        }
    }
}
