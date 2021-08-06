package july_17_2021;

import java.util.Stack;

/*https://practice.geeksforgeeks.org/problems/java-collections-set-1-stack5707/0/?category[]=
Java&category[]=Java&problemStatus=solved&page=1&query=category[]JavaproblemStatussolvedpage1category[]Java*/
class StackOp {
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        Stack<Integer> st1 = new Stack<>();
        int mid = st.size()/2;

        while(mid-->0){
            st1.push(st.pop());
        }

        st.pop();

        while(!st1.isEmpty()){
            st.push(st1.pop());
        }

        return st;

    }
}