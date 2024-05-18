package collection.array;

import java.util.ArrayList;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3(5);


        System.out.println("데이터 추가");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(3,"d");
        list.add("d");
        list.add("d");


        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.indexOf("c"));
        System.out.println(list.set(1,"d"));
        System.out.println(list);

        Object remove = list.remove(2);
        System.out.println(remove);


    }
}
