package thread;

import thread.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable(); // 객체 생성
        Thread thread = new Thread(cleanRunnable);// thread 객체 생성
        thread.start(); // start() -> run() 호출 // thread 시작
        try {
            thread.join(2500); // thread 가 종료될 때까지 기다린다. 다 끝난 후 다음 작업을 진행한다.
            // 시간 정보를 주게 되면 그 시간이 지나면 다음 작업을 진행한다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss();
    }
    public static void cleanByBoss(){
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장)" + i + "번방 청소중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
