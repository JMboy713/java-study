package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(inputArr));

        for (Integer i : linkedHashSet) {
            System.out.println(i);
        }


    }
}
