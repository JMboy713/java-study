package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());// 위에 뭐가 있는지 확인만.
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
