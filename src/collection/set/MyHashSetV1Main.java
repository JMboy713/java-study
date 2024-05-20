package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(99);
        set.add(9);
        System.out.println(set);
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println(searchValue + " : " + contains);

        boolean remove = set.remove(9);
        System.out.println("remove = " + remove);
        System.out.println(set);


    }
}
