package july_15_2021;

/*https://practice.geeksforgeeks.org/problems/deque-implementations/0/?category[]=Java-Collections&category[]=Java
-Collections&difficulty[]=0&page=1&query=category[]Java-Collectionsdifficulty[]0page1category[]Java-Collections*/
 */
public static void push_back_pb(ArrayDeque<Integer> dq, int x)
        {


        dq.addLast(x);

        }

//Function to pop element from back of the deque.
public static void pop_back_ppb(ArrayDeque<Integer> dq)
        {
        if(!dq.isEmpty()){
        dq.removeLast();
        }
        else return;
        }

//Function to return element from front of the deque.
public static int front_dq(ArrayDeque<Integer> dq)
        {
        if(!dq.isEmpty())
        return dq.peekFirst();
        else
        return -1;
        }


//Function to push element x to the front of the deque.
public static void push_front_pf(ArrayDeque<Integer> dq, int x)
        {
        dq.addFirst(x);
        }