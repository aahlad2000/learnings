package august_11_2021;
/*
https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions
 */

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2};
        doUnion(arr1,5,arr2,2);
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i=0; i<n; i++){
            res.add(a[i]);
        }
        for (int j=0; j<m; j++){
            res.add(b[j]);
        }

        return res.size();
    }
}
