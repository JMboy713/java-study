package collectionFramework.quiz;

import java.util.ArrayList;

public class Quiz9 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("김지민", "java"));
        list.add(new Student("강안수", "java"));
        list.add(new Student("하민수", "python"));
        list.add(new Student("김한경", "javascript"));
        list.add(new Student("김종윤", "typescript"));
        for (Student student : list) {
            System.out.println(student.getName() + " studied programming language : " + student.getLanguage());
        }

        System.out.println("--------------------------");
        System.out.println("자바 자격증을 보유한 학생");
        for (Student student : list) {
            if(student.getLanguage().equals("java")){
                System.out.println(student.getName() + " is a java programmer");
            }
        }
    }
}
