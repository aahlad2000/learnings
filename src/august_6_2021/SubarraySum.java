package august_6_2021;
/*
 https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1#
 */
import java.util.ArrayList;

/**
 * 1 2 3 7 5
 *
 * 1, 1
 * 2, 3
 */
public class SubarraySum {

    public static void main (String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 7;
        arr[4] = 5;

        int n = 5;
        int s = 12;
        System.out.println(
                subarraySum(arr, n, s).toString()
        );
    }

    static ArrayList<Integer> subarraySum (int[] arr, int n, int s)
    {
        ArrayList<Integer> indices = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i<n; i++){
            indices.add(i + 1);
            for(int j = i; j<n; j++){
                sum += arr[j];
                if(sum == s){
                    indices.add(j + 1);
                    return indices;
                } else if (sum > s) {
                    indices.clear();
                    sum = 0;
                    break;
                }

            }
        }
        indices.clear();
        indices.add(-1);
        return indices;
    }
}
