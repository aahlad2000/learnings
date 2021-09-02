package august_24_2021;
/*
https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 */

public class MaximumSubArray {
    int maxSubarraySum(int arr[], int n){

        int maxSum = 0;
        int currSum = 0;
        for (int i = 1; i<n; i++){
            currSum += arr[i];

            if (currSum > maxSum){
                maxSum = currSum;
            }

            if (currSum<0){
                currSum = 0;
            }
        }
    return maxSum;
    }
}
