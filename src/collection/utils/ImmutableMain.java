package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);

        // 가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(integers);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println(mutableList.getClass());

        List<Integer> unmodifiableList = Collections.unmodifiableList(integers);
        System.out.println("unmodifiableList = " + unmodifiableList.getClass());

    }
}
