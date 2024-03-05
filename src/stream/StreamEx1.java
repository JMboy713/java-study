package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class StreamEx1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("이자바", 500));
        students.add(new Student("김자바", 400));
        students.add(new Student("박자바", 300));

        System.out.println(students);

        Collections.sort(students,(s1,s2)->Integer.compare(s1.getScore(),s2.getScore()));
        System.out.println(students);

        /*
        * public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }*/
    }
}
