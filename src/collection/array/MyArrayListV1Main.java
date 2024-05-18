package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1(5);
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
