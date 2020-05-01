import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Driver {
    public static void main(String args[]) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(3);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);

        System.out.println("HashSet: "+ hashSet);
        System.out.println("LinkedHashSet: "+ linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

    }
}
