package com.java.hackerrank.GFG.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author pankaj
 * @create 11/7/21 8:34 PM
Given an array arr[] of N distinct integers, output the array in such a way that the first element is first maximum and the second element is the first minimum, and so on.


Example 1:

Input: N = 7, arr[] = {7, 1, 2, 3, 4,
5, 6}
Output: 7 1 6 2 5 3 4
Explanation:The first element is first
maximum and second element is first
minimum and so on.
Example 2:

Input: N = 8, arr[] = {1, 6, 9, 4, 3,
7, 8, 2}
Output: 9 1 8 2 7 3 6 4â€‹

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function alternateSort() that takes array arr and integer N as parameters and returns the desired array as output.



Expected Time Complexity: O(NlogN).
Expected Auxiliary Space: O(N).


 ************************** Zoho *****************************8
 */
public class AlternativeSorting {
    ArrayList<Long> alternateSort(long arr[] , int N) {
        // Your code goes here
        ArrayList<Long> arrayList=new ArrayList<>();
        Arrays.sort(arr);
        int k=0;
        for (int i=0;i<N;i++){
            if (i%2 ==0)
                arrayList.add(arr[N-1-k++]);
            else
            arrayList.add(arr[k-1]);
        }
        return arrayList;
    }

    public static void main(String[] args) {
            AlternativeSorting sorting=new AlternativeSorting();
        ArrayList<Long> resp=  sorting.alternateSort(new long[]{7,1,2,3,4,5,6},7);
            System.out.println(resp);
    }
}
 // See, It's simple Once the array is sorted using  1-->  Arrays.sort(arr);
//
//that means values are in ascending order.
//
//
//2 . than the even