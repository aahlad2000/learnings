package august_25_2021;
/*
https://leetcode.com/problems/merge-intervals/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;

        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> output_arr = new ArrayList<>();
        int[] current_interval = intervals[0];
        output_arr.add(current_interval);
        for (int[] interval: intervals
             ) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = intervals[0][0];
            int next_end = intervals[1][0];
            if(current_end>= next_begin){

            }
        }

       return output_arr.toArray(new int [output_arr.size()][]);
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,4},{8,20}};
        MergeIntervals ob = new MergeIntervals();
        ob.merge(arr);
    }
}
