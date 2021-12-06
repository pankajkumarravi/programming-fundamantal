package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 5:22 PM
 * Now, we'll try to solve a famous stack problem.
 * You are given an array A of size N. You need to first push the elements of the array into a stack and then print minimum in the stack at each pop.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A = {1 2 3 4 5}
 * Output:
 * 1 1 1 1 1
 * Explanation:
 * After pushing elements to the stack,
 * the stack will be "top -> 5, 4, 3, 2, 1".
 * Now, start popping elements from the stack
 * popping 5: min in the stack is 1.popped 5
 * popping 4: min in the stack is 1. popped 4
 * popping 3: min in the stack is 1. popped 3
 * popping 2: min in the stack is 1. popped 2
 * popping 1: min in the stack is 1. popped 1
 * Example 2:
 * <p>
 * Input:
 * N = 7
 * A = {1 6 43 1 2 0 5}
 * Output:
 * 0 0 1 1 1 1 1
 * Explanation:
 * After pushing the elements to the stack,
 * the stack will be 5->0->2->1->43->6->1.
 * Now, poping the elements from the stack:
 * popping 5: min in the stack is 0. popped 5
 * popping 0: min in the stack is 0. popped 0
 * popping 2: min in the stack is 1. popped 2
 * popping 1: min in the stack is 1. popped 1
 * popping 43: min in the stack is 1.
 * popped 43
 * popping 6: min in the stack is 1. popped 6
 * popping 1: min in the stack is 1. popped 1.
 * <p>
 * <p>
 * <p>
 * Your Task:
 * Since this is a function problem, you don't need to take any input. Just complete the provided functions _push() and _getMinAtPop(). The _push() function takes an array as parameter, you need to push all elements of this array onto a stack and return the stack. The _getMinAtPop() accepts a stack as a parameter which is returned by _push() function and prints minimum in the stack at each pop separated by spaces.
 * <p>
 * <p>
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * <p>
 * <p>
 * Constraints:
 * 1 <= Ai <= 107
 */
public class GetMinAtPop {
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> stack= new Stack<Integer>();
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<n;i=i+1){
            if(minimum>arr[i]){
                minimum=arr[i];
            }
            stack.push(minimum);
        }

        return stack;
    }

    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}

// ------------------- TQ ===============