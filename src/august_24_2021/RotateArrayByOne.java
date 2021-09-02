package august_24_2021;
/*
https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
 */

public class RotateArrayByOne {
    public void rotate(int arr[], int n)
    {
        int last = arr[n-1];
        int first = arr[0];
        int temp;
        for (int i = 0; i<n-1; i++){
            temp = arr[i+1];
            arr[i+1] = first;
            first = temp;
        }
        arr[0] = last;
    }

    public void PrintArray(int arr[], int n){
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        RotateArrayByOne ob = new RotateArrayByOne();
        ob.rotate(arr,5);
        ob.PrintArray(arr,5);
    }
}
