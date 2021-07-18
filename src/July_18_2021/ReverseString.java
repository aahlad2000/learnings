package July_18_2021;

/*https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/0/?category[]=Java&category[]=Java&problemStatus=unsolved&
page=1&query=category[]JavaproblemStatusunsolvedpage1category[]Java*/

class Solution {
    static String revStr(String S) {
        String str = S;
        String rev = "";

        int len = S.length();
        for(int i = len - 1; i>=0; i--){
            rev += str.charAt(i);
        }

        return rev;
    }
}