package august_7_2021;
/*
https://practice.geeksforgeeks.org/problems/multiply-two-strings/1/?company[]=Amazon&company[]=Amazon&problemType=functional&page=3&sortBy=submissions&query=company[]AmazonproblemTypefunctionalpage3sortBysubmissionscompany[]Amazon
 */

import java.math.BigInteger;

public class MultiplyTwoStrings {
    public static void main(String args[]){
        MultiplyTwoStrings ob = new MultiplyTwoStrings();
        ob.multiplyStrings("55","10");


    }
    public  String multiplyStrings(String s1, String s2)
    {
        BigInteger i = new BigInteger(s1);
        BigInteger j = new BigInteger(s2);
        BigInteger k = i.multiply(j);

        return k.toString();
    }
}
