package com.java.hackerrank.GFG.Sorting;

/**
 * @Author pankaj
 * @create 11/2/21 11:30 AM
 * Given a binary array A[] of size N. The task is to arrange the array in increasing order.
 * <p>
 * Note: The binary array contains only 0  and 1.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A[] = {1,0,1,1,0}
 * Output: 0 0 1 1 1
 * Example 2:
 * <p>
 * Input:
 * N = 10
 * A[] = {1,0,1,1,1,1,1,0,0,0}
 * Output: 0 0 0 0 1 1 1 1 1 1
 * Your Task:
 * Complete the function SortBinaryArray() which takes given array as input and returns the sorted array.
 * <p>
 *
 * *****************************   Accolite Amazon InfoEdge Intuit MakeMyTrip Paytm Zoho *******************
 */
public class BinaryArraySorting {

    static int[] SortBinaryArray(int arr[], int n) {
        // code here
        // taking more than expected time
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j ];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;*/
       int i=0,j=n-1;
        while (i<j){
            while (arr[i] == 0)
                i++;
            while (arr[j] ==1)
                j--;
            if (i<j){
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] resp = new BinaryArraySorting().SortBinaryArray(new int[]{1, 0, 1, 1, 0}, 5);
        for (int v : resp) {
            System.out.print(v + " ");
        }
    }
}

//============================= Optimize and fix it ======================