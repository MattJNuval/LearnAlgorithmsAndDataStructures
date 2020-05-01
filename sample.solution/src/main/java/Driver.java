import java.util.*;

public class Driver {
    public static void main(String args[]) {
        AbstractMap<Integer, String> abstractMap = new HashMap<>();
        abstractMap.put(1, "Mathew");
        abstractMap.put(2, "Joshua");
        abstractMap.put(3, "Daniel");

        HashtableDemo hashtableDemo = new HashtableDemo(abstractMap);

        System.out.println(hashtableDemo.printHashtable());
        System.out.println(hashtableDemo.printKeys());
        System.out.println(hashtableDemo.printValue());



    }
}
