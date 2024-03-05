package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 ( key , value)
        // key는 중복을 허용하지 않는다. value는 중복을 허용한다.
        HashMap<String, Integer> map = new HashMap<>();// 이름, 포인트
        // 데이터 추가.
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("정준하", 7);
        System.out.println("총 고객수"+map.size());
        System.out.println("--------------------");
        // 조회
        System.out.println("유재석의 포인트: "+map.get("유재석"));
        System.out.println("박명수의 포인트: "+map.get("박명수"));
        System.out.println("--------------------");
        // 확인
        if (map.containsKey("유재석")){// 키가 있다면
            int point = map.get("유재석");
            map.put("유재석",++point);
            System.out.println("유재석의 누적 포인트는 "+map.get("유재석"));
        }else{
            map.put("유재석",1);
            System.out.println("신규 등록 되었습니다.");
        }
        System.out.println("--------------------");
        // 삭제
        map.remove("정준하");
        System.out.println(map.get("정준하"));
        System.out.println("총 고객수 : "+map.size());

        // 전체 삭제
        map.clear();
        if (map.isEmpty()){
            System.out.println("비어있음");
            System.out.println("가게 문 닫습니다.");
        }
        System.out.println("--------------------");

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("정준하", 7);
        for (String s : map.keySet()) {
            System.out.println(s);// 순서 보장 없음
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> object : map.entrySet()) {
            System.out.println(object.getKey()+" : "+object.getValue());
        }

        for (String s : map.keySet()) {
            System.out.println(s+" : "+map.get(s));//다음과 같이 사용할 수 도 있으나 entrySet을 쓰자.
        }
        // 맵 : 중복X 순서 X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);

        // 값을 덮어쓴다.
        for (String s : map.keySet()) {
            System.out.println(s+" : "+map.get(s));
        }
        System.out.println("--------------------");

        // 순서를 보장하고 싶을 경우 LinkedHashMap을 사용한다.
        // LinkedHashMap은 key 값 기준으로

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("유재석", 10);
        linkedHashMap.put("박명수", 5);
        linkedHashMap.put("정준하", 7);
        for (String s : linkedHashMap.keySet()) {
            System.out.println(s+" : "+linkedHashMap.get(s));
        }

    }
}
