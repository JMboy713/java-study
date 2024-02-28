package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1 의 1~3번 가져오기 - 420
        print(list1, list2);
        Collections.sort(list1); // list1 정렬
        Collections.sort(list2); // list2 정렬
        print(list1, list2);
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // list1이 list2를 포함하고 있는가?
        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 3번째에 A 추가
        print(list1, list2);
        list2.set(3, "AA");
        print(list1, list2);
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2)); // list1과 list2의 중복된 부분만 남김( 공통부분만 남기고 삭제한다)
        print(list1, list2);
        //list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        // 앞에서부터 삭제할 경우, 리스트의 빈공간을 매꾸기 위해 변수가 계속해서 이동해야 하므로 뒤에서부터 삭제하는 것이 좋다.
        print(list1, list2);


    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println();
    }

}
