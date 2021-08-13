package august_13_2021;
/*
https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions
 */
public class PowerOdTwo {
    public static boolean isPowerofTwo(long n){
    if(n==0)
        return false;
    while (n!=1){
        if(n%2!=0)
            return false;
        n=n/2;
    }
    return true;
    }

}


