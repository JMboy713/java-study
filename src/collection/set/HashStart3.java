package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[100];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }
        System.out.println(Arrays.toString(integers));

        int searchValue = 3;
        Integer integer = integers[searchValue];
        System.out.println(integer);
    }
}
