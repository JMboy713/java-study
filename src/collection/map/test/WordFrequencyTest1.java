package collection.map.test;

import javax.swing.*;
import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");
        HashMap<String, Integer> frequency = new HashMap<>();
//        for (String word : words) {
//            if(frequency.containsKey(word)){
//                frequency.put(word, frequency.get(word)+1);
//            }else{
//                frequency.put(word, 1);
//            }
//
//        }
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        System.out.println(frequency);

    }
}
