package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // linked list 배열 생성
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();// 각 버킷에 linked list 생성
        }
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 3);
        add(buckets, 4);
        add(buckets, 14);
        add(buckets, 9);
        add(buckets, 99);

        System.out.println(Arrays.toString(buckets));

        // 검색
        int searchValue = 14;
        boolean contains = contains(buckets, searchValue);
        System.out.println(searchValue + " : " +contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(!bucket.contains(searchValue)) {
            bucket.add(searchValue); // 없다면 추가.
        }
    }
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    static int hashIndex(int searchValue) {
        return searchValue % CAPACITY;
    }
}
