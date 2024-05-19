package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }

//        int sum = 0;
//        for (Integer i : list) {
//            sum += i;
//        }
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("입력한 정수의 합계 : "+ sum);
        System.out.println("입력한 정수의 평균: "+ (double) sum/list.size());

    }
}
