package july_15_2021;
class Solution{

    public static int unique_substring(String str){

        int count = 0;
        HashSet<String> hs = new HashSet<String>();

        for (int i = 0; i<str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                String val = str.substring(i,j);
                if(!hs.contains(val)){
                    hs.add(val);
                    count++;
                }
            }
        }
        return count;
    }
}