package september_1_2021;

import java.util.Stack;

/*
https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/0/?category[]=Stack&category[]=Stack&difficulty[]=0&page=1&query=category[]Stackdifficulty[]0page1category[]Stack#
 */
public class ReverseStringStack {
    public static String reverse(String S) {
        int n = S.length();
        String store = "";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(S.charAt(i));
        }

        while (!s.isEmpty()) {
            store += s.pop();
        }
        return store;

    }

    public static void main(String[] args) {
        String str = "aahlad";
        reverse(str);
    }
}
