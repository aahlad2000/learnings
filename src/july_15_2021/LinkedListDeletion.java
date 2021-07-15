package july_15_2021;
/*https://practice.geeksforgeeks.org/problems/java-collections-set-7-linkedlist/0/?category[]=Java-Collections&category[]=Java-Collections&difficulty[]=
0&page=1&query=category[]Java-Collectionsdifficulty[]0page1category[]Java-Collections*/
class GfG{
    void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;

    }
}