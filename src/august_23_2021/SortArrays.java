package august_23_2021;
/*
https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 */

public class SortArrays {
    public static void sort012(int a[], int n)
    {
        int l=0;
        int m=0;
        int h=n-1;
        int temp;

        while(m<=h){
            switch(a[m]){
                case 0: {
                    temp = a[l];
                    a[l] = a[m];
                    a[m] = temp;
                    l++;
                    m++;
                    break;
                }
                case 1: {

                    m++;
                    break;
                }
                case 2: {
                    temp = a[m];
                    a[m] = a[h];
                    h--;
                    break;
                }
            }


        }
    }

    public static void main(String[] args) {
        SortArrays ob = new SortArrays();
        int a[] ={0,2,1,0,2,1};
        int n = 6;
        ob.sort012(a,n);
    }
}
