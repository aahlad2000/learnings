package august_23_2021;
/*
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */

public class MinimumMaximum {
    static class Pair{
        int min;
        int max;
    }

    static Pair GetMinMax(int arr[], int n){
        Pair ob = new Pair();
        int i;
        if(n==1){
            ob.max =arr[0];
            ob.min =arr[0];
        }

        if(arr[0]>arr[1]){
            ob.max =arr[0];
            ob.min =arr[1];
        }
        else{
            ob.max =arr[1];
            ob.min =arr[0];
        }

        for (i=2; i<n; i++){
            if(arr[i]> ob.max){
                ob.max = arr[i];
            }
            else if(arr[i]<ob.min){
                ob.min = arr[i];
            }
        }

        return ob;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,78};
        int n =7;
        Pair ob1 = GetMinMax(arr,n);
        System.out.println("Max :"+ ob1.max);
        System.out.println("Min :"+ ob1.min);
    }
}
