package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        addIndex(arr, 1, 3);
        addLast(arr, 4);
        addFirst(arr, 0);
        System.out.println(Arrays.toString(arr));

    }
    private static void addFirst(int[] arr, int value) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }// 뒤에서 부터 앞의 값을 끌어옴
        arr[0] = value;
    }
    private static void addLast(int[] arr, int value) {
        arr[arr.length - 1] = value;
    }

    private static void addIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
}
