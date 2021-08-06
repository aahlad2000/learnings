package July_26;

public class DeleteAndReplace {
    public static void main(String args[]){
        String s = "Hello";
        int n = s.length();
        String r = "";

        for(int i=0; i<n; i++){
            if(i%2==0)
                r += "h" ;

            else
                r += s.charAt(i) ;       }

    }
}
