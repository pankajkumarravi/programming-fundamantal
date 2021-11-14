package com.java.hackerrank.GFG.Dell;

/**
 * @Author pankaj
 * @create 11/13/21 1:36 PM
The task is to complete the insert() function which is used to implement Insertion Sort.


Example 1:

Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10

Your Task:
You don't have to read input or print anything. Your task is to complete the function insert() and insertionSort() where insert() takes the array, it's size and an index i and insertionSort() uses insert function to sort the array in ascending order using insertion sort algorithm.

Expected Time Complexity: O(N*N).
Expected Auxiliary Space: O(1).

 *********************************************  Accenture Cisco Dell Grofers Juniper Networks MAQ Software Veritas Microsoft ***************************
 */
public class InsertionSort {
    static void insert(int arr[],int i) {
        // Your code here
        int value;
        if (arr[i] <arr[i-1]){
            value = arr[i];
            arr[i] =arr[i-1];
            arr[i=1] = value;
        }
    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n) {
        //code here
        for(int i=0;i<n;i++){
            for (int j=i;j>0;j--){
                insert(arr,j);
            }
        }
    }
}
