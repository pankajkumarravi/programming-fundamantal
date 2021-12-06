package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 12:37 PM
 * Given a stack of integers of size N, your task is to complete the function pairWiseConsecutive(), that checks whether numbers in the stack are pairwise consecutive or not. The pairs can be increasing or decreasing, and if the stack has an odd number of elements, the element at the top is left out of a pair. The function should retain the original stack content.
 * <p>
 * Only following standard operations are allowed on stack.
 * <p>
 * push(X): Enter a element X on top of stack.
 * pop(): Removes top element of the stack.
 * empty(): To check if stack is empty.
 * Input Format:
 * The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains n denoting the number of elements to be inserted into the stack. The second line contains the elements to be inserted into the stack.
 * <p>
 * Output Format:
 * For each testcase, in a new line, print "Yes"(without quote) if the elements of the stack is pairwise consecutive, else print "No".
 * <p>
 * Your Task:
 * This is a function problem. You only need to complete the function pairWiseConsecutive that takes a stack as an argument and returns true if the stack is found to be pairwise consecutive, else it returns false. The printing is done by the driver code.
 * <p>
 * Constraints:
 * 1 < =T <= 100
 * 1 < =N <= 103
 * <p>
 * Example:
 * Input:
 * 2
 * 6
 * 1 2 3 4 5 6
 * 5
 * 1 5 3 9 7
 * Output:
 * Yes
 * No
 * <p>
 * Explanation:
 * Testcase1: The number of elements are even and they are pairwise consecutive so we print Yes.
 * Testcase2: The number of elements are odd so we remove the top element and check for pairwise consecutive. It is not so we print No.
 */
public class PairwiseConsecutiveElements {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        if (st.size() % 2 != 0) {
            st.pop();
        }
        int sizeOfSt = st.size();
        while (sizeOfSt-- > 1) {
            int check = st.pop() - st.peek();
            if (check == 1 || check == -1) {
                continue;
            } else return false;
        }
        return true;
/*    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        // Your code here
        boolean t = true;

        if(st.size()%2 == 0){

            for(int y = 0; y < st.size();y++){
                int p = st.pop();
                if(p == st.peek() + 1){
                    st.pop();
                }else{
                    if(p == st.peek() - 1){
                        st.pop();
                    }else{
                        t = false;
                    }
                }
            }

        }else{
            st.pop();
            for(int y = 0; y < st.size();y++){
                int p = st.pop();
                if(p == st.peek() + 1){
                    st.pop();
                }else{
                    if(p == st.peek() - 1){
                        st.pop();
                    }else{
                        t = false;
                    }
                }
            }
        }
        return t;*/
    }
}
