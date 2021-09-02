package august_31_2021;

import java.util.Scanner;
import java.util.Stack;

/*
https://practice.geeksforgeeks.org/problems/geek-and-books/0/?category[]=Stack&category[]=Stack&difficulty[]=0&page=1&query=category[]Stackdifficulty[]0page1category[]Stack
 */
public class GeeksAndBooks {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            Stack<Integer> st = new Stack<>();
            int Q = sc.nextInt();

            while(Q-->0){
                String str = sc.next();
                if(str.equals("place")){
                    st.push(sc.nextInt());
                }else{
                    if(!st.isEmpty()){
                        System.out.print(st.pop()+" ");
                    }else{
                        System.out.print("-1 ");
                    }

                }
            }
            System.out.println();
        }
    }
}
