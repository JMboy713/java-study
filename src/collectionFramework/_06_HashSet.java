package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // SET
        // 중복을 허용하지 않는다. 또한 순서가 없다.
        // 순서가 없기 때문에 인덱스가 없다. 따라서 get() 메소드가 없다.
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("꺳잎");
        set.add("상추");
        set.add("삼겹살");
        System.out.println("총 구매 상품 수: " + set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        if (set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("총 구매 상품 수: " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수"+set.size());
        // 전체 삭제
        set.clear();
        if (set.isEmpty()){
            System.out.println("비어있음");
            System.out.println("집으로 출발");
        }
        System.out.println("--------------------");
        // 세트는 중복 허용 x 순서 x
        HashSet<Integer> intSet = new LinkedHashSet<>(); // linkedhashset은 순서는 보장
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        for (Integer i : intSet) {
            System.out.println(i);
        }






    }
}
