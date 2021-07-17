package july_17_2021;

/*https://practice.geeksforgeeks.org/problems/java-exception-handling/0/?cate
gory[]=Java&category[]=Java&problemStatus=solved&page=1&query=category[]JavaproblemStatussolvedpage1category[]Java*/
class TestClass
{
    int a,b,result,min;


    TestClass(int x,int y){
        a = x;
        b = y;
    }

    public void findMin(){
        int arr[] = new int[4];
        arr[0] = a*b;
        arr[1] = a-b;
        arr[2] = a+b;

        try{
            arr[3] = a/b;
        }

        catch(Exception e){
            System.out.print("");

        }

        min = arr[0];
        for(int i =0;i<4;i++){
            if(arr[i]<min)
                min = arr[i];

        }

        System.out.println(min);
    }

}