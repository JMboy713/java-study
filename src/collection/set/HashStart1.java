package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[4];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        System.out.println(Arrays.toString(integers));
        int searchValue = 3;
        for (Integer integer : integers) {
            if (integer == searchValue) {
                System.out.println("Found " + searchValue);
                break;
            }
        }
    }
}
