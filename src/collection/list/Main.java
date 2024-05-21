package collection.list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
//        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(50_000);




    }
}
