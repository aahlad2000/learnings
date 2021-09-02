package august_30_2021;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseElementsQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        int l = q.size();
        Stack<Integer> st = new Stack<Integer>();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0; i<k; i++){
            st.push(q.remove());
        }
        for(int j=k; j<l; j++){
            qu.add(q.remove());
        }
        while(!st.empty()){
            q.add(st.pop());
        }

        q.addAll(qu);
        return q;
    }

    public static void main(String[] args) {

    }
}
