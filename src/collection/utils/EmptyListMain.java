package collection.utils;

import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        List<Object> list = Collections.emptyList();
        List<Object> objects = List.of();
        System.out.println("list = " + list.getClass());
        System.out.println("objects = " + objects.getClass());
    }
}
