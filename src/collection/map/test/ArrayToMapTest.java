package collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"java","10000"},{"spring","20000"},{"jsp","30000"}};
        
        // 2차원 배열을 Map으로 변환
        HashMap<String, Integer> productMap = new HashMap<>();
        for (String[] strings : productArr) {
            productMap.put(strings[0], Integer.valueOf(strings[1]));
        }

        for (String s : productMap.keySet()) {
            System.out.println("제품: "+s+", 가격: "+productMap.get(s));
        }
    }
}
