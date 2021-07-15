package july_15_2021;

class GfG{
    void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;

    }
}