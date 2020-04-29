

public class Graphs {
    public Node[] nodes;

    public Graphs(int nNodes) {
        this.nodes = new Node[nNodes];
        initialize(nodes);
    }

    public Node[] initialize(Node[] nodes) {
        for(int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
            nodes[i].data = i;
            nodes[i].children = new Node[nodes.length];
            for(int j = 0; j < nodes[i].children.length; j++) {
                nodes[i].children[j] = new Node();
            }
        }
        return nodes;
    }

    public Node[] setDest(int src, int dest) {
        nodes[src].children[dest].data = dest;
        return nodes;
    }

    public void printGraph() {
        for(int i = 0; i < nodes.length; i++) {
            System.out.println("Current node: " + nodes[i].data);
            for(int j = 0; j < nodes[i].children.length; j++) {
                System.out.print(nodes[i].children[j].data + ", ");
            }
            System.out.println();
        }
    }

}
