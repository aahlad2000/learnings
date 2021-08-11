package august_9_2021;
/*
https://practice.geeksforgeeks.org/problems/third-largest-element/1/?company[]=Amazon&company[]=Amazon&problemType=functional&difficulty[]=-1&page=1&sortBy=submissions&query=company[]AmazonproblemTypefunctionaldifficulty[]-1page1sortBysubmissionscompany[]Amazon
 */

public class ThirdLargestElement {
    public static void main(String args[]){

    }
    int thirdLargest(int a[], int n)
    {
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;
        for(int i = 0; i<n; i++){

          if(a[i]>max1){
              max3 = max2;
              max2 = max1;
              max1 = a[i];
          }
          else if(a[i]>max2){
              max3 = max2;
              max2 = a[i];
            }
          else if(a[i]>max3){
              max3 = a[i];
          }
        }
      return max3;

    }

}
