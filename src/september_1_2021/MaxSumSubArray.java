package september_1_2021;
/*
https://practice.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0/?category[]=Stack&category[]=Stack&difficulty[]=0&page=1&query=category[]Stackdifficulty[]0page1category[]Stack#
 */

public class MaxSumSubArray {
    public static long pairWithMaxSum(long arr[], long N)
    {
        long res = 0;
        for(int i=0; i<N-1; i++){
            res = Math.max(res, arr[i]+arr[i+1]);
        }
        return res;
    }

    public static void main(String[] args) {
        long ar[] = {1,2,3,4,5,6};
        pairWithMaxSum(ar,5);
    }
}
