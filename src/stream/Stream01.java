package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        // 스트림
        // 컬렉션, 배열 등의 저장 요소를 하나씩 참조하여 람다식으로 처리할 수 있도록 해주는 반복자

        // Arrays.stream
        int[] scores = {10, 20, 30, 40, 50,90,100, 80, 70, 60};
        IntStream scorestream = Arrays.stream(scores);
        String[] langs = {"java", "python", "javascript","c","c++","c#"};


        // 컬렉션 요소를 stream으로 바로 만드는 방법
        Stream<String> langStream = Arrays.stream(langs);
        List<String> langlist = new ArrayList<>();
//        langlist.add("java");
//        langlist.add("python");
        langlist= Arrays.asList("java", "python", "javascript","c","c++","c#");// add 와 같은 기능
//        System.out.println(langlist.size());
        Stream<String> langListStream = langlist.stream();


        // stream.of 메서드를 사용하여 스트림 생성
        Stream<String> langListOfStream = Stream.of("java", "python", "javascript");



        // stream 사용
        // 중간 연산 ( Intermediate Operation )
        // map, filter, sorted, distinct, limit, skip, peek, parallel, sequential, unordered

        // 최종 연산 ( Terminal Operation )
        // forEach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny

        Arrays.stream(scores).filter(n -> n>=90).forEach(n -> System.out.println(n));
        System.out.println("===================================");
        Arrays.stream(scores).filter(n -> n>=90).forEach(System.out::println);// 클래스명 :: 메서드명
        System.out.println("===================================");
        // 90점 이상인 사람의 수
        long count =  Arrays.stream(scores).filter(n -> n >= 90).count(); // count 의 반환형 long
        System.out.println(count);
        System.out.println("===================================");
        // 90점 이상인 사람의 총점
        int sum = Arrays.stream(scores).filter(n -> n >= 90).sum();
        System.out.println(sum);
        System.out.println("===================================");

        // 90점 이상인것들 정렬해서 보여주기
        Arrays.stream(scores).filter(n -> n >= 90).sorted().forEach(System.out::println);
        System.out.println("===================================");
        // 문자열 처리
        Arrays.stream(langs).filter(x->x.startsWith("c")).forEach(System.out::println);
        System.out.println("===================================");
        Arrays.stream(langs).filter(x->x.contains("java")).sorted().forEach(System.out::println);
        System.out.println("===================================");
        // 4글자 이하의 언어를 정렬해서 출력
        langlist.stream().filter(x->x.length()<=4).sorted().forEach(System.out::println);
        System.out.println("===================================");
        // 그중 c언어 포함
        langlist.stream().filter(x->x.length()<=4&x.contains("c")).sorted().forEach(System.out::println);
        System.out.println("===================================");
        // c 단어 포함 여부 확인
        boolean result = langlist.stream()
                .filter(x->x.length()<=4)
                .anyMatch(x->x.contains("c"));// anymatch 는 하나라도 만족하면 true, allmatch 는 모두 만족해야 true
        System.out.println(result);
        System.out.println("===================================");
        // c 단어 포함 여부 확인, 4글자 이하의 언어들은 모드 c라는 글자를 포함하는지 여부
        boolean result2 = langlist.stream()
                .filter(x->x.length()<=4)
                .allMatch(x->x.contains("c"));// anymatch 는 하나라도 만족하면 true, allmatch 는 모두 만족해야 true
        System.out.println(result2);
        System.out.println("===================================");

        // 4글자 이하의 언어중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 추가해서 출력
        // map 은 스트림의 요소를 다른 요소로 대체하는 중간 연산
        langlist.stream()
                .filter(x->x.length()<=4&x.contains("c"))
                .map(x->x+"(어려워요)")
                .forEach(System.out::println);

        System.out.println("===================================");
        // 대문자로 바꿔서 출력
        langlist.stream()
                .filter(x->x.length()<=4&x.contains("c"))
//                .map(x->x.toUpperCase()+"(어려워요)")
                .map(String::toUpperCase)
                .map(x->x+"(어려워요)")
                .forEach(System.out::println);

        System.out.println("===================================");

        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langlist.stream()
                .filter(x -> x.length() <= 4 & x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(langListStartsWithC);

        System.out.println("===================================");
        langListStartsWithC.stream().forEach(System.out::println);

    }
}
