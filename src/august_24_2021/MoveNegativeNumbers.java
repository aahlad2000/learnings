package august_24_2021;
/*
https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
 */

public class MoveNegativeNumbers {
    static void  RearrangeArray(int arr[], int n){
        int j = 0;
        int temp;
        for (int i=0 ; i<n; i++){
            if (arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int arr[], int n){
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] ={2,3,8,4,-1,-1,-7};
        int k = 7;
        RearrangeArray(arr,k);
        printArray(arr,k);
    }
}
