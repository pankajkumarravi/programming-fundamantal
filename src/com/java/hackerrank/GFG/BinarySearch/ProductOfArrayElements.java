package com.java.hackerrank.GFG.BinarySearch;

/**
 * @Author pankaj
 * @create 11/1/21 4:54 PM
This is a functional problem . Your task is to return the product of array elements under a given modulo.
The modulo operation finds the remainder after division of one number by another. For example, K(mod(m))=K%m= remainder obtained when K is divided by m.

Input:

The first line of input contains T denoting the number of testcases.Then each of the T lines contains a single positive integer N denotes number of element in array. Next line contain 'N' integer elements of the array.


Output:

Return the product of array elements under a given modulo.
That is, return (Array[0]*Array[1]*Array[2]...*Array[n])%modulo.

 */
public class ProductOfArrayElements {
    public static Long product(Long arr[], Long mod, int n) {
        //your code here
        long sum=1;
        for (int i=0;i<n;i++){
            sum =sum*arr[i]%mod;
        }
        return sum%mod;
    }
}
