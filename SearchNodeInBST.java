/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

public class SearchNodeInBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    boolean search(Node root, int x) {
        // Your code here
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(root.left!=null){
            if(root.left.data==x){
                return true;
            }
        }
        if(root.right!=null){
            if(root.right.data==x){
                return true;
            }
        }
        return search(root.left,x) || search(root.right,x);
    }
}
