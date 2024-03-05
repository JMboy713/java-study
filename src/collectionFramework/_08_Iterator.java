package collectionFramework;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 - 커서를 움직여 가면서 인덱스의 값을 가져오는것. (컬렉션 프레임워크에서 사용)
        List<String> list = new ArrayList<>(); // list는 interface, ArrayList는 class
//        List<String> list2 = new LinkedList<>();
        list.add("유재석");
        list.add("(알수없음)");
        list.add("조세호");
        list.add("(알수없음)");
        list.add("김종국");
        list.add("(알수없음)");
        list.add("박명수");
        list.add("(알수없음)");
        list.add("강호동");
        list.add("(알수없음)");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        Iterator<String> iterator = list.iterator();// 맨첨으로 커서가 가있음.
        System.out.println(iterator.next());// 유재석
        System.out.println(iterator.next());//
        System.out.println(iterator.next());//
        System.out.println(iterator.next());//
        System.out.println("--------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("(알수없음)")) {
                iterator.remove();// 삭제
            }
        }
        System.out.println("--------------------");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("조세호");
        set.add("김종국");
        set.add("박명수");
        System.out.println("--------------------");
        Iterator<String> iterator1 = set.iterator(); // 순서가 없다.
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("--------------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("조세호", 5);
        Iterator<String> iterator2 = map.keySet().iterator(); // map은 key나 value 둘중 하나만 iterator 가능.
        while (iterator2.hasNext()) {
            String key = iterator2.next();
            System.out.println(key);

    }
        Iterator<Integer> iterator3 = map.values().iterator(); // map은 key나 value 둘중 하나만 iterator 가능.
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        System.out.println("--------------------");

        Iterator<Map.Entry<String, Integer>> iterator4 = map.entrySet().iterator();
        while (iterator4.hasNext()) {
            Map.Entry<String, Integer> entry = iterator4.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
