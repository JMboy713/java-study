package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser a = new MyUser("a", 30);
        MyUser b = new MyUser("b", 20);
        MyUser c = new MyUser("c", 10);

        MyUser[] array = {a, b, c};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparator 비교");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("ID정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("ID정렬 reverse");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));

    }
}
