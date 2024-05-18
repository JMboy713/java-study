package collection.array;

import java.util.ArrayList;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        ArrayList<Integer> integers = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add("a");
        System.out.println(list);


        Integer num1 = (Integer) list.get(0);
        Integer num2 = (Integer) list.get(1);

        // ClassCastException
        Integer inte = (Integer) list.get(2);


    }
}
