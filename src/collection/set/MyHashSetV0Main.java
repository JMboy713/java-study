package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set.contains(3));

        boolean add = set.add(1);
        System.out.println(add);

        System.out.println(set.contains(1));

    }
}
