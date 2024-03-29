package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/6/21 6:23 PM
Pitsy needs help in the given task by her teacher. The task is to divide a array into two sub array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.

Example 1:

â€‹Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3
Sum up an array from index 2 to 3 = 7
Their multiplication is 21.â€‹â€‹

â€‹Example 2:

Input : arr[ ] = {1, 2}
Output :  2


Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function multiply() that takes an array (arr), sizeOfArray (n), and return the sum of the subarrays and then multiply both the subarrays. The driver code takes care of the printing.

 */
public class MultiplyLeftAndRightArraySum {
    // Function for finding maximum and value pair
    public static int multiply(int arr[], int n) {
        //Complete the function
        int leftSum=0,rightSum =0;
        for(int i=0;i<n/2;i++){
            leftSum =leftSum+arr[i];
        }for (int i=n/2;i<n;i++){
            rightSum =rightSum+arr[i];
        }
        return leftSum*rightSum;
    }
}
