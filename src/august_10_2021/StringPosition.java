package august_10_2021;
/*
https://practice.geeksforgeeks.org/problems/implement-strstr/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions
 */

public class StringPosition {
    public static void main(String[] args) {

    }
    int strstr(String s, String x)
    {
        if(s.contains(x)){
            return s.indexOf(x);
        }
        else
            return -1;
    }
}

