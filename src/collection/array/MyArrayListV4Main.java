package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> MyArrayListV4 = new MyArrayListV4<>();
        MyArrayListV4.add("a");
        MyArrayListV4.add("b");
        MyArrayListV4.add("c");
        String s = MyArrayListV4.get(2);
        System.out.println(s);

        MyArrayListV4<Integer> MyArrayListV4Int = new MyArrayListV4<>();
        MyArrayListV4Int.add(1);
        MyArrayListV4Int.add(2);
        MyArrayListV4Int.add(3);
        Integer integer = MyArrayListV4Int.get(2);
        System.out.println(integer);



    }
}
