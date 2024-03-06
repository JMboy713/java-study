package thread;

import thread.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        }; // 객체 생성

        Runnable cleaner2 = () ->{
            System.out.println("직원2 청소 시작");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");
            }
            System.out.println("-- 직원2 청소 끝 --");
        }; // 객체 생성

        // 두개의 스레드에서 하나의 객체에 접근해서 처리하려고 할 때 -> 진입을 못하게 동기화가 필요하다.
        Thread thread1 = new Thread(cleaner1);
        Thread thread2 = new Thread(cleaner2);
        thread1.start();
        thread2.start();

    }
}
