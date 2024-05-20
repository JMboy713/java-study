package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));// 참조값이 다르다.

        set.add(m1);
        set.add(m2);
        System.out.println(set); // 데이터가 중복으로 들어가버림., 해시코드는 같아서 같은 인덱스에 들어감.
        // 검색 실패
        MemberOnlyHash a = new MemberOnlyHash("A");
        System.out.println(set.contains(a));// 못찾음

    }
}
