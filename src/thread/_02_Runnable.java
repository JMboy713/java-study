package thread;

import thread.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // 하나의 프로세스 ( process ) -> 여러개의 스레드를 가질 수 있다. 일반적으로 1개의 쓰레드만 가진다.
        // thread : 실행 가능한

        // 1 3 5 7 9
        // 2 4 6 8 10
        CleanRunnable cleanRunnable = new CleanRunnable(); // 객체 생성
        Thread thread = new Thread(cleanRunnable);// thread 객체 생성
        thread.start(); // start() -> run() 호출 // thread 시작
        cleanByBoss(); // 여러 일을 한꺼번에 처리할 수 있다.
    }
    public static void cleanByBoss(){
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장)" + i + "번방 청소중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
