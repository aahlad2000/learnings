package august_9_2021;

import java.util.Arrays;

/*
https://practice.geeksforgeeks.org/problems/find-the-median0527/1/?company[]=Amazon&company[]=Amazon&problemType=functional&difficulty[]=-2&difficulty[]=-1&page=2&sortBy=submissions&query=company[]AmazonproblemTypefunctionaldifficulty[]-2difficulty[]-1page2sortBysubmissionscompany[]Amazon
 */
public class MedianOfArray {
    public static void main(String args[]){
        int arr[] = {3,4,9009,66};
        find_median(arr);
    }
    public static int find_median(int[] v)
    {
        int size = v.length;
        int mid = size / 2;

        Arrays.sort(v);

        if(size % 2 == 0) return (v[mid] + v[mid - 1]) / 2;
        return v[mid];
    }
}
