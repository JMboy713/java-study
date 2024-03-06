package thread;

public class Quiz {
    public static void main(String[] args) {

        Runnable thread1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A :" + i + "번 상품 준비 중");
            }
            System.out.println("--A 상품 준비 완료--");
        };
        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("B :" + i + "번 상품 준비 중");
                }
                System.out.println("--B 상품 준비 완료--");
            }
        };

        Runnable thread3 = ()->{
            System.out.println("== 세트 상품 준비 시작 ==");
            for (int i =1; i < 6; i++) {
                System.out.println("세트 상품 포장 "+i+"/5");
            }
            System.out.println("== 세트 상품 포장 완료 ==");
        };


        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("== 세트 상품 준비 시작 ==");
//        for (int i =1; i < 6; i++) {
//            System.out.println("세트 상품 포장 "+i+"/5");
//        }
//        System.out.println("== 세트 상품 포장 완료 ==");

//        while (t1.isAlive() || t2.isAlive()) {
//
//        } --> join a,b 와 같은 효과
        t3.start();

        System.out.println(t1.isAlive());// 쓰레드가 돌아가고 있는지 확인하는 메서드



    }
}






