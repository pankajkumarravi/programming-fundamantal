package com.java.hackerrank.ThitryDaysOfCoding.day4;

/**
 * @Author pankaj
 * @create 11/30/21 3:40 PM
A drawer contains socks of n different colours. The number of socks available of ith colour is given by a[i] where a is an array of n elements. Tony wants to take k pairs of socks out of the drawer. However, he cannot see the colour of the sock that he is picking. You have to tell what is the minimum number of socks Tony has to pick in one attempt from the drawer such that he can be absolutely sure, without seeing their colours, that he will have at least k matching pairs.

Example 1:

Input:
N = 4, K = 6
a[] = {3, 4, 5, 3}
Output: 15
Explanation:
All 15 socks have to be picked in order
to obtain 6 pairs.
Example 2:

Input: N = 2, K = 3
a[] = {4, 6}
Output: 7
Explanation: The Worst case scenario after 6
picks can be {3,3} or {1,5} of each
coloured socks. Hence 7th pick will ensure
3rd pair.
Your Task:
You don't need to read input or print anything. Complete the function find_min() which takes the array a[], size of array N, and value K as input parameters and returns the minimum number of socks Tony has to pick. If it is not possible to pick then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ a[i] ≤ 106
 ************************************ Amazon *******************************
 */
public class NumberOfMinimumPicksTogetKpairsofsocksfromAdrawer {
    public int find_min(int[] a, int n, int k) {
        // code here.
        int max=0;
        for(int i=0;i<n;i++)
            max +=a[i]/2;

        if(k>max)
            return -1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(a[i]-1)/2;
        }

        if(k>sum)
            return 2*sum+n+(k-sum);

        else
            return 2*(k-1)+n+1;

    }
}
// ========================= vvi ===============