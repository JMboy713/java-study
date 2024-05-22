package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        ArrayList<String> str = new ArrayList<>();
        for (String name: map.keySet()) {
            if (map.get(name) == 1000) {
                str.add(name);
            }}
        System.out.println(str);
        }

    }

