package august_10_2021;
/*
https://practice.geeksforgeeks.org/problems/product-of-array-element/1/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions#
 */

public class ProductOfArrayElements {
    public static void main(String[] args) {

    }
    public static Long product(Long arr[], Long mod, int n)
    {
        long  res = 1;
        for (int i = 0; i<n; i++){
            res = (res*arr[i]) % mod;

        }
        return res;
    }
}
