package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));// 참조값이 다르다.

        set.add(m1);
        set.add(m2);
        System.out.println(set); // 데이터가 중복으로 들어가버림., 해시코드는 같아서 같은 인덱스에 들어감.
        // 검색 실패
        Member a = new Member("A");
        System.out.println(set.contains(a));// 못찾음

    }
}
