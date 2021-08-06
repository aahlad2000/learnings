package august_6_2021;
/*
https://practice.geeksforgeeks.org/problems/count-squares3649/1
 */
public class CountSquares {
    public static void main(String args[]){
        System.out.println(Math.sqrt(8));
    }
    static int countSquares(int N) {
     int count = 0;
     for(int i = 1; i*i<N; i++){
         count++;
        }
     return count;
    }
}
