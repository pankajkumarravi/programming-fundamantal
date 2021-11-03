package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/3/21 1:37 PM
 * Given an integer array Arr of size N. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller. If next element is smaller, update the current index to that element. If not, then  -1.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {4, 2, 1, 5, 3}
 * Output:
 * 2 1 -1 3 -1
 * Explanation: Array elements are 4, 2, 1, 5
 * 3. Next to 4 is 2 which is smaller, so we
 * print 2. Next of 2 is 1 which is smaller,
 * so we print 1. Next of 1 is 5 which is
 * greater, so we print -1. Next of 5 is 3
 * which is smaller, so we print 3.  Note
 * that for last element, output is always
 * going to be -1 because there is no element
 * on right.
 * Example 2:
 * <p>
 * Input:
 * N = 6
 * Arr[] = {5, 6, 2, 3, 1, 7}
 * Output:
 * -1 2 -1 1 -1 -1
 * Explanation: Next to 5 is 6 which is
 * greater, so we print -1.Next of 6 is 2
 * which is smaller, so we print 2. Next
 * of 2 is 3 which is greater, so we
 * print -1. Next of 3 is 1 which is
 * smaller, so we print 1. Next of 1 is
 * 7 which is greater, so we print -1.
 * Note that for last element, output is
 * always going to be -1 because there is
 * no element on right.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function immediateSmaller() which takes the array of integers arr and n as parameters. You need to change the array itself.
 * <p>
 * ******************************************** Amazon Flipkart ***************************
 */
public class ImmediateSmallerElement {
    void immediateSmaller(int arr[], int n) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                arr[i] = arr[i + 1];
            else
                arr[i] = -1;
        }
        arr[n-1] =-1;
    }

    public static void main(String[] args) {
        new ImmediateSmallerElement().immediateSmaller(new int[]
                {4, 2, 1, 5, 5}, 5);
    }
}
