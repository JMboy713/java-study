package thread;

import thread.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 ( process ) -> 여러개의 스레드를 가질 수 있다. 일반적으로 1개의 쓰레드만 가진다.
        // thread : 실행 가능한

        // 1 3 5 7 9
        // 2 4 6 8 10
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run();
        cleanThread.start(); // start() -> run() 호출 // thread 시작
        cleanByBoss(); // 여러 일을 한꺼번에 처리할 수 있다.



    }
    public static void cleanBySelf(){
        System.out.println("cleanBySelf");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자)" + i + "번방 청소중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }
    public static void cleanByBoss(){
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장)" + i + "번방 청소중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }

}

