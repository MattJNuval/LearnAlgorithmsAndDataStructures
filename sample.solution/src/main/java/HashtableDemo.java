import java.util.AbstractMap;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

public class HashtableDemo {

    private AbstractMap<Integer, String> abstractMap;

    public HashtableDemo(AbstractMap<Integer, String> abstractMap) {
        this.abstractMap = abstractMap;
    }

    public String printHashtable() {
        return abstractMap + "";
    }

    public String printKeys() {
        Set<Integer> keySet = abstractMap.keySet();
        return keySet + "";
    }

    public String printValue() {
        String results = "";
        Iterator<Integer> integerIterator = abstractMap.keySet().iterator();
        while(integerIterator.hasNext()) {
            results += abstractMap.get(integerIterator.next()) + ", ";
        }
        return results;
    }

}
