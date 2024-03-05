package generics;

import java.lang.reflect.Array;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        int [] iArray = {1,2,3,4,5};
        Integer [] iArray2 = {1,2,3,4,5};
        double [] dArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String [] sArray = {"one", "two", "three", "four", "five"};

        pringIntArray(iArray);
        pringDoubleArray(dArray);
        pringStringArray(sArray);

        // 제네릭스 사용
        // T : 타입을 의미.

        printAnyArray(iArray2); // wrapper class 를 넣어야 가능함.


    }
    private static <T> void printAnyArray(T[] array){
        for(T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private static void pringStringArray(String[] sArray) {
        for(String i : sArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void pringDoubleArray(double[] dArray) {
        for(double i : dArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void pringIntArray(int[] iArray) {
        for(int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
