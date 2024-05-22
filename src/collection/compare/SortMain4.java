package collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println("기본 데이터");
        System.out.println(list);



        System.out.println("Comparator 비교");
        list.sort(null);
        Collections.sort(list);


        System.out.println("ID정렬");
        list.sort(new IdComparator());
        System.out.println(list);

        System.out.println("ID정렬 reverse");
        list.sort(new IdComparator().reversed());
        System.out.println(list);

    }
}
