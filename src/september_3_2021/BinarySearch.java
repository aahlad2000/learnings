package september_3_2021;

public class BinarySearch {
    public static int search(int arr[], int l, int r,int x){
        if(r>=l){
            int m = l + (r-l)/2;
            if(arr[m]==x){
                return m;
            }
            if(arr[m]>x){
                return search(arr,l,m-1,x);
            }
            if(arr[m]<x){
                return search(arr,m+1,r,x);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,7,9,11,14,16};
        int n = arr.length;;
        int x =14;
        int res = search(arr,0,7,x);
        if(res == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at: " + res);

    }
}
