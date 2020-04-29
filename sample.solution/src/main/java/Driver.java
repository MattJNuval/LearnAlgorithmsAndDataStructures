public class Driver {
    public static void main(String args[]) {
        Graphs graphs = new Graphs(5);

        graphs.setDest(0,1);
        graphs.setDest(0,3);
        graphs.setDest(1,2);
        graphs.setDest(1,3);
        graphs.setDest(1,4);
        graphs.setDest(2,3);
        graphs.setDest(2,4);

        graphs.printGraph();


    }
}
