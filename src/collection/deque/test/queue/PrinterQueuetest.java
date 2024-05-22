package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueuetest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();
        Queue<String> objects = new LinkedList<>();

        printQueue.add("doc1");
        printQueue.add("doc2");
        printQueue.add("doc3");
        printQueue.offer("doc4");

        objects.offer("a");


        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
        System.out.println(printQueue.poll());
    }
}
