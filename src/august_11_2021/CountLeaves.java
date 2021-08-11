package august_11_2021;
/*
https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions#
 */
public class CountLeaves {
    class Node
    {
        int data;
        Node left, right;
    }
    int countLeaves(Node node)
    {
     if(node==null)
         return 0;
     if(node.left==null && node.right==null)
         return 1;
     else{
         return countLeaves(node.left)+countLeaves(node.right);
     }
    }
}

