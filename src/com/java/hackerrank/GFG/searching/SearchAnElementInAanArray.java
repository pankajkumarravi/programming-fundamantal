package com.java.hackerrank.GFG.searching;

/**
 * @Author pankaj
 * @create 11/1/21 6:56 PM
Given an integer array and another integer element. The task is to find if the given element is present in array or not.

Example 1:

Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case
with array as {1, 2, 3 4} and element
to be searched as 3.  Since 3 is
present at index 2, output is 2.
Example 2:

Input:
n = 5
arr[] = {1,2,3,4,5}
x = 5
Output: 4
Explanation: For array elements
{1,2,3,4,5} element to be searched
is 5 and it is at index 4. So, the
output is 4.
Your Task:
The task is to complete the function search() which takes the array arr[], its size N and the element X as inputs and returns the index of first occurrence of X in the given array. If the element X does not exist in the array, the function should return -1.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
 */
public class SearchAnElementInAanArray {
    static int search(int arr[], int N, int X) {

        for (int i=0;i<N;i++){
            if (arr[i]==X)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5},5,3));
    }
}
