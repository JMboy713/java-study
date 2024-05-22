package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 10);

        TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);

        System.out.println("기본 데이터");
        System.out.println(treeSet);



        System.out.println("Comparator 비교");
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(a);
        treeSet2.add(b);
        treeSet2.add(c);
        System.out.println(treeSet2);






    }
}
