package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        System.out.println("데이터 추가");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(1));


        MyLinkedListV3<Integer> listV3 = new MyLinkedListV3<>();
        listV3.add(1);
        listV3.add(2);
        listV3.add(3);
        Integer i = listV3.get(0);
        System.out.println(i);
    }
}
