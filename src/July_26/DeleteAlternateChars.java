package July_26;

/*https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1/?category[]=Java&category[
]=Java&problemStatus=unsolved&page=1&query=category[]JavaproblemStatusunsolvedpage1category[]Java#*/
class Solution {
    static String delAlternate(String S) {
        int  n = S.length();
        String result = "";

        for(int i = 0; i<n; i++){
            if(i%2==0)
                result += S.charAt(i);
        }

        return result;

    }
}