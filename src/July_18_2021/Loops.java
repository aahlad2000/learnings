package July_18_2021;
/*https://practice.geeksforgeeks.org/problems/java-loops-se
t-11726/0/?category[]=Java&category[]=Java&problemStatus=unsolved&page=1&query=category[]JavaproblemStatusunsolvedpage1category[]Java#*/


class Solution{
    static ArrayList<Integer> getSum(int N){

        ArrayList<Integer> list = new ArrayList<Integer>();
        int odd = 0, even = 0;

        for(int i =0; i<=N; i++){

            if(i%2==0){
                even += i;
            }

        }

        for(int i = 0; i<=N; i++){

            if(i%2!=0){
                odd += i;
            }
        }

        list.add(even);
        list.add(odd);

        return list;

    }
}