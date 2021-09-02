package august_23_2021;
/*
https://www.geeksforgeeks.org/array-rotation/
 */

public class ArrayRotation {

//Used for rotation of 'd'
    void LeftRotate(int arr[], int d, int n){
        for (int i = 0; i<d; i++){
            LeftRotateByOne(arr,n);
        }
    }

    void LeftRotateByOne(int arr[],int n){
        //for storing first element in every case
        int temp = arr[0];
        //used for swapping
        for (int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        //for storing of first element in last element
        arr[n-1] = temp;
    }

    void PrintArray(int arr[], int n){
        for(int i =0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        ArrayRotation ob = new ArrayRotation();
        int arr[] = {1,2,3,4,5,6,7};
        ob.LeftRotate(arr,2,7);
        ob.PrintArray(arr,7);
    }
}
