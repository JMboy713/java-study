package collectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        int[] array = new int[3];
        array[0] = 10;// 배열은 크기가 고정.
        // 컬렉션 프레임워크는 크기가 가변적이다.
        ArrayList<String> list = new ArrayList<>(); // ArrayList는 객체만 들어갈 수 있다.

        // 데이터 추가.
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회.
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("--------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 데이터 삭제.

        list.remove("박명수");
        System.out.println("이사 후 신청 학생수: "+list.size());
        System.out.println(list.get(3)); // 박명수 삭제 후 강호동

        System.out.println("남은 학생수 (제외 전) : "+list.size()); //4
        list.remove(list.size()-1);
        System.out.println("남은 학생수 (제외 후) : " + list.size());//3
        System.out.println("--------------------");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");
        // 변경 ( 수강권 양도)
        list.set(0, "이효리");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        // 확인
        System.out.println(list.indexOf("김종국"));// 몇번째인지
        System.out.println(list.contains("김종국"));// 포함되어 있는지
        if (list.contains("김종국")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }
        System.out.println("--------------------");
        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println(list.size()+"명 수강생");
        }

        System.out.println("--------------------");
        // 다음 학기에 새로운 시작.
        list.add("이효리");
        list.add("유재석");
        list.add("강호동");
        list.add("이광수");
        list.add("김종국");
        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }



    }
}
