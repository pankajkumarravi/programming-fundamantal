package com.java.hackerrank.GFG.Cognizant;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author pankaj
 * @create 1/3/22 11:38 PM
Given the series as follows 2 2 4 8 16 512....... Identify the Nth term of the series. Answers can be very large use BigInt in Java.

Example 1:

Input: N = 1
Output: 2
Explanation: First term of the series is 2.
Example 2:

Input: N = 2
Output: 2
Explanation: Second term of the series is 2.


Your Task:
You dont need to read input or print anything. Complete the function NthTerm() which takes N as input parameter and returns the Nth term of the series.

Expected Time Complexity: O(logn*logn)
Expected Auxiliary Space: O(1)

Constraints:
1<= N <=12
 */
public class CrackTheSeries {
    static BigInteger NthTerm(int N) {
        // code here

        if (N == 1 || N == 2)
            return BigInteger.valueOf(2);
        int a = N / 2;
        if (N % 2 == 0) {
            return BigDecimal.valueOf(Math.pow(2, Math.pow(3, a - 1))).toBigInteger();
        } else {
            return BigDecimal.valueOf(Math.pow(2, Math.pow(2, a))).toBigInteger();

        }
    }
}
