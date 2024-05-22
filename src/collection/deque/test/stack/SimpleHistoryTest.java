package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Iterator;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }

    }
}
