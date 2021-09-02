package august_24_2021;
/*
https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
 */

import java.util.HashSet;

public class UnionArrays {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i=0; i<n; i++){
            res.add(a[i]);
        }
        for (int j=0; j<m; j++ ){
            res.add(b[j]);
        }

        return res.size();
    }

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6};
        int b[] ={1,2,3};
        int n = a.length;
        int m = b.length;
        System.out.println(doUnion(a,n,b,m));
    }
}
