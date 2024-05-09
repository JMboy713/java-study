package enumeration.quiz;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요.[GUEST,LOGIN,ADMIN]");
        String s = scanner.nextLine();
        System.out.println();
        AuthGrade grade = AuthGrade.valueOf(s.toUpperCase());
        System.out.println("당신의 등급은 "+grade.getDescription()+"입니다.");
        System.out.println("==메뉴 목록==");
        if (grade.name() == "GUEST") {
            System.out.println("-메인 화면");
        } else if (grade.name() == "LOGIN") {
            System.out.println("-메인 화면");
            System.out.println("-이메일 관리 화면");
        } else if (grade.name() == "ADMIN") {
            System.out.println("-메인 화면");
            System.out.println("-이메일 관리 화면");
            System.out.println("-회원 관리 화면");
        }


    }
}
