package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 11/2/21 1:44 PM
 * Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 3
 * A = {{0, 0, 0},
 * {0, 0, 1},
 * {0, 1, 1}}
 * Output: 6
 * Explanation:
 * The first, second and third row contains 3, 2 and 1
 * zeroes respectively.
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * A = {{1, 1},
 * {1, 1}}
 * Output: 0
 * Explanation:
 * There are no zeroes in any of the rows.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function countZeros() which takes a 2D matrix as input and returns the number occurring only once.
 * <p>
 * Expected Time Complexity: O(N ).
 * Expected Auxiliary Space: O(1).
 * <p>
 * Constraints
 * 0 <   N  <= 103
 * 0 <= A[i] <= 1
 */

public class CountZerosInASortedMatrix {
    /*you are required to complete this method*/
    int countZeros(int A[][], int N) {
        // Your code here
        int countZero = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 0)
                    countZero++;
            }
        }
        return countZero;
    }

    public static void main(String[] args) {
        System.out.print(new CountZerosInASortedMatrix().countZeros(new int[][]{{1, 1}, {1, 1}}, 2));
    }
}
