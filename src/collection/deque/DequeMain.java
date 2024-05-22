package collection.deque;

import java.util.ArrayDeque;

public class DequeMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // 데이터 꺼내기
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
