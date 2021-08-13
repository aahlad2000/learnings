package august_13_2021;
/*
https://practice.geeksforgeeks.org/problems/preorder-traversal/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions#
 */

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static ArrayList<Integer> preorder(Node root)
    {
     ArrayList<Integer> res = new ArrayList<>();
     if(root==null){
         return res;
     }
     Stack<Node> st = new Stack<>();
     Node current = root;

     while(current!=null||!st.isEmpty()){
         while(current!=null){
             res.add(current.data);
             st.push(current);
             current = current.left;
         }
         Node temp = st.pop();
         current = temp.right;
     }
     return res;
    }

    public static void main(String[] args) {

    }
}
