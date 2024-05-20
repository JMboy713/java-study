package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));// 참조값이 다르다.

        set.add(m1);
        set.add(m2);
        System.out.println(set); // 데이터가 중복으로 들어가버림.
        // 검색 실패
        MemberNoHashNoEq a = new MemberNoHashNoEq("A");
        System.out.println(set.contains(a));// 못찾음

    }
}
