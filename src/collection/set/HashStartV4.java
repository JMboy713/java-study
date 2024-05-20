package collection.set;

import java.util.Arrays;

public class HashStartV4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        System.out.println(hashIndex(1));
        System.out.println(hashIndex(2));
        System.out.println(hashIndex(5));
        System.out.println(hashIndex(6));
        System.out.println(hashIndex(8));

        Integer[] arr = new Integer[CAPACITY];
        add(arr, 1);
        add(arr, 2);
        add(arr, 5);
        add(arr, 6);
        add(arr, 14);
        add(arr, 99);
        System.out.println(Arrays.toString(arr));

        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println(arr[hashIndex]);

    }

    private static void add(Integer[] arr, int i) {
        int hashIndex = hashIndex(i);
        arr[hashIndex] = i;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
