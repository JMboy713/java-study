package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);


    }
    private static void run(Set<String> set) {
        System.out.println("set= " + set.getClass());
        set.add("c");
        set.add("b");
        set.add("a");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " ");
        }
    }
}
