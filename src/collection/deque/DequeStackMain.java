package collection.deque;

import java.util.ArrayDeque;

public class DequeStackMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        System.out.println(deque);

        //  데이터 탐색
        System.out.println(deque.peek());
        // 데이터 꺼내기
        System.out.println(deque.pop());

    }
}
