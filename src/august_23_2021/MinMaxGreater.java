package august_23_2021;

public class MinMaxGreater {

    static class Pair{
        int max;
        int min;
    }

    static Pair getValues(int arr[], int n){
        Pair ob = new Pair();
        ob.min = arr[0];
        for (int i = 0; i<n; i++){
            if(arr[i]<ob.min){
                ob.min = arr[i];
            }
            else  if(arr[i]>ob.max){
                ob.max = arr[i];
            }
            }
        return ob;
        }

    public static void main(String[] args) {
        int arr[] = {6,3,1,7};
        int n = 4;
        Pair ob = getValues(arr,n);
        System.out.println("Max " +ob.max);
        System.out.println("Min " +ob.min);
    }
    }

