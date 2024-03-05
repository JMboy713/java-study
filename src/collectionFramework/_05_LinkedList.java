package collectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회( 인덱스)
        System.out.println("첫번째 학생: " + list.get(0));
        System.out.println("두번째 학생: " + list.get(1));
        System.out.println(list.getFirst()); // 첫번째 가져오기
        System.out.println(list.getLast()); // 마지막 가져오기

        // 추가
        list.addFirst("이효리");//  맨 위로 추가.
        System.out.println("--------------------------");

        for (String s : list) {
            System.out.println(s);
        }

//        list.addLast("김희철");
        System.out.println("--------------------------");
        list.add(2, "김구라");// 특정 인덱스에 추가 가능.
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------------");
        // 삭제
        System.out.println("남은 학생수 (제외전) " + list.size());
        list.remove("박명수");
//        list.remove(list.size() - 1); 마지막 학생 제외

        list.removeFirst();// 첫학생 삭제
        list.removeLast();// 마지막 학생 삭제
        System.out.println("남은 학생수 (제외후) " + list.size());
        System.out.println("--------------------------");

        // 변경
        list.set(0, "이수근");
        System.out.println(list.get(0));
        System.out.println("--------------------------");
        System.out.println(list.indexOf("김종국"));
        System.out.println(list.contains("김종국"));

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("비어있음");
        }
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        System.out.println("--------------------------");
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(Collections.binarySearch(list, "조세호"));
    }
}
