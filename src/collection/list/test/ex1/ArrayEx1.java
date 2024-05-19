package collection.list.test.ex1;

import java.util.ArrayList;

public class ArrayEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> students  = new ArrayList<>();

        for (int i = 90; i >=50 ; i-=10) {
            students.add(i);
        }
        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }
        double avg = (double) total / students.size();
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}
