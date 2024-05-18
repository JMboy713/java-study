package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // index 입력 : O(1)
        System.out.println("== index 입력 : O(1) ==");
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // index 조회 : O(1), index 수정 : O(1)

        // 검색 : O(n)
        System.out.println("== 검색 : O(n) ==");
        System.out.println(Arrays.toString(arr));
        int value = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i] == value) {
                System.out.println("찾았다!");
                break;
            }

        }
    }
}
