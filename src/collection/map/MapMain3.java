package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA", 80);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("studentA")){
            studentMap.put("studentA", 90);
        }
        System.out.println( studentMap);

        studentMap.putIfAbsent("studentA", 90);
        studentMap.putIfAbsent("studentB", 90);
        System.out.println("studentMap = " + studentMap);


    }
}
