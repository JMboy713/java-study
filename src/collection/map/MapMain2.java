package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("a", 80);
        System.out.println(studentMap);

        studentMap.put("a", 70);
        System.out.println(studentMap);

        boolean a = studentMap.containsKey("a");
        System.out.println("a = " + a);

        // 특정 학생 값 삭제
        studentMap.remove("a");
        System.out.println(studentMap);

    }
}
