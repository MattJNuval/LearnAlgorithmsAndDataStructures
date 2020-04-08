public class Node {
    public int getData() {
        return data;
    }

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
