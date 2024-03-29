package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/8/21 9:45 PM
Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements. Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.
Note: The pair has an element from each array.


Example 1:

Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8}
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).


Example 2:

Input:
N=4, M=4, sum=5
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0


Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countPairs() that takes array arr1, array arr2, integer M, integer N and integer x as parameters and return the count of all pairs from both arrays whose sum is equal to x.



Expected Time Complexity: O(M+N).
Expected Auxiliary Space: O(1).

 */
public class CountPairSum {
    static int countPairs(int arr1[],int arr2[], int M, int N, int x)
    {
        int count = 0;
        int loopMax = M + N;
        int i = 0;
        int j = N - 1;
        while(loopMax > 0 && i < M && j >= 0){
            int sum = arr1[i] + arr2[j];
            if (sum == x){
                count += 1;
                j--;
            }else if(sum > x){
                j--;
            }else{
                i++;
            }
            loopMax--;
        }
        return count;
    }
}
