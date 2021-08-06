package july_15_2021;

import java.util.HashSet;

/*https://practice.geeksforgeeks.org/problems/unique-substrings0524/0/?category[]=Java-Collections&category[]
=Java-Collections&difficulty[]=0&page=1&query=category[]Java-Collectionsdifficulty[]0page1category[]Java-Collections*/
class UniqueSubstrings {

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