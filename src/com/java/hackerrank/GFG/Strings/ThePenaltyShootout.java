package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/4/21 5:21 PM
Given a string S contains 0's, 1's, and 2's, the task is to find the number of goals on the penalty.

'1' stands for "goal".
'0' stands for "no goal".
'2' stands for a foul which gives a penalty.
Example 1:

Input: S = "1012012112110"
Output: 2
Explanation: There are 3 penalties,
of which he scores only 2.
1012012112110

Example 2:

Input: S = "111122"
Output: 0
Explanation: No goal on penalty
Your Task:
You don't need to read input or print anything. Your task is to complete the function penaltyScore() which takes a string S as input and returns the goals count on the penalty.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1 <= |N| <= 105
 */
public class ThePenaltyShootout {
    public int penaltyScore(String S) {
        // Your code goes here
         int cont =0;
        for (int i=0;i<S.length()-1;i++){
            if (S.charAt(i) == '2')
                if (S.charAt(i+1) == '1')
                    cont++;
        }
        return  cont;
    }
}
