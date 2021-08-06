package July_26;

public class AverageValue {
    public static void main(String args[]){
        int []a = {1,2,4,6,7};
        int sum=0;
        for (int i =0; i<5;i++){
            sum += a[i];
        }
        int n = sum/a.length;
        System.out.println(n);
    }
}
