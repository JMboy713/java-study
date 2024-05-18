package collection.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(5);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("데이터 추가");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("s");
        list.add("d");
        list.add("d");


        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.indexOf("c"));
        System.out.println(list.set(2,"d"));
        System.out.println(list);
    }
}
