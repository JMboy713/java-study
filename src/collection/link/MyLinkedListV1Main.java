package collection.link;

import collection.array.MyArrayListV1;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("데이터 추가");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.indexOf("c"));
        System.out.println(list.set(2,"d"));
        System.out.println(list);
    }
}
