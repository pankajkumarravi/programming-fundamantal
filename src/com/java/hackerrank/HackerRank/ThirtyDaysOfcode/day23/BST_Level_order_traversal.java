package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// https://www.hackerrank.com/challenges/30-binary-trees/problem?isFullScreen=true

public class BST_Level_order_traversal {
    static void levelOrder(Node root) {
        //Write your code here
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }


   /*     public static Node insert (Node root,int data){
            if (root == null) {
                return new Node(data);
            } else {
                Node cur;
                if (data <= root.data) {
                    cur = insert(root.left, data);
                    root.left = cur;
                } else {
                    cur = insert(root.right, data);
                    root.right = cur;
                }
                return root;
            }
        }
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            Node root = null;
            while (T-- > 0) {
                int data = sc.nextInt();
                root = insert(root, data);
            }
            levelOrder(root);
        }

    }*/

    }
}