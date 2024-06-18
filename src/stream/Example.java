//package stream;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//import java.util.stream.*;
//public class Example {
//    public static void main(String[] args) {
//        /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> stream = list.stream(); // list를 소스로 하는 컬렉션 생성.
//        stream.forEach(n-> System.out.println(n));*/
//        boolean aaa = Solution.solution("aaa");
//    }
//
//
//
//}
//class Solution {
//    boolean solution(String s) {
//        int count = s.toLowerCase().chars() // 소문자로 변환후 intStream으로
//                .map(c -> c == 'p' ? 1 : c == 'y' ? -1 : 0)
//                .sum();
//
//        return count == 0;
//    }
//}
