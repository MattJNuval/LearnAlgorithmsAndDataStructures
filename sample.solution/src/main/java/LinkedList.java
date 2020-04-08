public class LinkedList {
    public Node root;

    public void insert(int data) {
        insertNode(data, root);
    }

    public void insertNode(int data, Node curr) {
        Node newNode = new Node(data);
        curr = newNode;
        curr.setNext(root);
        root = curr;
    }

    public void printList() {
        printListNode(root);
    }

    public void printListNode(Node curr) {
        if(root == null) {
            throw new NullPointerException("No data inserted in Linked List.");
        } else {
            if(curr != null) {
                System.out.print(curr.getData() + " --> ");
                printListNode(curr.getNext());
            } else {
                System.out.println(" null");
            }
        }
    }
}
