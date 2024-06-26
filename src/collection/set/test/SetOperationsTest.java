package collection.set.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        HashSet<Integer> union = new HashSet<>();
        ArrayList<Integer> inter = new ArrayList<>();
        ArrayList<Integer> diff = new ArrayList<>();


        union.addAll(set1);
        union.addAll(set2);
        System.out.println("합집합: "+union);

        Set<Integer> intersectoin = new HashSet<>(set1);
        intersectoin.retainAll(set2);
        System.out.println(intersectoin);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);



        for (Integer i : set1) {
            if(set2.contains(i)) {
                inter.add(i);
            }else{
                diff.add(i);
            }
        }
        System.out.println("교집합: "+inter);
        System.out.println("차집합: "+diff);



    }
}
