package July_18_2021;
/*https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1/?category[]=Java&category[]=Java&probl
emStatus=unsolved&page=1&query=category[]JavaproblemStatusunsolvedpage1category[]Java#*/


class StringReversal {
    static String conRevstr(String S1, String S2) {
        String str = "";
        str = S1+S2;

        int len = str.length();
        String rev = "";

        for(int i = len-1; i>=0; i--){
            rev += str.charAt(i);
        }

        return rev;
    }
}