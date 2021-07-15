package july_15_2021;
/*https://practice.geeksforgeeks.org/problems/common-elements5420/0/?category[]=Java-Collections&category[]=Java-
Collections&difficulty[]=0&page=1&query=category[]Java-Collectionsdifficulty[]0page1category[]Java-Collections*/
class Solution{
    public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        ArrayList<Integer> comm = new ArrayList<Integer>();

        int i =0, j=0;
        Collections.sort(v1);
        Collections.sort(v2);

        while(i<v1.size()&& j<v2.size()){
            int a = v1.get(i);
            int b = v2.get(j);
            if(a==b){
                comm.add(a);
                i++;
                j++;
            }

            else if(a<b){
                i++;
            }

            else
                j++;
        }

        Collections.sort(comm);

        return comm;
    }
}