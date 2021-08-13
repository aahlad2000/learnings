package august_13_2021;
/*
https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions
 */

public class AlternateElementsArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        print(a,4);
    }
    public static void print(int arr[], int n)
    {
     for(int i=0; i<n; i++){
         if(i%2==0)
         System.out.println(arr[i] + " ");
     }
    }

}
