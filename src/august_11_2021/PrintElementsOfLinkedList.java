package august_11_2021;

/*
https://practice.geeksforgeeks.org/problems/print-linked-list-elements/0/?problemType=functional&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemTypefunctionaldifficulty[]-2difficulty[]-1page1sortBysubmissions
 */


public class PrintElementsOfLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void display(Node head)
    {
        Node temp = head;
        while (temp!=null)
            System.out.print(temp.data + " ");
        temp = temp.next;
    }

    public static void main(String[] args) {


    }
}
